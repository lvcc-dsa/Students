/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Stephanie Alviar]
* @link    [https://github.com/Stephanie101]
* @version [version number]
* @since   [last updated 6/10/2016]
*/

import java.util.Scanner;
import java.util.Random;

public class SumAveMax {
    
    public static void main(String[] args) {
        
 Scanner input=new Scanner(System.in);
 Random rand= new Random();
	int size = 0;
	int array[];
	int sum = 0;
	int max=Integer.MIN_VALUE;
		
	System.out.print("Enter array size: ");
	size = input.nextInt();
	array = new int[size];
	System.out.println(size + "random numbers: ");
		
		
	for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]=rand.nextInt(1000));
	}
	sum = 0;
	for(int i=0;i<array.length;i++)
        {
	sum = sum + array[i];
        }
        double ave =(double) sum / array.length;
	System.out.println("Sum = "+ sum);
	System.out.println("Average = "+ ave);
	max = array[0];
        for (int i = 0; i<array.length; i++)
        {
		        
	if(array[i] > max)
        {
	max = array[i];
        }
        }
	System.out.println("Max = " + max);		    
		
 }
    
}