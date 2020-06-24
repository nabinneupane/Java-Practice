package assignment6;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question31 obj = new Question31();
		
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("\nPrinting pattern\n");
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		obj.printPattern(number);
		
		
		
		sc.close();
	}

	public void printPattern(int a)
	{
		System.out.println("\n");
		for(int  i=1; i<= a; i++)
		{
			System.out.print("\t");
			for (int j=1; j<=i ; j++)
				System.out.print(" " + j);
			System.out.println();
		}
		
	}
}
