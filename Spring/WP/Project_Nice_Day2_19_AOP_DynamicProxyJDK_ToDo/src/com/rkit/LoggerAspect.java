package com.rkit;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class LoggerAspect  implements InvocationHandler{
	Object obj;//This is the target object
	LoggerAspect(Object obj){
		this.obj=obj;
	}
	//TODO 1 fix this compilation problem by implementing InvocationHandlerinterface
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Logger : Enrty Method : "+method.getName());
		Object retVal = method.invoke(obj, args);
	//TODO 2 send call to target object(obj) (by invoking the method) and return the value received from it
		System.out.println("Logger : Exit Method  : "+method.getName());
		return retVal;
	}

}
