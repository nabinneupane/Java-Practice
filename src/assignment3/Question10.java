package assignment3;


import java.util.Scanner; 
import java.lang.Math; 

public class Question10 {

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n Solving the equation s = u * t + (1/2) * a * t^2 ");
		 
		System.out.print("\n Enter the initial velocity: ");
		double u = input.nextDouble();
		
		System.out.print("\n Enter the acceleration: ");
		double a = input.nextDouble(); 
		
		System.out.print("\n Enter the time traveled: ");
		double t = input.nextDouble();
		
		double s = u * t + ((1.0/2.0)* a * Math.pow(t, 2)); 
		
		System.out.println("\n========================================");
		System.out.println("\n The displacement is: " + s);
		System.out.println("\n========================================");
		
		
		
		System.out.println("\n Finding the area of triangle using A=(s*(s-a)*(s-b)*(s-c))^(1/2)....");
		
		System.out.print("\n Enter length of first length: ");
		double fLength = input.nextDouble(); 
		
		System.out.print("\n Enter length of second length: ");
		double sLength = input.nextDouble();
		
		System.out.print("\n Enter length of third length: ");
		double tLength = input.nextDouble();
		
		double side = (fLength+sLength+tLength)/2.0; 
		
		double area = Math.sqrt((side* (side-fLength)* (side- sLength)* (side- tLength)));
		
		System.out.println("\n========================================");
		System.out.println("\n The Area of triangle is: " + area);
		System.out.println("\n========================================");
		
		
		
		System.out.print("\n Solving the equation x = (-b + (b^2 -4ac)^ (1/2))/(2*a) ");
		
		
		System.out.print("\n Enter the value of b: ");
		double b = input.nextDouble();
		
		System.out.print("\n Enter the value of a: ");
		double aa = input.nextDouble();
		
		System.out.print("\n Enter the value of c: ");
		double c = input.nextDouble();
		
		double calc = ((-b + Math.sqrt((Math.pow(b, 2) - 4 * aa *c)))/(2*aa));
		
		System.out.println("\n========================================");
		System.out.println("\n The soluton to the equation is: " + calc);
		System.out.println("\n========================================");
		
	}
}
