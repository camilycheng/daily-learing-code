package com.cly.springcloud.controller;

import com.cly.springcloud.entities.CommonResult;
import com.cly.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: OrderController
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    String URL_PAYMENT="http://127.0.0.1:8001";


    @GetMapping("/consumer/creat/payment")
    public CommonResult<Payment> creatPayment(Payment payment){

        return  restTemplate.postForObject(URL_PAYMENT+"/addpayment",payment,CommonResult.class);
    }

    @GetMapping("/consumer/queryPaymet/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        log.info("1234");
        return restTemplate.getForObject(URL_PAYMENT+"/queryPaymet/"+id,CommonResult.class);

    }
}
