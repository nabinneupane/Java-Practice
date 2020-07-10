package assignment7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 1, 2020 
 **/
public class Question34 {
	
	

public  int[] arrInput(Scanner scan, int [] arr) {
		
		
		System.out.println("This program accepts " + (arr.length+1) + " items");
		
		
		for (int i=0; i<arr.length; i++ )
		{
			System.out.print("\n Enter " + i + " item: ");
			arr[i] = scan.nextInt(); 
			
		}
		return arr; 
	}
	

	
	
	
	public void displayReverse(int[] arr)
	{
		System.out.println("\n\n Printing array element in reverse order:");
		
		int end= arr.length-1; 
		
		for (int i=0; i< arr.length/2; i++)
		{
			var temp =arr[i];
			arr[i] = arr[end]; 
			arr[end] = temp; 
			end -=1; 
		}
		
		System.out.println("\n After reverse order is : " + Arrays.toString(arr));
		
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in); 
		
	 Question34 obj = new Question34(); 
		
		int [] newArr = new int [5]; 
		
		int [] arr; 
		
		arr =	obj.arrInput(sc, newArr);
		
		
		System.out.println("\n Original array is : " + Arrays.toString(arr));
		
		obj.displayReverse(arr); 
		
	}
	
	

}
