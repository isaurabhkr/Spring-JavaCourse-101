package test;


import java.util.Collection;
import java.util.Iterator;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bank.iserver.internal.service.AccountService;
import bank.server.Bank;
import bank.server.internal.Account;
import bank.server.internal.CurentAccount;
import bank.server.internal.LoanAccount;
import bank.server.internal.SavingsType;
import bank.server.internal.SubClassAccount;


public class Test {
	public static void main(String[] args) {

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.addInterface(AccountService.class);

		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-list.config.xml");

		Bank bank1 = (Bank) ctx.getBean("bankService");
		Bank bank2 = (Bank) ctx.getBean("bankService");

		Account acct = bank1.getAccountByNumber(1234);
		acct.setBalance(100000);
		System.out.println("Is it a singleton "+(bank1==bank2));
		//  System.out.println(ctx.getClass().getName());
		System.out.println("New Balance after withdrawal= "+bank1.withdraw(50, 1234));
		Collection accountTypes = bank1.showAccountServices();
		Iterator iter = accountTypes.iterator();
		//for(AccountService acctType : accountTypes){
		while(iter.hasNext()){
			Object acct1 = iter.next();
			if(acct1 instanceof SubClassAccount){
				System.out.println(" Type of Account SubClassAccount Proxy "+acct1.getClass().getName());
				SubClassAccount subAcct =(SubClassAccount)acct1;
				subAcct.setLoanAmount(22222);
				subAcct.getLoanAmount();
				try{
				subAcct.getException();
				}catch(Throwable th){
					System.out.println("DEBUG :Client has Caught Exception ");
				}
			}else{
				System.out.println(" Type of AccountType  Proxy "+acct1.getClass().getName());
				AccountService acctType = (AccountService)acct1;
			    System.out.println("Account Service "+acctType);
			    if(acct1 instanceof LoanAccount)
			    ((LoanAccount)(acctType)).setLoanTerm(20);
			    else if(acct1 instanceof CurentAccount){
			    ((CurentAccount)(acctType)).setCustName("New Current Account Name");
			    System.out.println("After Advice Inside Client "+((CurentAccount)(acctType)).getCustName());
			    }
			    else if(acct1 instanceof SavingsType)
				    ((SavingsType)(acctType)).setCustName("New Saving Account name");
			}
		}


	}

}

