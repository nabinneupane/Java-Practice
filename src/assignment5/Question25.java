package assignment5;

import java.util.Scanner;

public class Question25 {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		
		
		int maxScore =0; 
		
		String studentName =""; 
		
		System.out.print("\nEnter the number of students: ");
		int input = sc.nextInt();
		
		
		for (int i=0; i<input ; i++)
		{
			System.out.print("\nEnter student name: ");
			String str = sc.next(); 
			System.out.print("\nEnter marks: ");
			int score = sc.nextInt(); 
			
			if (score > maxScore) {
				maxScore = score;
				studentName = str; 
			}
		}
		
		System.out.println("\nStudent with high score is: "+ studentName + " "+ maxScore);
		sc.close();
		
	}
}
