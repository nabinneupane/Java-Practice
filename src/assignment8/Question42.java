package assignment8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 17, 2020 
 **/
public class Question42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Question42 obj = new Question42(); 
		
		System.out.print("\n\t Enter a word to find dublicates letter in it: ");
		
		String letter = scan.next(); 
		
		obj.printDublicateWord(letter);
		scan.close(); 
	}

	
	public void printDublicateWord(String letter)
	{
		String[] ss = letter.split("");
		
		
		Set<String> newSet = new HashSet<>(); 
		Set <String> output = new HashSet<>();
		for(String i: ss)
		{
			if(newSet.add(i) == false)
				output.add(i);
			
		}

		System.out.println("\n\n===================\n");
		for(String i:output)
			System.out.print(i + " ");
		System.out.println("\n==========================");
	}
}
