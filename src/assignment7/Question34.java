package assignment7;

import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 1, 2020 
 **/
public class Question34 {
	
	static Question34 obj = new Question34(); 

public  void arrInput(Scanner scan, int [] arr) {
		
		
		System.out.println("This program accepts " + (arr.length+1) + " items");
		for (int i=0; i<arr.length; i++ )
		{
			System.out.print("\n Enter " + i + " item: ");
			arr[i] = scan.nextInt(); 
			
			
		}
		
		
		obj.displayOriginal(arr);
		
		obj.displayReverse(arr); 
		
		
	}
	

	public void displayOriginal(int[] arr)
	{
		System.out.println("\n\n The order of element in array : ");
		
		for (int i=0;i< arr.length; i++ )
		{
			System.out.print("\t"+ arr[i]+ " ");
		}
	}
	
	
	public void displayReverse(int[] arr)
	{
		System.out.println("\n\n Printing array element in reverse order:");
		
		for (int i=arr.length-1; i>=0; i--)
		{
			System.out.print("\t" + arr[i] + " ");
		}
		
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in); 
		
		
		
		int [] newArr = new int [5]; 
		
		obj.arrInput(sc, newArr);
	}
	
	

}
