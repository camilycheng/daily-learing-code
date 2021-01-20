package com.cly.springcloud.lb.impl;

import cn.hutool.http.Header;
import com.cly.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: LoadBalancerImpl
 * @Version: 1.0
 */
@Component
@Slf4j
public class LoadBalancerImpl implements LoadBalancer {

    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current=this.atomicInteger.get();
            next=current>=2147483647?0:current+1;
        }
        while(!this.atomicInteger.compareAndSet(current,next) );
        log.info("第几次{}",next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index=getAndIncrement()%serviceInstances.size();

        return serviceInstances.get(index);
    }


}
