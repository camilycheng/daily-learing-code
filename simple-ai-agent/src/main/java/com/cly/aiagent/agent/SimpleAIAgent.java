package com.cly.aiagent.agent;

import com.cly.aiagent.model.AgentResponse;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SimpleAIAgent {

    private final Map<String, String> knowledgeBase;
    private final Random random;

    public SimpleAIAgent() {
        this.knowledgeBase = initializeKnowledgeBase();
        this.random = new Random();
    }

    private Map<String, String> initializeKnowledgeBase() {
        Map<String, String> kb = new HashMap<>();
        
        kb.put("你好", "你好！我是智能助手，很高兴为您服务！");
        kb.put("hello", "Hello! I'm your AI assistant, nice to help you!");
        kb.put("你是谁", "我是一个简单的 AI Agent，可以回答各种问题！");
        kb.put("天气", "抱歉，我目前无法获取实时天气信息。建议您查看天气应用或网站。");
        kb.put("时间", "让我看看...现在是 " + new Date().toString());
        kb.put("帮助", "我可以：1. 回答基础问题 2. 提供建议 3. 陪您聊天。请告诉我您需要什么帮助？");
        kb.put("再见", "再见！期待下次为您服务！");
        kb.put("thanks", "不客气！还有什么我可以帮助您的吗？");
        kb.put("谢谢", "不客气！还有什么我可以帮助您的吗？");
        
        return kb;
    }

    public AgentResponse process(String query, String context) {
        String answer = findAnswer(query);
        List<String> relatedQuestions = generateRelatedQuestions(query);
        String confidence = calculateConfidence(query);
        
        return new AgentResponse(answer, relatedQuestions, confidence);
    }

    private String findAnswer(String query) {
        String lowerQuery = query.toLowerCase().trim();
        
        for (Map.Entry<String, String> entry : knowledgeBase.entrySet()) {
            if (lowerQuery.contains(entry.getKey().toLowerCase())) {
                return entry.getValue();
            }
        }
        
        return generateFallbackAnswer(query);
    }

    private String generateFallbackAnswer(String query) {
        List<String> fallbacks = Arrays.asList(
            "这是一个很好的问题！关于 \"" + query + "\"，让我思考一下...",
            "关于 \"" + query + "\"，我正在学习中。您能提供更多细节吗？",
            "很有趣的话题！对于 \"" + query + "\"，您想了解哪些方面呢？",
            "\"" + query + "\" 确实是个值得探讨的问题。让我给您一些建议..."
        );
        return fallbacks.get(random.nextInt(fallbacks.size()));
    }

    private List<String> generateRelatedQuestions(String query) {
        List<String> questions = new ArrayList<>();
        
        if (query.contains("你好") || query.contains("hello")) {
            questions.add("你能帮我做什么？");
            questions.add("你有什么功能？");
        } else if (query.contains("时间")) {
            questions.add("今天是星期几？");
            questions.add("现在几点了？");
        } else {
            questions.add("能详细说说吗？");
            questions.add("还有其他问题吗？");
        }
        
        return questions;
    }

    private String calculateConfidence(String query) {
        String lowerQuery = query.toLowerCase().trim();
        
        for (String key : knowledgeBase.keySet()) {
            if (lowerQuery.contains(key.toLowerCase())) {
                return "高";
            }
        }
        
        if (query.length() < 5) {
            return "中";
        }
        
        return "低";
    }
}
