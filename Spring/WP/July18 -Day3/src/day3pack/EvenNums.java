package day3pack;
import java.util.Scanner;
public class EvenNums {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number n");
		int n =  in.nextInt();  
		System.out.println("Even numbers upto n= "+n);

		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
		
	}

}
