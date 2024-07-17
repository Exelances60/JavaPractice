package com.enes.jobapplication.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.enes.jobapplication.service.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        System.out.println("----------------------------------- Logging Aspect -----------------------------------" );
        LOGGER.info("Method called: {}", joinPoint.getSignature().getName());
        LOGGER.info("Method arguments: {}", Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "execution(* com.enes.jobapplication.service.*.*(..))", returning = "result")
    public void logMethodReturn(JoinPoint joinPoint, Object result) {
        LOGGER.info("Method returned: {}", result);
    }

    @AfterThrowing(pointcut = "execution(* com.enes.jobapplication.service.*.*(..))", throwing = "exception")
    public void logMethodException(JoinPoint joinPoint, Exception exception) {
        LOGGER.error("Method threw exception: {}", exception.getMessage());
    }

    @After("execution(* com.enes.jobapplication.service.*.*(..))")
    public void logMethodExecute(JoinPoint joinPoint) {
        LOGGER.info("Method executed: {}", joinPoint.getSignature().getName());
    }


}
