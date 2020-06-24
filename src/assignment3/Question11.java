package assignment3;


import java.util.Scanner; 

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
		
		System.out.print("\n Enter first number: ");
		int a = input.nextInt(); 
		
		System.out.print("\n Enter second number: ");
		int b = input.nextInt(); 
		
		
		//Using  temp variable swapping 
		
		System.out.println("\n========================================");
		System.out.println("\n After swapping using temp ...");
		
		int temp = a; 
		a = b; 
		b = temp; 
		System.out.println("\n The value of a is: " + a);
		System.out.println("\n The value of b is: " + b);
		System.out.println("\n========================================");
		
		
		//Without Using temp variable 
		
		System.out.println("\n========================================");
		System.out.println("\n After swapping without using temp ...");
		 a = a+b; 
		 b = a-b; 
		 a = a-b; 
		 System.out.println("\n The value of a is: " + a);
		 System.out.println("\n The value of b is: " + b);
		 System.out.println("\n========================================");
	}

}
