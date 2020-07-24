package assignment9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 23, 2020 
 **/
public class Question45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String pathname = "/Users/coolnabinn/eclipse-workspace/Assignment/src/assignment9/Question45.txt";
		File file = new File(pathname); 
		Scanner scan = new Scanner(System.in);
		Set<String> mySet= new LinkedHashSet<>();
		Set<String> dublic = new LinkedHashSet<>(); 
		String flag; 
		try( FileWriter writer  =  new FileWriter(pathname);
			 BufferedWriter buffWrite = new BufferedWriter(writer);)
				
		{
			
			if(file.createNewFile())
				System.out.println(file.getName() + " file is created....");
			else 
				System.out.println(file.getName() + " file already exists");
			
			
			
			do {
				System.out.print("\n\t Enter name: ");
				String name = scan.next();
				buffWrite.write(name); 
				buffWrite.newLine();
				System.out.print("\n\t press y to add more names to file: ");
				 flag = scan.next();
			} while(flag.equalsIgnoreCase("y"));
			{
				System.out.println("\n\n Added all names to the file........");
			}
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(FileReader reader = new FileReader(pathname);
			BufferedReader buffRead = new BufferedReader(reader);) 	
		{
			// String line= buffRead.readLine(); 
			
			System.out.println("\n\n Reading from file....");
			System.out.println("=================");
			System.out.println("\n\n Printing the dublicate names present in fle.....");
			String line;
			while((line =buffRead.readLine()) != null)
			{
				if(mySet.add(line) == false)
				{		
					dublic.add(line);	
				}
			}
			
			System.out.println("\n\n===================\n");
			for(String i:dublic)
				System.out.print(i + " ");
			System.out.println("\n==========================");
		}catch(IOException e)
		{
			e.getStackTrace();
			
		}
		
	
		scan.close();

	}
	
	
	
}
