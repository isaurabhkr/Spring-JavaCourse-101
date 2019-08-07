package bank.server.internal;

import bank.iserver.internal.service.AccountRepository;
import bank.server.Bank;

public class BankFactory {
	
	//ToDO provide factory method that takes Accountrepo as argument

	AccountRepository a;
	public BankFactory() {
	}
	
	public BankFactory(AccountRepository a) {
		this.a = a;
	}
	
	public BankImpl createInstance(AccountRepository acctRepo1, int branchCode) throws Exception {
		//AccountRepositoryImpl a = new AccountRepositoryImpl();
		//BankImpl c =BankImpl.getInstance(a,1234);
		return new BankImpl(acctRepo1,branchCode);
	}
	
}
