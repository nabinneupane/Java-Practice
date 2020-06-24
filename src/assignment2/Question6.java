package assignment2;

import java.util.Scanner;

public class Question6 {

static  Scanner input = new Scanner(System.in);  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program to calculate perimeter of circle, rectangel and triangle");
		System.out.println("=============================================");
		
		double rectangle = perimeterRectangle(); 
		System.out.println("\n The perimeter of rectangle is: " + rectangle);
		
		System.out.println("=============================================");
		
		double circle = perimeterCircle();
		System.out.println("\n The perimeter of circle is: " + circle);
		
		System.out.println("=============================================");
		
		double triangle = perimeterTriangle(); 
		System.out.println("\n The perimeter of circle is: " + triangle);
		
		System.out.println("=============================================");
		
		

	}
	
	public  static double perimeterRectangle(){
		
		System.out.print("\n Enter the length of the rectangle: ");
		double l = input.nextDouble(); 
		
		System.out.print("\n Enter the width of the rectangle: ");
		double w = input.nextDouble();  
		
		return (2*(l+w)); 
	}
	
	public static double perimeterCircle(){
		
		System.out.print("\n Enter the radius of the circle: ");
		
		double r = input.nextDouble(); 
		
		return (2*Math.PI * r); 
	}
	
	public static double perimeterTriangle() {
		
		System.out.print("\n Enter the hypotenous of triangle: ");
		double h = input.nextDouble(); 
		
		System.out.print("\n Enter the base of the triangle: ");
		double b = input.nextDouble(); 
		
		System.out.print("\n Enter the perpendicular of the triangle: ");
		double p = input.nextDouble(); 
		
		return (h+b+p); 
	}

}

