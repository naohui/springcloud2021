package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//this is for get set methos
@Data
//this is the all args constructor
@AllArgsConstructor
//this is the none arg constructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer status;
    private String message;
    private T data;

    public CommonResult(Integer status, String message){
        this(status, message, null);
    }
}