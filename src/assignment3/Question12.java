package assignment3;


import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input  = new Scanner(System.in); 
		
//		System.out.print(" Enter your Name: ");
//		String name = input.nextLine();
//		
//		System.out.print("\n Enter your Nationality: ");
//		String nationality = input.nextLine();
//		
//		System.out.print("\n Enter your Roll Number: ");
//		int roll = input.nextInt(); 

		
		System.out.print("\n Enter your Roll Number: ");
		int roll = input.nextInt(); 
		
		input.nextLine();
		System.out.print("\n Enter your Nationality: ");
		String nationality = input.nextLine();
		
		
		
		System.out.print("\n Enter your Name: ");
		String name = input.nextLine();
		
		System.out.println("\n========================================");
		
		System.out.println("\n Name: " + name);
		System.out.println("\n Nationality: "+ nationality);
		System.out.println("\n Roll No: " + roll);
		
		System.out.println("\n========================================");
		input.close();
		
	}

}
