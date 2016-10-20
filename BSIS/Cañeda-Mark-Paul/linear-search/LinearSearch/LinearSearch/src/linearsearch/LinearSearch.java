/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Mark Paul Cañeda
* @link    https://github.com/Markpaulcan
* @version 1.0
* @since   October 17, 2016
*/
package linearsearch;
import java.util.Scanner;
import java.util.Random;
public class LinearSearch {
    
   int size, search;
   int[] array;
   
   Scanner input = new Scanner(System.in);
   public void getSize(){
    System.out.print("Enter the size of Array: ");
    size = input.nextInt();
    array = new int[size];
   }
   public void getRandom(){
    Random rand = new Random();
    System.out.print("\n");
    for(int i=0; i<array.length; i++){
     array[i] = rand.nextInt(100);
     System.out.println("Array[" +i+ "] = " + array[i]);
    }
   }
   public void getSearch(){
    int i;
    System.out.print("\n");
    System.out.print("Enter the number you want to search: ");
    search = input.nextInt();
    for (i = 0; i < array.length; i++){
     if(search == array[i]){
      System.out.println("The number is found at Array["+i+"]");
      break;
     }
    }
    if (i == array.length){
     System.out.print("Value not found.");
    }
   }
 
    public static void main(String[] args) {
        
    LinearSearch yonde = new LinearSearch();
    
    yonde.getSize();
    yonde.getRandom();
    yonde.getSearch();
   
    }
    
}
