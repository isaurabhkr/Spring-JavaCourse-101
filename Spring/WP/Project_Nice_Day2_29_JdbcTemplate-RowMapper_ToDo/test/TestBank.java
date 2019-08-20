import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bank.iserver.internal.service.AccountRepository;
import bank.iserver.internal.service.AccountService;
import bank.server.Bank;
import bank.server.internal.Account;
import bank.server.internal.AccountRepositoryImpl;
import bank.server.internal.BankImpl;


public class TestBank {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-list.config.xml");
		
		
	    AccountRepository repository = ctx.getBean(AccountRepository.class);
	   List<Account> accounts = repository.findAllAccounts();
	   for(Account acct : accounts){
		   System.out.println(acct);
	   }
	   

	}

}
