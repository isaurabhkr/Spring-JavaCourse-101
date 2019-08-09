package bank.server.internal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import bank.iserver.internal.service.AccountRepository;

@Component
public class AccountRepositoryImpl implements AccountRepository {

	Set<Account> accounts = new HashSet<Account>();
	DriverManagerDataSource dataSource;
	private Connection conn;
	public AccountRepositoryImpl(DriverManagerDataSource dataSource) {
		this.dataSource=dataSource;
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
		//	stmt.execute("create table SPRING_ACCOUNTS (CUSTOMER_NAME varchar(50), ACCT_NO int, BALANCE int) ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("AccountRepository Impl constructor called");
	   Account acct1 = new Account(100, "Vivek", 1234);
	   accounts.add(acct1);
	   Account acct2 = new Account(200, "Krishna", 12345);
	   accounts.add(acct2);
	   Account acct3 = new Account(300, "Shriram", 123456);
	   accounts.add(acct3);
	}
	@Autowired
	public AccountRepositoryImpl(@Value("${mySQLDriver}")String className,@Value("${mySQLURL}") String url,@Value("${mySQLUser}") String user, @Value("${mySQLPassword}")String pwd) {
		//this.dataSource=dataSource;
		try {
			System.out.println("DEBUG AccountRepositoryImpl Loading class "+className);
			System.out.println("DEBUG AccountRepositoryImpl url "+url);
			System.out.println("DEBUG AccountRepositoryImpl user name "+user);
			System.out.println("DEBUG AccountRepositoryImpl passwd "+pwd);
			Class.forName(className);
			 conn = DriverManager.getConnection(url, user, pwd);
		//	Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
		//	stmt.execute("create table SPRING_ACCOUNTS (CUSTOMER_NAME varchar(50), ACCT_NO int, BALANCE int) ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Account findAccountByAcctNumber(int acctNo) {
		for(Account acct : accounts){
			if( acct.getAcctNo() == acctNo)
			return acct;
		}
		return null;
	}
	public  Account createAccount(String name, int balance, int acctNo){
		Account acct = new Account(balance,name,acctNo);
		//Connection conn;
		try {
			//conn = dataSource.getConnection();
			
			PreparedStatement stmt = conn.prepareStatement("insert into SPRING_ACCOUNTS values(?,?,?)");
			stmt.setString(1,name);
			stmt.setInt(2, acctNo);
			stmt.setInt(3, balance);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accounts.add(acct);
		return acct;
		
	}

}
