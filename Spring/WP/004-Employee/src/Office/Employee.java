package Office;

public class Employee {
	protected long empId;
	protected String empName;
	protected double empSal;
	public Employee() {
		this.empId = 000;
		this.empName = "NA";
		this.empSal = 0;
	}
	public Employee(long empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
}
