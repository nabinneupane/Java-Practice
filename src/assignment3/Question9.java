package assignment3;


import java.util.Scanner;

import javax.swing.JOptionPane; 

public class Question9 {


	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		
		
		JOptionPane.showMessageDialog(null, "Program that converts pounds into kg");
		
		double value = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight in pounds: ")); 
		
		convertPoundToKg(value);
		
		
		
	}
	
	static void convertPoundToKg(double value)
	{
		double result = value * 0.454; 
		
		JOptionPane.showMessageDialog(null, value + " pounds is equal to " + result + " Kg.");
	}
}
