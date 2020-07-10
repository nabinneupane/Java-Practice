package assignment7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 1, 2020 
 **/
public class Question35 {

	static Question35 obj = new Question35(); 
	
	public void inputArray(Scanner scan, int ...arr)
	{
		
		for (int i=0; i< arr.length; i++)
		{
			System.out.print("\n Enter " + i +" item: ");
			arr[i] = scan.nextInt(); 
		}
		
		
		
		
		System.out.println("\nThe given array is: " + Arrays.toString(arr));
		
		
		obj.findSecondLargest(arr);
		
	}
	
	
	public void findSecondLargest( int ...arr)
	{
		
		
		int largest=0, secondLargest=0; 
		
		for (int i=0; i < arr.length; i++)
		{
			if (arr[i] > largest)
			{
				secondLargest = largest; 
				largest = arr[i]; 
			}
			else 
			{
				if (arr[i] > secondLargest)
				{
					secondLargest = arr[i];
				}
			}
			
		}
		
		System.out.println("\n The second largest element in the array is: " + secondLargest);
		
	}
	
	public static void main(String[] args)
	{
		
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Program to find the second largest number in given array ");
		
		
		System.out.print("\n Enter the size of array: ");
		
		int size = scan.nextInt(); 
		
		int [] newArr = new int[size];
		
		obj.inputArray(scan,newArr); 
		
	}
}
