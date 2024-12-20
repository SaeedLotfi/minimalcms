package com.saeed.minimalcms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    private static final Logger logger = LoggerFactory.getLogger(ServiceAspect.class);

    // Pointcut for all methods @Service
    @Before("within(@org.springframework.stereotype.Service *)")
    public void logBefore(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        logger.info(String.format("Method %s is about to be invoked.", name));
    }

    // Pointcut for all methods @Service
    @After("within(@org.springframework.stereotype.Service *)")
    public void logAfter(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        logger.info(String.format("Method %s was invoked.", name));
    }
}
