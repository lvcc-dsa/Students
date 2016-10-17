/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Renaldo Valente
* @link    https://github.com/arrowbrave
* @version 1.1
* @since   22/09/2016


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

		for (i = 0; i < size; i++) {
			array[i] = rand.nextInt(1000);
			if (array[i] == search) {
				System.out.println("FOUND: " + search + " is at " + "array["+i+"]");
				break;
			} 			
		}

		if (i == size) {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

}*/

/** 
 * LINEAR SEARCH checks each item in a collection from start to end until a match is found.  
 * 
 * @author [John Michael Cao] 
 * @link  [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Cao-John-Michael/linear-search/LinearSearch.java]
 * @version [final build]
 * @since  [17/10/2016]
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
 
 
   for (i = 0; i < size; i++) { 
    array[i] = rand.nextInt(1000); 
    if (array[i] == search) { 
     System.out.println("FOUND: " + search + " is at " + "array["+i+"]"); 
     break; 
    }     
   } 
 
 
   if (i == size) { 
    System.out.println("NOT FOUND: " + search + " is not in the array."); 
   } 
 
 
  } 
 
 
 } 
