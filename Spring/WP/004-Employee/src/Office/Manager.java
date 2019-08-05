package Office;

public class Manager extends Employee {
	protected long cellno;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(long empId, String empName, double empSal,long cellno) {
		super(empId, empName, empSal);
		// TODO Auto-generated constructor stub
		this.cellno = cellno;
	}
	
	public long getCellno() {
		return cellno;
	}

	public void setCellno(long cellno) {
		this.cellno = cellno;
	}

}
