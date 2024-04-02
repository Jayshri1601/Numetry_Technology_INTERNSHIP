package com.example.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.ServiceImpl.*(..))")
    public void beforeAdvice() {
        System.out.println("Before method execution");
    }
}
