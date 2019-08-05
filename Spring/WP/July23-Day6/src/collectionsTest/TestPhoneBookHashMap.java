package collectionsTest;
import collections.*;
import java.util.*;
public class TestPhoneBookHashMap {
	public static void main(String[] args) {
		PhoneBook p1 = new PhoneBook("Golu",97101123);
		PhoneBook p2 = new PhoneBook("Molu",98101453);
		PhoneBook p3 = new PhoneBook("Lolu",989193523);
		PhoneBook p4 = new PhoneBook("Tolu",98686123);
		PhoneBook p5 = new PhoneBook("Polu",978686863);
		Hashtable<String,PhoneBook> phoneTable = new Hashtable<String, PhoneBook>();
		phoneTable.put("Golu",p1);
		phoneTable.put("Molu",p2);
		phoneTable.put("Lolu",p3);
		phoneTable.put("Tolu",p4);
		phoneTable.put("Polu",p5);
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the choice: 0 to exit 1 to continue");
		int choice = in.nextInt();
		in.nextLine();
		while(choice==1)
		{
			System.out.println("Enter 1 to add a new record");
			System.out.println("Enter 2 to search phone number");
			System.out.println("Enter 3  to quit");
			int op = in.nextInt();
			in.nextLine();
			if(op==1) {
				System.out.println("Enter the name and phone number");
				String name=in.nextLine();
				long number=in.nextLong();
				in.nextLine();
				PhoneBook p22 = new PhoneBook(name,number);
				phoneTable.put(name,p22);
			}
			else if(op==2)
			{
				System.out.println("Enter the name");
				String nam = in.nextLine();
				if(phoneTable.containsKey(nam))
				{
					System.out.println("The entry is present in phonebook with number "+phoneTable.get(nam));
					System.out.println(phoneTable.get(nam).getNumber());
				}
				else
					System.out.println("Enter not found");
			}
			else if(op==3)
				System.exit(0);
		}
	}
}