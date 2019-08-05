package test;

import java.util.Scanner;

import day3pack.Book;
import day3pack.Book;
import java.util.Scanner;
public class TestBook {
	static Book[] books = new Book[3];
	static void createBooks()
	{
		System.out.println("Enter the details: ");
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the name and price of the Book " +(i+1));
			Scanner in = new Scanner(System.in);
			String l = in.nextLine();
			double b = in.nextDouble();
			books[i] = new Book(l,b);
		}
	}

	static void showBooks()
	{
	System.out.println("Book title       Book price");
	for(int i=0;i<3;i++)
		System.out.println(books[i]);
	
	}
	public static void main(String[] args) {
		createBooks();
		showBooks();
		
	}
		
}


