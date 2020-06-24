package newAssignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProblemLists obj = new ProblemLists(); 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("\t*****  Welcome to General Problem Lists: Select any operations to perform. *****\n");
		int input =0, num; 
		String decision;
		do
		{
			System.out.print("\n\t 1. To check if the number is Prime or not"
							  + "\n\t 2. To display the multiplication table of given number "
							  + "\n\t 3. To Print nth sum  of the given number "
							  + "\n\t 4. To Calculate the Factorial of the given number "
							  + "\n\t 5. To reverse the Order of the given number ");
			System.out.println("\n ======================================================================== \n ");
			System.out.print(" Enter your choice: ");
			input = sc.nextInt(); 
			
			System.out.println("==================================================== \n ");
			System.out.print("\n Enter the number: ");
			num = sc.nextInt();
			switch(input)
			{
			case 1: 
					boolean check = obj.checkPrime(num);
					 String output = (check) ? "\nThe given number is PRIME" : "\nThe given number is not PRIME"; 
					 System.out.println(output);
					 break;
			case 2: 
				 	obj.multiplicationTable(num);
				 	break;
			case 3: 
					obj.nthNumberSum(num);
					break;
			case 4: 
				int val = obj.calculateFactorial(num);
					
					System.out.println(" \n\t" +num + "! = " + val);
					break; 
			case 5: 
					obj.reverseNumber(num);
					break; 
			default: 
				System.out.println("\n !!!!!! Please enter the valid number to perform the operation. !!!!!!!");
			}
			System.out.println("\n==================================================== \n ");
			System.out.print("\n Do you want to continue: ");
			decision = sc.next();
			
		}while(decision.equalsIgnoreCase("yes")); {
			System.out.println("\n Thank you. I enjoyed answering your question");
			System.out.println("========== End of the Program ========");
			sc.close();
		}
		
	}

}
