package javaioExamples;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializationdemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos= new FileOutputStream("serial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s1=new Student(100,"Narendra","Modi",65);
		System.out.println("object before Serialization :"+s1);
		
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("s1 after Serialization :"+s1);
		
		FileInputStream fis = new FileInputStream("serial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//Student2 s2= (Student2)ois.readObject();	
		Student s2= (Student)ois.readObject();	
		System.out.println("object after Serialization :"+s2);
		}

}
