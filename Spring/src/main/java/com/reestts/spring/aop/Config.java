package com.reestts.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.reestts.spring.aop")
@EnableAspectJAutoProxy
public class Config {

}
