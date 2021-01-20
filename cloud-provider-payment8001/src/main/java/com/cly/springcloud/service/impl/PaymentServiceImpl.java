package com.cly.springcloud.service.impl;

import com.cly.springcloud.dao.PaymentDao;
import com.cly.springcloud.entities.Payment;
import com.cly.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentServiceImpl
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl  implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){

        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){

        return  paymentDao.getPaymentById(id);
    }

}
