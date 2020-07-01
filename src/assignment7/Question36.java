package assignment7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

	
/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 1, 2020 
 **/
public class Question36 {

		
		
		
		public int[]  inputArray(Scanner scan, int ...arr)
		{
			
			for (int i=0; i< arr.length; i++)
			{
				System.out.print("\n Enter " + i +" item: ");
				arr[i] = scan.nextInt(); 
			}
			
			
			
			String strArr = Arrays.toString(arr); 
			System.out.println("\nThe given array is: " + strArr);
			
			
			return arr;
		}
		
		
		public void findDublicate(int[] arr)
		{
			
			Set<Integer> newSet = new HashSet <Integer>(); 
			
			//makesure multiple repeated element are only printed once. 
			Set<Integer> finalResult = new HashSet<Integer>(); 
			
			System.out.print("\n\n The repeating element in the array are: ");
			
			
			for (int count: arr)
			{
				if(newSet.add(count) == false)
				
					finalResult.add(count);
			}
			
			for (int print: finalResult)
				System.out.println(print);
			
		}
	
	public static void main(String[] args)

	{
		Scanner scan = new Scanner(System.in); 
		
		 Question36 obj = new Question36(); 
		
		System.out.println("Program to find the second largest number in given array ");
		
		
		System.out.print("\n Enter the size of array: ");
		
		int size = scan.nextInt(); 
		
		int [] newArr = new int[size];
		
		int [] arr; 
		
		arr = obj.inputArray(scan,newArr); 
		
		
		obj.findDublicate(newArr);
		
	}
}
