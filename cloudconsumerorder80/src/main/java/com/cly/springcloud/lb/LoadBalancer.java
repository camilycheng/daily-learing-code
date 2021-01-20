package com.cly.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName: LoadBalancer
 * @Version: 1.0
 */
public interface LoadBalancer {

    ServiceInstance instances (List<ServiceInstance> serviceInstances);
}
