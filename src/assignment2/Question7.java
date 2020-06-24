package assignment2;

import javax.swing.JOptionPane;

public class Question7 {

	
	public static void main (String[] args)
	{
		calculateVolume();
	}
	
	
	static void calculateVolume() {
		
		JOptionPane.showMessageDialog(null, "Program to calculate volume of a given cylinder");
		double r = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of a cylinder"));
		double h = Double.parseDouble(JOptionPane.showInputDialog("Enter height of a cylinder")); 
		
		double volume = Math.PI * Math.pow(r, 2) * h; 
		
		JOptionPane.showMessageDialog(null, "The volume of a given cylinder is: " + volume);
	}
}
