package com.cly.springcloud.service;

import com.cly.springcloud.entities.Payment;

/**
 * @ClassName: PaymentService
 * @Version: 1.0
 */
public interface PaymentService {


    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
