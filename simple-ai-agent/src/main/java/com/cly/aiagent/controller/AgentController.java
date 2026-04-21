package com.cly.aiagent.controller;

import com.cly.aiagent.model.AgentRequest;
import com.cly.aiagent.model.AgentResponse;
import com.cly.aiagent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/agent")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/chat")
    public Map<String, Object> chat(@RequestBody AgentRequest request) {
        Map<String, Object> result = new HashMap<>();
        
        if (request.getQuery() == null || request.getQuery().trim().isEmpty()) {
            result.put("code", 400);
            result.put("message", "请输入问题");
            return result;
        }
        
        AgentResponse response = agentService.chat(request);
        result.put("code", 200);
        result.put("message", "成功");
        result.put("data", response);
        
        return result;
    }

    @GetMapping("/quick")
    public Map<String, Object> quickAnswer(@RequestParam String query) {
        Map<String, Object> result = new HashMap<>();
        
        if (query == null || query.trim().isEmpty()) {
            result.put("code", 400);
            result.put("message", "请输入问题");
            return result;
        }
        
        AgentResponse response = agentService.quickAnswer(query);
        result.put("code", 200);
        result.put("message", "成功");
        result.put("data", response);
        
        return result;
    }

    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "AI Agent 服务正常运行");
        result.put("status", "UP");
        return result;
    }
}
