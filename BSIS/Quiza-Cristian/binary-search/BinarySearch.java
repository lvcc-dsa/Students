/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Cristian E. Quiza]
* @link    [https://github.com/Kirisaite]
* @version [version 1]
* @since   [last updated 9/28/2016]
*/

import java.util.*;
public class BinarySearch{
  
  static int size,array[],search,y,x,temp;
  static void aSize(){    
    Scanner in = new Scanner(System.in);
    Random rand = new Random(); 
    System.out.println("Enter the size of the array: ");
    size = in.nextInt();
    array = new int[size];
     for(int i=0;i<array.length;i++){
      array[i] = rand.nextInt(1000);
    } 
  }
  
  static void aRandom(){
     System.out.println("\n" + size + " random numbers generated.");
     for ( y = 0; y <= size-1; y++){
       System.out.print(array[y] + " ");

       for(x = 0; x < size-y-1; x++){
         if(array[x] > array[x+1]){
           temp = array[x];
           array[x] = array[x+1];
           array[x+1] = temp;
         }
       }
      }
      System.out.println("\n\nSorted Numbers:");
      for(y = 0; y < size; y++){
      System.out.print(array[y] + " ");
     }
  }
     
    static int bSearch(){
    int left,right,middle;
    left = 0;
    right = array.length - 1;
    
     Scanner in = new Scanner(System.in);
     System.out.println("\n\nEnter the number you want to search for: ");
     search = in.nextInt();
  
     while(left <=right){
      middle=(left+right) / 2;
      if (array[middle] ==search){
        return middle;
      }
      else if (array[middle]<search){
        left = middle + 1;
      }
      else{
        right = middle - 1;
      }
    }
    return -1;
  }
  static void show(){
    int i;
    
    for(i = 0; i < array.length; i++){
      if (search == array[i]){
        System.out.println("Found at array["+i+"].");
      }
    }
    if (i == array.length){
      System.out.println("Value not found.");
    }
  }
  public static void main(String[]args){
  BinarySearch yonde = new BinarySearch();
  
   yonde.aSize();
   yonde.aRandom();
   yonde.bSearch();
   yonde.show();
  }
}
