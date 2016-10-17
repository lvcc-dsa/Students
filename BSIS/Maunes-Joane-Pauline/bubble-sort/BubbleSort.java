/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Joane Pauline S. Maunes]
* @link    [https://github.com/paulineMaunes]
* @version [v.2.0]
* @since   [17/10/2016]
*/

import java.util.Scanner;
import java.util.Random;

public class BubbleSort{
  public static void main(String[]args){
      
    int size, x, y, swap, array[];
    
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.print("Enter array size to Sort: ");
    size = input.nextInt();
    array = new int [size];
    System.out.println(size + " Random numbers to be generated");
        for(x = 0; x < size; x++){
          if(x%10 == 0){
            System.out.println();
          }
            array[x] = rand.nextInt(10000);
            System.out.print(array[x] + "\t");
        }
        
        System.out.println("\n\n" + size + " random numbers are generated");
        System.out.println();
        
        for(x = 0;x < size; x++){
          for(y = 0; y < x; y++){
            if(array[y] > array[y+1]){
            swap = array[y+1];
            array[y+1] = array[y];
            array[y] = swap;
            }
          }
        }
        
        System.out.println("Bubble Sorting.....Done!");
        
        for(x = 0; x < size; x++){
          if(x%10 == 0){
            System.out.println();
          }
            System.out.print(array[x] + "\t");
        }
        
         System.out.println();
         
   }
}
