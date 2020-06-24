package assignment5;


import java.util.Scanner; 


public class Question22 {

	public static void main(String[] args)
	{
		
		
		System.out.print("Please enter the number: ");
		
		
		Scanner sc = new Scanner(System.in); 
		
		int input = sc.nextInt(); 
		
		System.out.println("\nThe table of " + input + " is: \n");
		
		int i=1; 
		while(i <= 10)
		{
			System.out.println("\t\t " + input + " * " + i + " = " + (input * i));
			i+=1;
		}
		
		sc.close();
		
	}

}
