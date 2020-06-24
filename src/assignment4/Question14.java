package assignment4;


import java.util.Scanner; 
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n Enter first number: ");
		int a = input.nextInt();
		
		System.out.print("\n Enter second number: ");
		int b = input.nextInt();
		
		System.out.println("\n========================");
		if (a == b)
			System.out.println("\n " + a + " is equal to " + b);
		if (a> b)
			System.out.println("\n " + a + " is greater than " + b);
		if (a< b)
			System.out.println("\n "+ a + " is less than " + b);
		
		System.out.println("\n========================");
	}

}
