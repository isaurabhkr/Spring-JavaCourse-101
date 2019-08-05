package test;
import day3pack.Rectangle;
import java.util.Scanner;

//18.07.2019
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle[] rec = new Rectangle[5];
		System.out.println("Enter the details: ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the l and b for rectangle " +(i+1));
			Scanner in = new Scanner(System.in);
			int l = in.nextInt();
			int b = in.nextInt();
			rec[i] = new Rectangle(l,b);
		}
		
		for(int i=0;i<5;i++)
		{
		System.out.println(rec[i]);
		}
	}

}
