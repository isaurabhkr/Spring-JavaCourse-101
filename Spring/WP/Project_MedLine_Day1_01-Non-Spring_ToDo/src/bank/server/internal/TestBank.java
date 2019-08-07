package bank.server.internal;

import bank.iserver.internal.service.AccountRepository;
import bank.server.Bank;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountRepository a = new AccountRepositoryImpl();
		Bank b = new BankImpl(a);
		System.out.println(b.withdraw(50, 1234));

	}

}
