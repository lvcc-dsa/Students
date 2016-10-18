/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Stephanie Alviar
* @link   https://github.com/Stephanie101
* @version 1.1
* @since   6/10/2016
*/

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        int i, size, search, array[];
	 
	 Scanner input = new Scanner(System.in);
	 Random rand = new Random();
	 
	 System.out.print("Enter array size: ");
	 size = input.nextInt();
	 array = new int[size];
	 
	 System.out.print("Enter number to find: ");
	 search = input.nextInt();
	 
	 for( i = 0; i < size; i++)
         {
            array[i] = rand.nextInt(100);
	 
            if (array[i]==search)
            {
                System.out.println("Found: "+search+"is at "+"array["+i+"]"); 	
                break;
            }	
            
	 }
	 
	 if(i == size)
         {
            System.out.println(search + " is not Found in the array.");
         } 
 }
    
}