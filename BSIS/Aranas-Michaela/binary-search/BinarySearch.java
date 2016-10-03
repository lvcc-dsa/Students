 /** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
  * DESCRIPTION:
  * 
  * BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array.
  * Each step, the size of array is reduced to half until one single element remain and a match is found.
  * It's worse case algorithmic time complexity is LOGARITHMIC or Ο(log n).
  *
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
  * TO DO:
  * 
  * Accepts keyboard input to set size of array.
  * Generate random numbers to array accordingly.
  * Accepts keyboard input to search for a number.
  * Show search result if number is found and what index position.
  *
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
  * PSEUDOCODE:
  * 
  * START PROGRAM
  * 
  * SET array[], size, x, left = 1, right = size
  * WHILE x not found    
  *  IF left < right 
  *     EXIT: x does not exists.   
  *  SET mid = left + (right - left ) / 2
  *  IF array[mid] < x
  *     SET left = mid + 1
  *  IF array[mid] > x
  *     SET right = mid - 1 
  *  IF array[mid] = x 
  *     EXIT: x found at location mid
  *  END WHILE
  *
  * END PROGRAM 
  *  
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  
  * @author [Aranas, Michaela M.]
  * @link [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Aranas-Michaela/binary-search/BinarySearch.java]
  * @version [1.0]
  * @since [21/09/2016]
 */

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
  private int array [];
  private int capacity;
  private int swap;
  private int left; 
  private int right; // array : numbers.length
  private int middle;
  
  public BinarySearch(int size) {
     capacity = size;
     array = new int[capacity];
     
     left = 0; 
     right = array.length - 1;
     
     for (int k = 0; k < capacity; k++){
       Random rand = new Random();
       array[k] = rand.nextInt(1000);
    }
   }
  
  public void toFind(int search){
    while (left <= right){
      middle = left + (right - left) / 2;
      if (array[middle] == search){
        System.out.println("FOUND: " + search + " is at array["+ middle +"]");
        break;
      } else if (search < array[middle]){
        right = middle - 1;
      } else {
        left = middle + 1;
      } 
      
    }
    if (search != array[middle]){
        System.out.println(search + " is not on the array.");
    }
    
  }
  
  public void bubbleSort(){
    for (int x = 0; x < capacity-1; x++){
      for (int y = 0; y < capacity-x-1; y++){
        if (array[y] > array[y+1]) {
        swap = array[y];
        array[y] = array[y+1];
        array[y+1] = swap;
        }
      }
    }
    System.out.println();
 
    for (int x = 0; x < capacity; x++){
      System.out.print(array[x] + " "); 
    }
  }
   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.print ("Enter array size: ");
    int size =  input.nextInt();
    BinarySearch implement = new BinarySearch(size);
    
    System.out.print(size + " random numbers generated. "); 
    implement.bubbleSort();
    
    System.out.print ("\nEnter number to find: ");
    int search = input.nextInt();
    implement.toFind(search);
    }
}
