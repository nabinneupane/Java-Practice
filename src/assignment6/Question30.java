package assignment6;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nFind the Fibonacci Series\n\n");
		
		Question30 obj  = new Question30(); 
		
		System.out.print("\nEnter the number: ");
		Scanner sc = new Scanner(System.in); 
		long a = sc.nextLong();
		
		obj.fibonacci(a);
		
		sc.close();
		
	}

	public void fibonacci(long a)
	{
		
		int first =0, second =1, i=0;; 
		
			
		System.out.println("\nThe fibonacci serie is given by: \n");
		
		if (a < 1)
			return;
		while(i < a)
		{
			i++;
			System.out.print(second + " ");
			int temp = first + second ;
			first = second;
			second = temp; 
		}
		

	}
}
