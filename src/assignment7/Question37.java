package assignment7;

import java.util.Arrays;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Jul 6, 2020 
 **/
public class Question37 {
	
	final static int ROW = 3; 
	final static int COlUMN =3; 
	
	
	public static void matrixSum(int[][] array1, int[][]array2)
	{
		int[][] arr3 = new int[3][3];
		for (int i=0; i< array1.length; i++)
		{
			for (int j=0; j < array1.length; j++)
			{
				arr3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		
		for (int[] ar: arr3)
		{
			System.out.print("\n\t");
			for(int a: ar)
			{
				System.out.print(a + "   ");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{4,5,6},{2,7,8},{3,1,9}};
		
		matrixSum(arr1,arr2); 
		
		
	}

}
