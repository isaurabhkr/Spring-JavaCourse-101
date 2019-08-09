package bank.server;

import java.util.Collection;
import java.util.Map;

import bank.iserver.internal.service.AccountService;

public interface Bank {
	public int createAccount(String name,int amount);
	int withdraw(int amount , int acctNo);
	Collection<AccountService> showAccountServices();
	Map<String,AccountService> showAccountServicesByName();

}
