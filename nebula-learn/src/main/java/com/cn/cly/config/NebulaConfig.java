package com.cn.cly.config;

import com.sun.javafx.binding.StringFormatter;
import com.vesoft.nebula.client.graph.NebulaPoolConfig;
import com.vesoft.nebula.client.graph.data.HostAddress;
import com.vesoft.nebula.client.graph.net.NebulaPool;
import com.vesoft.nebula.client.graph.net.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.util.stream.Collectors;

@Slf4j
@Configuration
public class NebulaConfig {

    @Bean
    public NebulaPool nebulaPool(NebulaProperties nebulaProperties) throws Exception {
        NebulaPool pool = new NebulaPool();
        NebulaPoolConfig nebulaPoolConfig = new NebulaPoolConfig();
        nebulaPoolConfig.setMaxConnSize(1000);
        boolean init = pool.init(nebulaProperties.getAddress().stream().map(d -> new HostAddress(d.getHost(), d.getPort())).collect(Collectors.toList()), nebulaPoolConfig);
        if (!init){
            throw new RuntimeException("NebulaGraph init err !");
        }else {
            log.info("NebulaGraph init Success ！");
        }
        return pool;
    }

    @Bean
    @Scope(scopeName = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Session session(NebulaPool nebulaPool, NebulaProperties nebulaProperties) {
        try {
            Session session = nebulaPool.getSession(nebulaProperties.getUsername(), nebulaProperties.getPassword(), nebulaProperties.isReconnect());
            session.execute(StringFormatter.concat(NebulaConstant.USE, nebulaProperties.getSpace(), NebulaConstant.SEMICOLON).getValue());
            return session;
        } catch (Exception e) {
            log.error("get nebula session err , {} ", e.toString());
        }
        return null;
    }
}
