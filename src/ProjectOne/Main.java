package ProjectOne;

import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 10, 2020 
 **/
public class Main {
	
	
	public BankAccount displayBankAccount(Scanner scan)
	{
		BankAccount obj1 = null; 
		
		System.out.println("\n Please enter one of the choice below..");
		System.out.println("\n\t 1. Open account with Name and initial balance");
		System.out.println("\t 2. Open account with Name only. ");
		
		int input = scan.nextInt(); 
		scan.nextLine();
		
		switch(input)
		{
			case 1: 
					System.out.print("\n\t Enter the name: ");
					scan.hasNextLine(); 
					String name = scan.nextLine(); 
					
					System.out.print("\n\t Enter the initial balance: ");
					double balance = scan.nextDouble(); 
					obj1 = new BankAccount(name,balance); 
					break; 
			case 2: 
					System.out.print("\n\t Enter the name: ");
					String name1 = scan.nextLine(); 
					obj1 = new BankAccount(name1); 
					break; 
			default: 
					System.out.println("\n\n\t You entered invalid option. Thank you.");
					System.out.println("\n\n\t  ##### END OF THE PROGRAM ##### ");
					System.exit(0); 
		}
		
		return obj1; 
	}

	
	public void bankFunction(BankAccount obj,Scanner scan)
	{
		String decision; 
		do {
		
		System.out.println("\n Please enter one of the choice below..");
		System.out.println("\n\t 1. WITHDRAW money from account");
		System.out.println("\t 2.  DEPOSIT money to account");
		System.out.println("\t 3. DISPLAY current Balance");
	

		int input = scan.nextInt(); 
		scan.nextLine();
		
		switch(input) {
			case 1: 
					System.out.println("\n Choose one:  ");
					System.out.println("\n\t 1. Without fee ");
					System.out.println("\t 2. With fee");
					
					
					int option = scan.nextInt(); 
					scan.nextLine();
					
					System.out.print("\n Enter amount to withdraw: ");
					double amount = scan.nextDouble(); 
					
					if(option == 1)
						obj.withdrawAmount(amount);
					else if (option ==2)
					{
						System.out.print("\n Enter the fee: ");
						int fee = scan.nextInt(); 
						obj.withdrawAmount(amount, fee);
					}
					else 
						System.out.println(" ####### Please enter valid option #######");
				break;
				
			case 2: 
				System.out.println("\n Choose one:  ");
				System.out.println("\n\t 1. without interest ");
				System.out.println("\t 2. With interest");
				int option1 = scan.nextInt(); 
				scan.nextLine();
				
				System.out.print("\n Enter amount to deposit: ");
				double amt = scan.nextDouble(); 
				
				if(option1 == 1)
					obj.depositAmount(amt);
				
				else if (option1 == 2)
				{
					System.out.print("\n Enter the Interest: ");
					int interest = scan.nextInt(); 
					obj.depositAmount(amt, interest);
				}
				else 
					System.out.println(" ####### Please enter valid option #######");
				break;
			case 3: 
					obj.displayAccountInfo();
				break; 
			default: 
				System.out.println("\n\n ##### You entered invalid option. ######");
		}
		System.out.println("====================================================");
		System.out.print(" Explore options again? press y to continue: ");
		decision = scan.next();
		} while(decision.equalsIgnoreCase("Y"));
			{
					System.out.println("\n \t ########## Exiting from your account #################");	
			}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("\n ***** \t Welcome to our Bank \t ***** \n ");
		
		String flag ; 

		Main mainObject = new Main(); 
		
		do {
		BankAccount obj = mainObject.displayBankAccount(sc);
		
		System.out.println("\n Account created sucessfully.");
		
		mainObject.bankFunction(obj,sc);
		
		System.out.print("\n \n If you want to create another account press y to continue: ");
		
			flag = sc.next();
		} while(flag.equalsIgnoreCase("y")); {
			System.out.println("\n Thank you for enjoying our service ");
			System.out.println("\n \t ########## Exiting from Main Program #################");
			sc.close();
		}
		sc.close(); 
	}
	
	

}