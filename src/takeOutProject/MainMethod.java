package takeOutProject;

import java.util.Scanner;

public class MainMethod {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int typeOfMeal, typeOfFood,  feeds, trayNeeded, leftOver; 
		double price, subTotalPrice, totalTax, totalTip, grandTotal, perPerson; 
		
		final double  TAXRATE = 0.07; 
		final double TIPRATE = 0.15; 
		
		
		TakeOutMethods obj = new TakeOutMethods(); 
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\n  \t Welcome to NEPAL RESTURANT");
		System.out.println(" \t ==========================\n \n");
		System.out.print(" Please specify order for number of people (must be greater than 10) : ");
		int input = sc.nextInt(); 
		
		
		if (input < 10 )
		{
			System.out.println(" Number of people are invalid. Sorry  ");
			System.out.println("##### END OF THE PROGRAM #####");
			return;
		}
		
			obj.displayMainMenu();
			
			System.out.print("\n Choose a type you would like to order: ");
			typeOfMeal = sc.nextInt(); 
			
			switch(typeOfMeal) {
			
				case 1: 
					
						do {
							obj.displayItalianFoodMenu();	
							typeOfFood = sc.nextInt();
						 
							} while(typeOfFood > 3 || typeOfFood <1);
					
					
						if (typeOfFood == 1)
						{
							price = 17.99;
							feeds = 5; 
						}
						else if (typeOfFood ==2)
						{
							price = 15.99;
							feeds = 7; 
						}
						else 
						{
							price =12.99; 
							feeds = 4;
						}
						
						break;
						
				case 2: 
					
						do	{
							obj.displayChineseFoodMenu();
							typeOfFood = sc.nextInt();
						
							}while(typeOfFood > 3 || typeOfFood < 1);
					
					
						if (typeOfFood == 1)
						{
							feeds = 7; 
							price= 18.99;
						}
						else if (typeOfFood ==2)
						{
							feeds = 7; 
							price =18.99;
						}
						else 
						{
							feeds = 5;
							price = 10.99;
						}
					
						break;
						
				case 3: 
						do 
						{
							obj.displayAmericanFoodMenu();
							
							typeOfFood = sc.nextInt();
							
						}while(typeOfFood > 3  || typeOfFood < 1);
						
						
						if (typeOfFood == 1)
						{
							feeds = 8; 
							price = 21.99;
						}
						else if (typeOfFood ==2)
						{
								feeds = 5; 
								price = 22.99;
						}
						else 
						{
								feeds = 10;
								price = 26.99;
						}
						break; 
				default: 
						System.out.println("\n\n\t You entered invalid option. Thank you.");
						System.out.println("\n\n\t  ##### END OF THE PROGRAM ##### ");
						return; 
			}
			
			// Variable that stores number of trays needed 
			trayNeeded = obj.determineTrays(input, feeds); 
			
			// Variable that stores total price before tax and tips 
			subTotalPrice = obj.getSubtotal(price, trayNeeded); 
			
			// Variable that stores total tax price
			totalTax = obj.getTax(subTotalPrice, TAXRATE);
			
			// Variable that stores total tip price
			totalTip = obj.getTip(subTotalPrice, TIPRATE);
			
			// Variable that stores grand total  after tips and tax 
			grandTotal = obj.getGrandTotal(subTotalPrice, totalTax, totalTip);
			
			// Variable that stores per person charge 
			perPerson = obj.pricePerPerson(grandTotal, input);
			
			// Variable that stores if any left over is there
			leftOver = obj.determineLeftOvers(feeds, trayNeeded, input);
			
			
			//OUTPUTS  DISPLAYED ON THE SCREEN
			System.out.println("\n\t======================================================");
			System.out.println("\n \t !!!!!!!!! HERE IS THE FINAL OUTPUT !!!!!!!!!\n ");
			
			System.out.printf("\n\t You need %d trays "
							   + "\n\n \t Feeds: %d " 
							   + "\n\n \t Price for %d  people ( %d trays): %.2f" 
							   + "\n\n \t Tax: %.2f "
							   + "\n\n \t Tip: %.2f " 
							   + "\n\n \t Total (food, tax, tip): %.2f" 
							   + "\n\n \t Price per person: %.2f"
							   + "\n\n \t Leftover servings for the delivery person: %d"  
							   , trayNeeded, feeds,  input, trayNeeded, 
							   subTotalPrice , totalTax  , totalTip, 
							   grandTotal , perPerson, leftOver);
			
			System.out.println("\n\n\t======================================================");
			System.out.println("\n\n\t  ##### END OF THE PROGRAM ##### ");
			
			
		}
		
	

}
