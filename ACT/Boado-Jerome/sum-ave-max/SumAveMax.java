/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Jerome L. Boado]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

import java.util.Scanner;
import java.util.Random;
public class SumAveMax {

public static void main(String[] args) {
Scanner Jerome = new Scanner(System.in);
Random jerome = new Random();
System.out.print("Enter Array Size? ");
    int Jer = Jerome.nextInt();
    int Laman[]= new int[Jer];
    for (int j = 0; j < Laman.length; j++) {
        Laman[j] = jerome.nextInt(100)+1;
        System.out.println(" Random number for?  ["+(j+1)+"]: "+Laman[j]);
    }
       int total = 0;
        for (int i = 0; i < Laman.length; i++) {
        total = total+Laman[i];
    }
        System.out.println("SUM = "+ total);
        double average = total/Laman.length;
        System.out.println("Avarage = "+ average);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Laman.length; i++) {
               if ( Laman[i] > max)
                max = Laman[i];
        }
   
        System.out.println("MAX = "+max);
        
                    
        
    
}
}
