package ProxyProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class ObjectFactory {
	
	public static Animal getInstance(String animalType) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		//Identify the name of the class
		//Create Instance of Proxy for Animal
		//Write Interceptor method
		Properties props = new Properties();
		Animal proxy = null;
		try {
			props.load(new FileReader("C:\\Work\\HSBC\\Spring\\WP\\Aug05-Day15\\src\\config.properties"));
			String className = props.getProperty(animalType);
			Animal animal = (Animal) Class.forName(className).newInstance();
			
			//Step 2 to create a ProxyInstance
			// We can't create proxy of a class, we can do iot for an interface
			
			InvocationHandler logger = new myInterceptor(animal);
			proxy= (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(), new Class[] {Animal.class}, logger);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return proxy;
	}

}
