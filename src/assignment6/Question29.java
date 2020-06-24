package assignment6;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question29 obj = new Question29();
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		obj.mathematical(number);
		
		
		sc.close();
	}

	
	public void mathematical(int a)
	{
		double total  =0;
		if(a >=0 && a<=1)
			total = 1; 
		else 
		{	
			for (int i=1;i<=a; i++)
			{
				//System.out.println(1 + " " + total);
				total += calculation(i); 
			}
			
		}
		System.out.println("The final output is: "+ total);
	}
	
	public double calculation(int a)
	{
		
		double calculate = 1; 
		for(int i=1; i<=a; i++)
		{
			calculate *= i;
		}
		//System.out.println(" divident" + a/calculate);
		return (a/calculate);
	}
}
