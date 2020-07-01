package assignment7;

import java.util.Scanner;

public class Question32 {

	
	
	
	public  void display(Scanner scan, int [] arr) {
		
		int sum =0; 
		System.out.println("This program accepts " + (arr.length+1) + " items");
		for (int i=0; i<arr.length; i++ )
		{
			System.out.print("\n Enter " + i + " item: ");
			arr[i] = scan.nextInt(); 
			sum+= arr[i];
			
		}
		
		System.out.println("\nThe sum of array is: " + sum);
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		Scanner sc  = new Scanner(System.in); 
		
		Question32 obj = new Question32(); 
		
		int [] newArr = new int [5]; 
		
		obj.display(sc, newArr);
	}

	
	
}
