package bank.server.internal;

import static java.lang.String.format;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import bank.iserver.internal.service.AccountRepository;

public class AccountRepositoryImpl implements AccountRepository {

	Set<Account> accounts = new HashSet<Account>();
	DriverManagerDataSource dataSource;
	JdbcTemplate template;
	public AccountRepositoryImpl(DriverManagerDataSource dataSource, JdbcTemplate jdbcTemplate) {
		template=jdbcTemplate;
			
//	jdbcTemplate.execute("create table SPRING_ACCOUNTS_13 (CUSTOMER_NAME varchar(50), ACCT_NO NUMBER, BALANCE NUMBER)");
		
		// jdbcTemplate.execute("delete from SPRING_ACCOUNTS_13");
		System.out.println("AccountRepository Impl constructor called");
	   Account acct1 = new Account(101, "Bajirao", 1234);
	   accounts.add(acct1);
	   Account acct2 = new Account(200, "Shivaji", 12345);
	   accounts.add(acct2);
	   Account acct3 = new Account(300, "RanaPratap", 123456);
	   accounts.add(acct3);
	   
	//  insertIntoDB(accounts);
	}
	private void insertIntoDB(Collection<Account> accounts2) {
		int size = accounts2.size();
		String[] sqls = new String[size];
		for(Account acct : accounts2){
			String sql = "insert into SPRING_ACCOUNTS_13 values('"+acct.getName()+"','"+acct.getAcctNo()+"','"+acct.getBalance()+"')";
			sqls[--size]=sql;
		}
		template.batchUpdate(sqls);
	}
	@Override
	public Account findAccountByAcctNumber(int acctNo) {
		System.out.println("Querying for Account Number "+acctNo);
		Account account = template.queryForObject("select * from SPRING_ACCOUNTS_13 where ACCT_NO="+acctNo,
				new RowMapper<Account>(){ 
			            public Account mapRow(ResultSet rs, int rowNum) throws SQLException{
		                               return new Account(rs.getInt(3),rs.getString(1),rs.getInt(2));
		                }
		      }
		);
		System.out.println("JdbcTemplate Returning Account from DataBase"+account);
		return account;
	}
	public List<Account> findAllAccounts(){
		List<Account> accounts = template.query("select * from SPRING_ACCOUNTS_13",
				new RowMapper<Account>(){
			           public Account mapRow(ResultSet rs, int rowNum) throws SQLException{
			        	   System.out.println("mapRow Method called");
			        	   return new Account(rs.getInt(3),rs.getString(1),rs.getInt(2));
			           }
		});
		return accounts;
	}
	public  Account createAccount(String name, int balance, int acctNo){
		return new Account(balance,name,acctNo);
	}

}
