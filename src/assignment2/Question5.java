package assignment2;

import java.util.Scanner;

public class Question5 {

	
	static  Scanner input = new Scanner(System.in);  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program to calculate area of circle, rectangel and triangle");
		System.out.println("=============================================");
		
		double rectangle = areaRectangle(); 
		System.out.println("\n The area of rectangle is: " + rectangle);
		
		System.out.println("=============================================");
		
		double circle = areaCircle();
		System.out.println("\n The area of circle is: " + circle);
		
		System.out.println("=============================================");
		
		double triangle = areaTriangle(); 
		System.out.println("\n The area of circle is: " + triangle);
		
		System.out.println("=============================================");
		
		

	}
	
	
	public  static double areaRectangle(){
		
		System.out.print("\n Enter the length of the rectangle: ");
		double l = input.nextDouble(); 
		
		System.out.print("\n Enter the width of the rectangle: ");
		double w = input.nextDouble();  
		
		return (l*w); 
	}
	
	public static double areaCircle(){
		
		System.out.print("\n Enter the radius of the circle: ");
		
		double r = input.nextDouble(); 
		
		return (Math.PI * Math.pow(r, 2)); 
	}
	
	public static double areaTriangle() {
		
		System.out.print("\n Enter the height of triangle: ");
		double h = input.nextDouble(); 
		
		System.out.print("\n Enter the base of the triangle: ");
		double b = input.nextDouble(); 
		
		return (h*b)/2; 
	}

}
