package com.cly.aiagent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgentResponse {
    private String answer;
    private List<String> relatedQuestions;
    private String confidence;
}
