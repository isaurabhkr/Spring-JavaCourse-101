package bank.server.internal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-Props.config.xml");
		AXIS b =(AXIS) ctx.getBean("axis");
		System.out.println(b);

		SBI b2 =(SBI) ctx.getBean("sbi");
		System.out.println(b2);

	}

}
