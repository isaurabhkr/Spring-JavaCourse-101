package javaioExamples;
import java.io.Serializable;
import java.util.InputMismatchException;

public class StudentAdd implements Serializable {
	protected int rollNo;
	protected String name;
	protected int age;
	protected String address;
	public StudentAdd(int rollNo, String name, int age, String address) throws InputErrorException {
		super();
		try { 
		this.rollNo = rollNo;
		this.age = age;
		}
		catch (InputMismatchException  e)
		{
			System.out.println("Please enter valid Input");
		}
		
		try {
		if(name==null||address==null)
		{
		throw new InputErrorException("Please enter a valid Input");
		}
		this.name = name;
		this.address = address;
		}
		catch (InputErrorException e) {
			 System.out.println(e); 
		}
	}
	@Override
	public String toString() {
		return "StudentAdd [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
