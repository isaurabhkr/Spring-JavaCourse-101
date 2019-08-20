package bank.iserver.internal.service;

import java.util.List;

import bank.server.internal.Account;

public interface AccountRepository {
	Account findAccountByAcctNumber(int acctNo);
	List<Account> findAllAccounts();

}
