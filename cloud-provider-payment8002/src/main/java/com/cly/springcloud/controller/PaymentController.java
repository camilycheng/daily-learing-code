package com.cly.springcloud.controller;

import com.cly.springcloud.entities.CommonResult;
import com.cly.springcloud.entities.Payment;
import com.cly.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentController
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @PostMapping("/addpayment")
    public CommonResult creatPayment(@RequestBody Payment payment){

        int i=paymentService.create(payment);
        if(i>0){
            return  new CommonResult(200,"成功",i);
        }else{
            return  new CommonResult(4000,"失败" ,null);
        }
    }

    @GetMapping("/queryPaymet/{id}")
    public CommonResult queryPayment(@PathVariable("id") Long id){

        log.info("123344");
        Payment payment=paymentService.getPaymentById(id);

        if(null!=payment){
            return new CommonResult(200,"成功",payment);
        }else{
            return new CommonResult(4000,"失败",null);
        }
    }

}
