package com.atguigu.springcloud.repository;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentRepository {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
