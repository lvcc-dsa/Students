import java.util.Scanner;
import java.util.Random;
public class SumAveMax {
	
	private int capacitty;
	public int total=0;
	public double average=0;
	public int []array;
	
	public SumAveMax (int size) {
		capacity = size;
		array = new int [capacity];
	}
	public void sum() {
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.print("Sum: "+total+"\n");
	}
	
	
	public void rand() {
			
		Random random = new Random();
		for (int i = 0; i <array.length ; i++) {	
			int x = random.nextInt(1000);
			array[i] = x;
		}
		
		System.out.println(capacity+" RANDOM NUMBERS GENERATED.");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		System.out.println();
		
	}
	
	
	public void average() {
		average = total/array.length;
		System.out.print("Average: "+average+"\n");
	}
	
	public void largest() {
		int largest = 0, max = 0;
		for (int i = 0; i < array.length; i++) {

			if(array[i] > largest){
				max = array[i];
				largest = array[i];
			}
		}
		
		System.out.println("Largest number: "+max);
	}
	
}