package com.dubbo.springboot.producer.customize.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by huangjh on 2019/6/16.
 */
@Aspect
@Component
public class AopAspect {
    @Pointcut("execution(public * com.dubbo.springboot.producer.service.DemoServiceImpl.*(..)) && @annotation(com.dubbo.springboot.producer.customize.annotation.MyAopannotation)")
    public void addAdvice(){}

    @Before("addAdvice()")
    public void beforeMETHOD(JoinPoint pjp){
        System.out.printf("马上调用方法"+pjp.getSignature().getName());
    }
}
