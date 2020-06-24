package assignment2;

import javax.swing.JOptionPane;

public class Question4 {
	
	
	public static void main(String[]args)
	{
		JOptionPane.showMessageDialog(null, "Program to calculate simple interest input by user. ");
		
		
		
		double P = Double.parseDouble(JOptionPane.showInputDialog("Enter principle amount money (P): "));
		
		double T = Double.parseDouble(JOptionPane.showInputDialog("Enter number of time period: ")); 
		double R = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate: ")); 
		
		
		double simpleInterest = (double) (P*T*R)/100; 
		
		JOptionPane.showMessageDialog(null, "The simple interest is : " + simpleInterest);
	}

}

