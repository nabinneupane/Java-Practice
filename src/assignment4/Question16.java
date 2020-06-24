package assignment4;

import javax.swing.JOptionPane;

public class Question16 {

	
	
	public static void main(String[] args)
	{
		
		JOptionPane.showMessageDialog(null, "Program to check if given number is even or odd");
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")); 
		
		
		String output = (a % 2 ==0 ) ? "The given number is Even" : "The given number is Odd";
		
		JOptionPane.showMessageDialog(null, output);
		
	}
}
