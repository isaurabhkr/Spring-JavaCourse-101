package test;
import day3pack.*;
public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com",
				'm');
		System.out.println(anAuthor); // call toString()
		anAuthor.setEmail("paul@nowhere.com");
		System.out.println(anAuthor);
	}

}
