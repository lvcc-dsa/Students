/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* SOURCE CODE: BubbleSort.java
* AUTHOR NAME: Sedurante, Norlieta  I.
* GITHUB URL: [https://github.com/lvcc-dsa/Students/BSIS/Sedurante-Norlieta/bubble-sort/BubbleSort.java]
* LAST UPDATE: [10/05/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/
package bubblesort;
import java.util.Scanner;
import java.util.Random;

public class BubbleSort {

   
    public static void main(String[] args) {
       
        
        int size , x, y , swap, array[];
        
        Scanner input = new Scanner (System.in);
        
        Random rand = new Random();
        
        System.out.print(" Enter array size to sort: ");
        
        size = input.nextInt();
        array = new int [size];
        System.out.println();
         System.out.println( size + " Random number to be generated  ");
         
         for ( x = 0; x< size; x++){
		 if(x%10==0){
			System.out.println("");
		}
             array[x] = rand.nextInt(1000);
             System.out.print (array[x] + "\t");
             
         }
         System.out.println();
         
         for (x = 0; x <size-1; x++){
             for  (y= 0 ; y< size-x-1; y++){
              if (array[y] > array [y+1])
              {
                  swap = array [y];
                  array[y] = array [y+1];
                  array [y+1] = swap;
                  
              }
         }
         }
         System.out.println();
         
        System.out.println ("Bubble sorting .... DONE ");
        
        for (x = 0 ; x< size ; x++){
		if(x%10==0){
			System.out.println("");
		}
            System.out.print(array[x] + "\t");
        }
    }
    
}
