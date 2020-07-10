package ProjectOne;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 10, 2020 
 **/
public class BankAccount {

	double balance; 
	String name; 
	int accountNumber; 
	Random rnd = new Random();
	int randomInt = rnd.nextInt(999999);
	
	Scanner sc = new Scanner(System.in); 
	
	
	
	public BankAccount(String name, double balance)
	{
		this.name= name; 
		this.balance = balance; 
		this.accountNumber = randomInt;
	}
	
	public BankAccount(String name)
	{
		this.name = name; 
		this.balance =0.0;
		this.accountNumber = randomInt;
	}
	
	
	public void displayAccountInfo() {
		
		System.out.println("\n\n================================= ");
		System.out.print(" Account detail: \n");
		System.out.println("\n\t Full Name: " + name);
		System.out.println("\n\t Acccount Number: " + accountNumber);
		System.out.printf("\n\t Balance: $%.2f", balance); 
		System.out.println("\n================================= ");
	}
	 
	
	public void withdrawAmount(double amount)
	{
		
		System.out.println("\n The amount to be withdrawn is: $" + amount);
		
		if (amount <= balance )
			balance -= amount; 
		else 
			System.out.println("\n ******* Sorry. you don't have enough balance.***********");
		displayAccountInfo(); 
	}
	
	public void withdrawAmount(double amount, int fee)
	{
		
		
		System.out.println("\n The amount to be withdrawn is: $" + amount);
		System.out.println(" The fee for withdrawn is: $" + fee);
		
		if((amount+fee) <= balance)
			balance =balance - (amount + fee);
		else 
			System.out.println("\n ******* Sorry. you don't have enough balance.***********");
		displayAccountInfo(); 
	}
	
	public void depositAmount(double amount)
	{
		
		System.out.println("\n The amount to be deposited is: $" + amount);
		
		balance += amount; 
		
		displayAccountInfo(); 
	}
	
	public void depositAmount(double amount, double interest)
	{
		System.out.println("The amount to be withdrawn is: $" + amount);
		System.out.println("The interest given is: " + interest + "% ");
		
		balance +=  amount;
		balance +=  ((interest/100)*balance);
		
		displayAccountInfo(); 
		
	}
}
