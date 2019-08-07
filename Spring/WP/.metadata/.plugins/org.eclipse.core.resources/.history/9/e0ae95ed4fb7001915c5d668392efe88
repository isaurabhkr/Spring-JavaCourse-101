package ProxyProject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class myInterceptor implements InvocationHandler {

	Animal animal;
	public myInterceptor(Animal animal) {
		super();
		this.animal = animal;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		System.out.println("Entry : method name" + method.getName());
		try
		{
			obj= method.invoke(animal, null);
			System.out.println("Exit : method name"+method.getName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
