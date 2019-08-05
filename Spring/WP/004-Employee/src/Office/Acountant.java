package Office;

public class Acountant extends Employee {
	protected String bankName;
	protected int comnpanyAccountNo;

	public Acountant() {
		super();
	}

	public Acountant(long empId, String empName, double empSal, int comnpanyAccountNo, String bankName) {
		super(empId, empName, empSal);
		this.comnpanyAccountNo = comnpanyAccountNo;
		this.bankName=bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getComnpanyAccountNo() {
		return comnpanyAccountNo;
	}

	public void setComnpanyAccountNo(int comnpanyAccountNo) {
		this.comnpanyAccountNo = comnpanyAccountNo;
	}
	
}
