package collectionsTest;
import java.util.*;
import collections.Person;
public class TestPersonStack {

	public static void main(String[] args) {
		Stack<Person> stck= new Stack<Person>();
		stck.push(new Person(1,"Narendra","Modi",65));
		stck.push(new Person(2,"Rahul","Gandhi",45));
		stck.push(new Person(3,"Sushil","Modi",65));
		stck.push(new Person(4,"Sonia","Gandhi",68));
		System.out.println("Contains Person with id s :: ");
		boolean found =stck.contains(new Person(1,"Narendra","Modi",65));
		System.out.println("Contains with person id s :: "+ found);
		
		boolean found2 =stck.contains(new Integer(1));
		System.out.println("Contains with person id s :: "+ found2);
		
		Iterator<Person> itr = stck.iterator();
		while(itr.hasNext())
		{
			Person p = (Person) itr.next();
			System.out.println(p);
		}
	}

}
