package assignment8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 17, 2020 
 **/
public class Question41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		Question41 obj = new Question41(); 
		
		System.out.print("\n\t Enter a word to find dublicates letter in it: ");
		
		String letter = scan.next(); 
		
		obj.printDublicate(letter);
		scan.close(); 
		
	}

	public void printDublicate(String letter)
	{
		Set<Character> mySet = new HashSet<>(); 
		
		Set<Character> resultSet = new HashSet<>(); 
		
		System.out.println("\n\n=========================\n");
		for (int i=0; i<letter.length(); i++)
		{
			char a = letter.charAt(i);
			if(mySet.add(a)==false)
				resultSet.add(a);
		}
		
		for(char i: resultSet)
			System.out.print("\t" + i + " ");
		System.out.println("\n\n=========================");
	}
}
