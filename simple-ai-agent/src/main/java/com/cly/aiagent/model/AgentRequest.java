package com.cly.aiagent.model;

import lombok.Data;

@Data
public class AgentRequest {
    private String query;
    private String context;
}
