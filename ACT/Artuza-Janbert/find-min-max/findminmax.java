/**
* @author  [Janbert Q Artuza]
* @link    [https://github.com/janbertartuza23]
* @version [1.0]
* @since   [last updated 13/Oct/2016]
*/

import java.util.Scanner;
public class findminmax {
 public static void main(String[]args) {

	 Scanner input = new Scanner(System.in);

	 int [] numbers = {20,45,68,98,32,12};
	 int min = Integer.MAX_VALUE;
	 int max = Integer.MIN_VALUE;
	 
	 System.out.println("this is the numbers: 20,45,68,98,32,12\n");
	 
	 for(int a=0; a<numbers.length; a++) {
		 if(min>numbers[a]){
			 min= numbers[a];
		 }
		   if(numbers[a]>max){
			 max= numbers[a];
		 }
		
	 }
	 System.out.println("smallest value: "+min);
	 System.out.println("largest value: "+max);
	 
 }
}
