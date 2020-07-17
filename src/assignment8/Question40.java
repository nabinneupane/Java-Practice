package assignment8;

import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 17, 2020 
 **/
public class Question40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		Question40 obj = new Question40();
		
		System.out.print("\n\t Enter the string to reverse: ");
		String name = scan.next();
		
		obj.reverseString(name);
		scan.close();
	}
	
	public void reverseString(String input)
	{
		String rev =""; 
		
		for (int i=input.length()-1; i>=0; i--)
		{
			rev += input.charAt(i);
		}
		
		System.out.println("\n\t==========================");
		System.out.println("\n\t\t" + rev);
		System.out.println("\n\t==========================");
		
	}
	

}
