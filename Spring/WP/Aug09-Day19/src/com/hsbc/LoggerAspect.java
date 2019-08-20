package com.hsbc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {

	@Before("execution( void set*(*))")
	public void logEntry(JoinPoint point) {
		System.out.println("Entry log");
		String name= point.getSignature().getName();
		Object newValue= point.getArgs()[0];
		Object tar = point.getTarget();
		System.out.println(tar);
		System.out.println(name +" about to change to " + newValue+" on "+point.getTarget());
	}
	
}
