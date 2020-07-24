package extraAssignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 23, 2020 
 **/
public class CountNoOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountNoOfString obj = new CountNoOfString(); 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\t Program to count occurrence of the given string\n");
		System.out.println("\t================\n");
		
		System.out.print("\n Enter the sentence: ");
		String str = scan.nextLine(); 
		
		
		obj.stringNumber(str.toLowerCase());
		
		scan.close();
	}

	
	public void stringNumber( String str)
	{
		String[] arr =str.split(" "); 
		
		Map<String,Integer> myMap = new LinkedHashMap<>(); 
		
		for(int i=0; i<arr.length; i++)
		{
			
			if(myMap.containsKey(arr[i]))
				myMap.replace(arr[i], (myMap.get(arr[i]))+1);
			else 
				myMap.put(arr[i], 1);
			
		}
		
		System.out.println("\n\n\t" + myMap.entrySet());
		
		for (Map.Entry<String, Integer> item: myMap.entrySet()) {
			 System.out.println("\n\t" + item.getKey() + " : " + item.getValue());
		}
	}
}
