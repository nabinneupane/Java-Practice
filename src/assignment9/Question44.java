package assignment9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 23, 2020 
 **/
public class Question44 {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// /Users/coolnabinn/eclipse-workspace/Assignment/src/assignment9/Question44.java
		
		String pathname ="/Users/coolnabinn/eclipse-workspace/Assignment/src/assignment9/input.txt";
		File file = new File(pathname); 
		Scanner scan = new Scanner(System.in);
		String [] arr = new String[2];  
		
		ArrayList<String[]> newArr  = new ArrayList<String[]>();
		
		
		
		
		
		
		
		try (FileWriter writer = new FileWriter(pathname); 
				BufferedWriter buffWrite = new BufferedWriter(writer)) {
		if(file.createNewFile())
			System.out.println("File named " + file.getName() + " is created.");
		else
			System.out.println("File named " + file.getName() + " already exists.");
		
		int len =1; 
		while(len <=5)
		{
			System.out.println("\n" + len + ". ");
			System.out.print("\n\t Enter name: ");
			String name = scan.next(); 
			System.out.print("\n\t Enter address: ");
			String address = scan.next();
			
			buffWrite.write("Name: " + name + " \t\t" + "Address: " + address);
			buffWrite.newLine();
			len++;
		}
		}catch(IOException ae)
		{
			ae.printStackTrace();
		}
		
		
		try (FileReader reader = new FileReader(pathname); 
				BufferedReader buffRead = new BufferedReader(reader); 
				){
			
			String count; 
			String[] seperate; 
			while((count = buffRead.readLine()) != null)
			{
				seperate = count.split(" ");
				newArr.add(seperate);
			}
			
			System.out.print("\n\n\tEnter the name stored in file to find the address: ");
			String input = scan.next(); 
			
			System.out.println("\n===============================");
			
			
			for(String[] i: newArr)
			{
				//System.out.println(Arrays.toString(i));
				if(i[1].equals(input))
					System.out.println("\n The address of " + i[1] + " is: " + i[3]);
			}
			
		}catch(IOException ae)
		{
			ae.printStackTrace();
		
		}
		
		scan.close();
	}

}
