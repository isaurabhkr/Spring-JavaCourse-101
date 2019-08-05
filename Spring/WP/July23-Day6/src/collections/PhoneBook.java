package collections;

public class PhoneBook {
	
	private String name;
	private long number;
	public PhoneBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhoneBook(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", number=" + number + "]";
	}
	

}
