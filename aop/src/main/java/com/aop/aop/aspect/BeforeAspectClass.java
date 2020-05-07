package com.aop.aop.aspect;


import org.aopalliance.intercept.Joinpoint;
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
public class BeforeAspectClass {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method call i want to intercept
	//execution ( PACKAGE.*.*(..))
	//below is the PointCut
	
	//The below commented is used when CommonJoinPointConfi class was not defined
	//@Before("execution (* com.aop.aop.data.*.*(..))")
	@Before("com.aop.aop.aspect.CommonJoinPointConfig.dataLayer()")
	public void before(/*Joinpoint joinPoint*/) {
		//Below is the advice
		logger.info("Check for user Access");
	}

}
