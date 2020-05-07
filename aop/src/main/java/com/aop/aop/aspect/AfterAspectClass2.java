package com.aop.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//the process of implementing the pointcut at a correct time is known as weaving

//Combination of PointCut and Advice is Aspect
//Tell Spring that this class belongs to AOP
//Tell class that this class is a component
@Aspect
@Configuration
public class AfterAspectClass2 {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method call i want to intercept
	// execution ( PACKAGE.*.*(..))
	// below is the PointCut
	
	//@AfterReturning(value = "execution (* com.aop.aop.bussiness.*.*(..))", returning = "result")
	@AfterReturning(value = "com.aop.aop.aspect.CommonJoinPointConfig.bussinessLayer()", returning = "result")
	public void afterReturning(/* Joinpoint joinPoint ,*/Object result) {
		// Below is the advice
		logger.info("Check for user Access with the result {}", result);
	}

	@AfterThrowing(value = "com.aop.aop.aspect.CommonJoinPointConfig.bussinessLayer()", throwing = "result")
	public void afterThrowing(/* Joinpoint joinPoint ,*/Object result) {
		// Below is the advice
		logger.info("Check for user Access with the result {}", result);
	}
	
	@AfterReturning(value = "com.aop.aop.aspect.CommonJoinPointConfig.bussinessLayer()")
	public void after(/* Joinpoint joinPoint ,*/) {
		// Below is the advice
		logger.info("Check for user Access with the result {}");
	}
	
}
