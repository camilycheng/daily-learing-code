package com.cn.cly.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "nebula")
public class NebulaProperties {
    private List<NebulaAddress> address;
    private String username;
    private String password;
    private boolean reconnect;
    private String space;
}