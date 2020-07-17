package assignment8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 17, 2020 
 **/
public class Question39 {

	
	public static void main(String[] args) {
		
		Question39 obj= new Question39();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\t Enter your full name: ");
		String name= scan.nextLine(); 
		
		String output = obj.shortForm(name); 
		
		System.out.println("\n\n=======================");
		System.out.println("\n\t" + output);
		System.out.println("\n========================");
		scan.close();
	}
	
	public String shortForm(String name)
	{
		String[] ss = name.split(" ");
		
		String output="";
		
		for (int i=0; i<ss.length-1; i++)
		{
			String join;
			if (i==0)
				 join = ((ss[i].charAt(0)) + ". ").toUpperCase(); 
			else 
				 join = (ss[i].charAt(0) + ". ").toLowerCase(); 
			output +=join;
		}
		
		output += ss[ss.length-1]; 
		
		return output;
	}
}
