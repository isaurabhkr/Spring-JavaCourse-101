package account;

public class Account {
	private double balance;
	private String acType;
	public Account() {
		this.balance = 0;
		this.acType = "Savings";
	}
	public Account(double balance, String acType) {
		this.balance = balance;
		this.acType = acType;
	}
	
	public void setAcType(String acType)
	{
		this.acType = acType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAcType() {
		return acType;
	}
	public double withdraw(double amount)
	{
		if(balance - amount >= 1000)
		{
			balance = balance - amount;
			return balance;
		}
		return -1;
	}
	
	public double deposit(double amount)
	{
			balance = balance + amount;
			return balance;
	}
	
	public void printAccountInfo()
	{
		System.out.println("Account Info");
		System.out.println(this.balance);
		System.out.println(this.acType);
	}
}
