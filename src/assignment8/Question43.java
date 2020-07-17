package assignment8;

import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 17, 2020 
 **/
public class Question43 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in); 
		
		Question43 obj = new Question43(); 
		obj.checkArithematicException(scan); 
		obj.checkArrayOutOfBoundException(scan);
		scan.close();
	}

	public void checkArithematicException(Scanner scan)
	{
		
		System.out.println("\n\t 1. exception handling to trap the divided by zero  ");
		System.out.println("\n ========================");
	
		System.out.print("\n\t Enter first Number: ");
		int firstNum = scan.nextInt();
		
		System.out.print("\n\t Enter Second Number: ");
		int secondNum = scan.nextInt();
		
		try {
			int ans = firstNum/ secondNum; 
			System.out.println( "\n\t" +ans);
		}catch (ArithmeticException ae)
		{
			System.out.println("\n\t #####ERROR#####");
			System.out.println("\n\t" + ae);
		}
		
		System.out.println("\n =======================");
	}
	
	
	public void checkArrayOutOfBoundException(Scanner scan)
	{
		System.out.println("\n\t 2. exception handling to trap out of index value in array.  ");
		System.out.println("\n ========================");
		System.out.print("\n\tEnter the size of array: ");
		int size = scan.nextInt(); 
		
		
		int[] arr = new int[size]; 
		
		
		try {
			for(int i=0; i<arr.length+1; i++)
			{
				arr[i] = i ;
				System.out.println(arr[i]);
			}
		}catch(IndexOutOfBoundsException ae)
		{
			System.out.println("\t " + ae);
		}
	}
}
