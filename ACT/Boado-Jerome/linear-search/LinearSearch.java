/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Jerome L. Boado
* @link    https://github.com/arrowbrave
* @version 1.1
* @since   22/09/2016
*/

import java.util.Scanner;
import java.util.Random;
public class LinearSearch {

    public static void main(String[] args) {
    Scanner Jerome = new Scanner(System.in);
    Random jerome = new Random();
    int Laman[];
    System.out.print("Enter Array Size? ");
        int Size = Jerome.nextInt();
         Laman= new int[Size];
        System.out.print("Find number: ");   
        int find = Jerome.nextInt();
    for (int j = 0; j < Laman.length; j++) {
        Laman[j] = jerome.nextInt(100)+1;
        if (Laman[j]==find){
            System.out.println("Found "+find+" at array ["+j+"]");
        }
        if (j==Laman.length-1){
            System.out.println("Not Found "+find);
        }
       
        }
    }
    
}
