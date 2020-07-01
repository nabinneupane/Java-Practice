package assignment7;

import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 1, 2020 
 **/
public class Question33 {

	 static Question33 obj = new Question33();
	
	public void inputArray(Scanner scan, int ...arr)
	{
		
		for (int i=0; i< arr.length; i++)
		{
			System.out.print("\n Enter " + i +" item: ");
			arr[i] = scan.nextInt(); 
		}
		
		obj.displayOriginal(arr);
		obj.ascendingOrder(arr);
	}
	
	
	
	
	public void displayOriginal(int[] arr)
	{
		System.out.println("\n\n The order of element in array : ");
		
		for (int i=0;i< arr.length; i++ )
		{
			System.out.print("\t"+ arr[i]+ " ");
		}
	}
	
	public void ascendingOrder(int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[i])
				{
					int temp = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = temp;
				}
			}
		}
		
		
		System.out.println("\n In ascending order: ");
		for (int i=0; i< arr.length; i++)
		{
			System.out.print("\t" + arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		
		
		System.out.print("\nEnter the size of array: ");
		int size = sc.nextInt(); 
		
		int [] newArr = new int[size];
		
		obj.inputArray(sc,newArr); 
		
		
	}

}
