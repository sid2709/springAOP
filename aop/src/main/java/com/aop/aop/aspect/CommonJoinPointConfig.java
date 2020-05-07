package com.aop.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution (* com.aop.aop.data.*.*(..))")
	public void dataLayer() {}
	
	@Pointcut("execution (* com.aop.aop.bussiness.*.*(..))")
	public void bussinessLayer() {}
	
	@Pointcut("execution (* com.aop.aop.data.*.*(..)) && execution (* com.aop.aop.bussiness.*.*(..))")
	public void allLayer() {}
	
	//it will be a pointcut for the methods whose beans contains dao that is why *dao* is used that specifies beore and after
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	
	//custom annotation
	@Pointcut("@annotation(com.aop.aop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
