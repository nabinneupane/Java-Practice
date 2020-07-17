package assignment8;

import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 17, 2020 
 **/
public class Question38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); 
		
		Question38 obj = new Question38(); 
		System.out.println("Enter the string: ");
		String userInput = scan.next();
		
		System.out.println("===========================");
		System.out.println(obj.checkPalindrome(userInput) ? "\n\tGiven string is palindrome": "\n\tGiven string is not palindrome" );
		System.out.println("\n===========================");
		scan.close(); 
	}
	
	
	public boolean checkPalindrome(String input)
	{
		
		for (int i=0; i<input.length()/2; i++)
		{
			char start = input.charAt(i);
			char end = input.charAt(input.length()-i-1);
			if ( start != end)
				return false; 
		}
		
		return true;
//		//USING STRING BUILDER 
//		StringBuilder str = new StringBuilder(input); 
//		str.reverse(); 
//		if(input.equals(str))
//			return true;
//		else
//			return false;
	
	}

}
