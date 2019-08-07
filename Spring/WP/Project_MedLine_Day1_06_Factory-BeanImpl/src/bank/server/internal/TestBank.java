package bank.server.internal;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bank.server.Bank;

public class TestBank {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-config.xml");
		Bank b =(Bank) ctx.getBean("bankService");
		System.out.println(b.withdraw(50, 12345));
		//ctx.getBean(FactoryBean.class).getObjectType();
		//ctx.getBean("repoFactory").getObjectType();
		//((AccountRepositoryFactory) ctx.getBean("repoFactory")).getObjectType();
		
	
		Bank b2 = ctx.getBean(Bank.class);
		System.out.println(b==b2);
	//	System.out.println(b.withdraw(50, 12345));
		//ctx.getBean(FactoryBean.class).getObjectType();
		
		Object obj= ctx.getBean(FactoryBean.class);
		System.out.println("EDEBUG "+obj.getClass());
		((AbstractApplicationContext) ctx).close();
	}

}
