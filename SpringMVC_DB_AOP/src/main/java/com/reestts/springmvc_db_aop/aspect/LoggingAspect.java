package com.reestts.springmvc_db_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* com.reestts.springmvc_db_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        System.out.println("Start method: " + methodSignature.getName());
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("Finish method: " + methodSignature.getName());

        return targetMethodResult;
    }
}
