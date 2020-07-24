package extraAssignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 23, 2020 
 **/
public class CheckIfPalindromeOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CheckIfPalindromeOrNot obj = new CheckIfPalindromeOrNot(); 
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("\n\t Program to check palindrome\n\n");
		
		System.out.println("\t ================================");
		
		
		System.out.print("\nEnter the sentence to check palindrome: ");
		
		String str = scan.nextLine(); 
		
		obj.IsPalindrome(str);
		
		scan.close();
	}
	
	
	public  void IsPalindrome(String str)
	{
		String[] arr = str.split(" "); 
		
		//System.out.println(Arrays.toString(arr));
		
		List <Boolean> flag = new ArrayList<>(); 
		
		for (int i=0; i<arr.length; i++)
		{
			String output = checkPalindrome(arr[i]); 
			System.out.println("\n\t" + arr[i] + " : " + output );
			if(output.equals("is a palindrome"))
				flag.add(true); 
			else 
				flag.add(false);
		}
		
		System.out.println("\n" + flag);
		
	}
	
	public String checkPalindrome(String a)
	{
		
		for (int i=0; i<a.length()/2; i++)
		{
			char first = a.charAt(i); 
			char last = a.charAt(a.length()-i-1); 
			if(first != last)
			{
				return "is not a palindrome" ;
			}
		}
		
		return "is a palindrome" ;
	}

}

