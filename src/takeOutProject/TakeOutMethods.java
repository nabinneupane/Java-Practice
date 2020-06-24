package takeOutProject;

public class TakeOutMethods {

	
	public static void displayMainMenu() {
		
		System.out.println("\n\t CHOSE TYPE OF MEAL");
		System.out.println("\t ====================");
		System.out.println("\t 1. Italian"
				+ 		  "\n\t 2. Chinese"
				+ "\n\t 3. American ");
		
	}
	
	public static void displayItalianFoodMenu() {
		
		System.out.println("\n\t CHOSE ONE");
		System.out.println("\t =====================");
		
		System.out.println("\t 1. Lasagna Tray - Feeds 5 - 17.99 "
						+"\n\t 2. Pizza Pack - Feeds 7 - 15.99 "
						+"\n\t 3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");	
		System.out.print("\n Enter food tray to order: ");
		
	}
	
	public static void displayChineseFoodMenu() {
		
		System.out.println("\n\t CHOSE ONE");
		System.out.println("\t =====================");
		
		System.out.println("\t 1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls)- Feeds 7 - 18.99 "
						+"\n\t 2. Sweet and Sour Pork (includes 7 hot and sour soups, 7 egg rolls)- Feeds 7 - 18.99 "
						+"\n\t 3. Shrimp Fried Rice Tray (includes 10 egg rolls)- Feeds 5 - 10.99");
		System.out.print("\n Enter food tray to order: ");
	}
	
	public static void displayAmericanFoodMenu() {
		
		System.out.println("\n\t CHOSE ONE");
		System.out.println("\t =====================");
		
		System.out.println("\t 1. Hamburger and Hot DOg Tray- includes buns and condiments - Feeds 8 - 21.99 "
						+"\n\t 2. Grilled Chicken Sandwich and Mozzarella Sticks Tray- includes dipping sauces- Feeds 5 - 22.99 "
						+"\n\t 3. Barbeque Tray- includes buns and peach cobbler- Feeds 10 - 26.99");	
		System.out.print("\n Enter food tray to order: ");
	}
	
	public static int determineTrays(int people, int feeds) {
		
		if(people % feeds == 0 )
			return (people/feeds); 
		else 
			return (people/feeds) +1; 
	}
	
	public static double getSubtotal(double price, int trays)
	{
		return (price * trays); 
	}
	
	
	public static double getTax(double subtotal, double taxrate)
	{
		return (taxrate * subtotal);
	}
	
	public static double getTip(double subtotal, double tipRate) {
		
		
		return (subtotal * tipRate); 
	}
	
	public static double getGrandTotal(double subtotal, double tax, double tip)
	{
		return (subtotal + tax + tip); 
	}
	
	public static double pricePerPerson(double grandTotal, int people)
	{
		return (grandTotal / people);
	}
	
	public static int determineLeftOvers(int feeds, int trays, int people)
	{
		return ((feeds* trays)- people);
	}
	
}
