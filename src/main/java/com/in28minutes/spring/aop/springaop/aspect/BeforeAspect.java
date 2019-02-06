package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// what kind of methods call i would intercept
	//execution (* PACKAGE.*.*(..))
	
	@Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void before(JoinPoint joinPoint) {
		// what to do?
		logger.info("Intercepted Method Calls - {}", joinPoint);
	}
}
