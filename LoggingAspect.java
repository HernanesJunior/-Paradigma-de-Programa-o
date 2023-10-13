package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    @After("execution(void com.example.Compra.realizarCompra())")
    public void logCompra(JoinPoint joinPoint) {
        System.out.println("Registro de compra: " + joinPoint.getSignature());
    }
}
