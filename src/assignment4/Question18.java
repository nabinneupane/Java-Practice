package assignment4;

import javax.swing.JOptionPane;

public class Question18 {

	
	public static void main(String[] args)
	{
		
		int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter first number: "));
		int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter second number: "));
		int thirdNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter third number: ")); 
		
		int largestValue = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
		
		JOptionPane.showMessageDialog(null, "The largest value entered is: " + largestValue);
	}
}
