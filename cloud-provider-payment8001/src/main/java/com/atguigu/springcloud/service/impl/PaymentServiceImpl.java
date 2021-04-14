package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.repository.PaymentRepository;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentRepository paymentRepository;

    @Override
    public CommonResult create(Payment payment) {
        int result =  paymentRepository.create(payment);
        log.info("*****insert result: " + result);
        if(result>0){
            return new CommonResult(200, "success", result);
        }else {
            return new CommonResult(404, "fail");
        }
    }

    @Override
    public CommonResult getPaymentById(Long id) {
        Payment result = paymentRepository.getPaymentById(id);
        log.info("*****select result: " + result);
        if(result != null) {
            return new CommonResult(200, "success", result);
        }else{
            return new CommonResult(404, "no result,id: " + id);
        }
    }
}
