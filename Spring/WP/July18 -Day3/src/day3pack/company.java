package day3pack;

public class company {

	private int companyID;
	private String companyName;
	private Address address;

	public company() {
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public company(int companyID, String companyName, Address address) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "company [companyID=" + companyID + ", companyName=" + companyName + ", address=" + address + "]";
	}

}
