package com.cly.springcloud.dao;

import com.cly.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: spring-test
 * @Package: com.cly.springcloud.dao
 * @ClassName: PaymentDao
 * @Description:
 * @Date: 2020/11/12 22:17
 * @Version: 1.0
 */

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);

}
