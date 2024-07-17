package com.enes.jobapplication.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.enes.jobapplication.service.JobService.getJobPostById(..)) && args(id)")
    public Object validateAndUpdate(ProceedingJoinPoint joinPoint, int id) throws Throwable {
        LOGGER.info("Validating ID: {}", id);

        if (id == 0) {
            throw new IllegalArgumentException("ID cannot be 0");
        }

        if (id < 0) {
            id = -id;
            return joinPoint.proceed(new Object[]{id});
        }

        return joinPoint.proceed();
    }
}
