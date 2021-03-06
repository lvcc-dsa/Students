/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Carlo S. Guevarra]
* @link    [https://github.com/trunks07]
* @version [1.00]
* @since   [last updated 01/10/2016]
*/

import java.util.Scanner;
import java.util.Random;
public class SumAveMax {
		private int capacity;
		private int []array;
		private int sum = 0;
		private int max = 0;
		private double average = 0;
		
		public SumAveMax(int size){
			capacity = size;
			array = new int [capacity];
		}
		private void array(){
			Scanner input = new Scanner(System.in);
			Random rand = new Random();
			for(int i=0;i<capacity;i++){
				int x = rand.nextInt(100);
				array[i] = x;
			}
			System.out.println();
		}
		private void show(){
			
			for(int i = 0;i<capacity;i++){	
				System.out.println("Array["+i+"] = "+array[i]);	
				System.out.println();
			}
			System.out.println();
		}
		private void getSum(){
			for(int i=0;i<capacity;i++){
				sum += array[i];
			}
			System.out.println("Sum = "+sum);
			System.out.println();
		}
		private void getMax(){
			for(int a = 0; a<capacity; a++){
				if(array[a]>max){
					max =array[a];
				}
			}
			System.out.println("Max = "+max);
			System.out.println();
		}
		private void getAverage(){
			average = sum/capacity;
			System.out.println("Average = "+average);
			System.out.println();
		}
		
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
			int arraySize;
			
			System.out.print("Please enter the number of elements :");
			arraySize =input.nextInt();
			
			SumAveMax demo = new SumAveMax(arraySize);
			
			demo.array();
			demo.show();
			demo.getSum();
			demo.getAverage();
			demo.getMax();
		}
	}
