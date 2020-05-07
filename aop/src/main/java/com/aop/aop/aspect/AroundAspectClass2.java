package com.aop.aop.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//the process of implementing the pointcut at a correct time is known as weaving

//Combination of PointCut and Advice is Aspect
//Tell Spring that this class belongs to AOP
//Tell class that this class is a component
@Aspect
@Configuration
public class AroundAspectClass2 {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method call i want to intercept
	// execution ( PACKAGE.*.*(..))
	// below is the PointCut
	
	//@Around("execution (* com.aop.aop.bussiness.*.*(..))")
	@Around("com.aop.aop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(/* Joinpoint joinPoint */ProceedingJoinPoint joinPoint) throws Throwable {
		// Below is the advice
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Total Time taken {}", timeTaken);
	}

}
