package assignment5;


import java.util.Scanner; 

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i =0; 
		int total = 0; 
		Scanner sc = new Scanner(System.in); 
		
		System.out.print(" Enter the number: ");
		int number = sc.nextInt();
		
		sc.close();
		
		
		
		while(i < number)
			total += ++i; 

		
		System.out.println("\nThe sum from 1 to  " + number + " is: " + total);
	}

}
