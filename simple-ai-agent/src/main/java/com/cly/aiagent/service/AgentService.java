package com.cly.aiagent.service;

import com.cly.aiagent.agent.SimpleAIAgent;
import com.cly.aiagent.model.AgentRequest;
import com.cly.aiagent.model.AgentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgentService {

    @Autowired
    private SimpleAIAgent aiAgent;

    @Autowired
    private DeepSeekService deepSeekService;

    @Value("${agent.useDeepSeek:false}")
    private boolean useDeepSeek;

    public AgentResponse chat(AgentRequest request) {
        if (useDeepSeek) {
            String answer = deepSeekService.chat(request.getQuery(), request.getContext());
            List<String> relatedQuestions = new ArrayList<>();
            relatedQuestions.add("还有其他问题吗？");
            relatedQuestions.add("需要进一步解释吗？");
            return new AgentResponse(answer, relatedQuestions, "高");
        } else {
            return aiAgent.process(request.getQuery(), request.getContext());
        }
    }

    public AgentResponse quickAnswer(String query) {
        if (useDeepSeek) {
            String answer = deepSeekService.chat(query, null);
            List<String> relatedQuestions = new ArrayList<>();
            relatedQuestions.add("还有其他问题吗？");
            relatedQuestions.add("需要进一步解释吗？");
            return new AgentResponse(answer, relatedQuestions, "高");
        } else {
            return aiAgent.process(query, null);
        }
    }
}
