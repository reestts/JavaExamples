package com.reestts.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAndSecureAspect {

    @Pointcut("execution(public void getBook())")
    private void cut() {
    }

    @Before("cut()")
    public void beforeGetLogAdvice() {
        System.out.println("beforeGetBookAdvice: get a book");
    }

    @Before("cut()")
    public void beforeGetSecureAdvice() {
        System.out.println("beforeGetSecureAdvice: check access for get book");
    }
}
