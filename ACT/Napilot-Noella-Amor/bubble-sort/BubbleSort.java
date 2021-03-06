/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Noella Amor Napilot]
* @link    [@AmorNapilot]
* @version [version number]
* @since   [10-05-16]
*/

import java.util.Scanner;
import java.util.Random;

public class BubbleSort{
  public static void main(String[] args){
  int num, a, b, swap;
  
  Scanner input = new Scanner(System.in);
  Random ran = new Random();  
  System.out.println("Enter array size to sort:");
    num = input.nextInt();
    int array[] = new int[num];
  
    System.out.println(num + " Random numbers");
    System.out.println(" ");
    for (a = 0; a < num; a++){
         array[a]= ran.nextInt(100);
   /**System.out.print("Please enter a number:"); 
    array[a] = input.nextInt(); - this line is used if you need inputed numbers
      and not random that already declared*/
    
    }
      for (a = 0; a < (num-1); a++){
        
        for (b = 0; b < num-a-1; b++){
          if (array[b] > array[b+1]){
          swap = array[b];
          array[b] = array[b+1];
          array[b+1] = swap;
          }
        }        
      }
      for (a = 0; a < num; a++){
      System.out.println("Sorted list numbers are: " + array[a]);
      }
    }
  }
