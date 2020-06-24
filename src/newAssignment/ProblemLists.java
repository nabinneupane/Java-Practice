package newAssignment;

public class ProblemLists {

	
	/** 
	 * Takes a integer and return if the number is prime or not
	 * @param a : the value to check if prime or not 
	 * @return boolean : either true or false
	 * */
	
	public boolean checkPrime(int a)
	{
		if (a >0 && a <=2)
			return true; 
		if(a == 0)
			return false;
		
		for (int i=2; i< a/2; i++)
		{
			if (a%i == 0)
				return false; 
			
		}
		
		return true; 
	}
	
	
	/** 
	 * Takes a integer and prints it's the multiplication table 
	 * @param input : the number to print multiplication table
	 * @return void 
	 * */
	
	public void multiplicationTable(int input)
	{
		int i=1; 
		while(i <= 10)
		{
			System.out.println("\n\t\t " + input + " * " + i + " = " + (input * i));
			i+=1;
		}
	}
	
	
	/** 
	 * Takes a integer to print total sum. 
	 * @param number : nth number to calculate the sum. 
	 * @return void  
	 * */
	
	public void nthNumberSum(int number)
	{
		int i=0, total=0;	
		while(i < number)
			total += ++i; 
		
		System.out.println("\n The sum from 1 to  " + number + " is: " + total);
	}
	
	
	/**
	 * Takes a integer to calculate the factorial 
	 * @param i : the value to calculate factorial. 
	 * return integer: factorial of given number 
	 * */
	
	
	public int calculateFactorial(int i)
	{
		if (i >0 && i < 2)
			return 1; 
		else 
			
			return i* calculateFactorial(i-1); 
	}
	
	
	/** 
	 * Takes a integer and reverse its order
	 * @param number : value whose order is to be reversed
	 * @return void  
	 * */
	
	 
	public void reverseNumber(int number)
	{
		int reverse =0; 
		while (number != 0)
		{
			
			int divisible = number % 10; 
			
			number /= 10; 
			reverse = reverse * 10 + divisible;
			
		}
		System.out.println("\n Reversed number is: " + reverse);
	}
}
