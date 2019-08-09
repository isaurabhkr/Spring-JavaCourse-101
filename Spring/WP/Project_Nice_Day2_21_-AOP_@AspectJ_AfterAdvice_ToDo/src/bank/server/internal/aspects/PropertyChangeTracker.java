package bank.server.internal.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

//TODO Make this class as aspect
public class PropertyChangeTracker {
	//TODO make this as re-usable point cut expression(meta expression) to be applied on all updat as well as Set methods of all classes
	void updateORSetMethod(){}
	//TODO make this as point cut expression to be applied to all getters of all classes but 
	// not for getters of bank.server.internal.BankImpl.get*(*)
	void getMethodAdvice(){}
	@Order(value=2)
	
	//ToDO  make it before advice for updateORSet point cut
	void trackChange(JoinPoint jp){
		String methodName = jp.getSignature().getName();
		Object newValue  = jp.getArgs()[0];
		System.out.println("trackchange method of PropertyChangeTracker1  invoked for method "+methodName);
		System.out.println("1 Property About to change to "+newValue);
	}
	//TODO make it after advice for updateOrSet point cut
	void trackChange2(JoinPoint jp){
		String methodName = jp.getSignature().getName();
		Object newValue  = jp.getArgs()[0];
		System.out.println("trackChange2 method in After Advice of PropertyChangeTracker1  invoked for method "+methodName);
		System.out.println("After 1 Property changed to "+newValue);
	}
	// TODO make it an exception handler advice with getMethod point cut expression
	void handleException(JoinPoint p, Throwable e){
		System.out.println("DEBUG AfterThrowing invoked due ot Exception "+e.getMessage()+"By method "+p.getSignature().getName()+" On Class "+p.getTarget().getClass().getName());
	}
	
   
}
