/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Joane Pauline S. Maunes]
* @link    [https://github.com/paulineMaunes]
* @version [v.1.0]
* @since   [last updated dd/mm/yyyy]
*/

import java.util.Scanner;
import java.util.Random;

public class SumAveMax {

	private int sum, max, size, array[];
	private float average;

	public SumAveMax() {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];
		System.out.println();
		System.out.println(size + " random numbers generated.");
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(1000);
			System.out.print(array[i] + " ");
			sum += array[i];
			if (array[i] > max)
				max = array[i];			
		}
		System.out.println();
	}

	public void getSum() {
		System.out.println("SUM = " + sum);
	}

	public void getMax() {
		System.out.println("MAX = " + max);
	}

	public void getAverage() {
		average = (float) sum / size; 
		System.out.println("AVERAGE = " + average);
	}

	public static void main(String[] args) {
		SumAveMax demo = new SumAveMax();
		System.out.println();
		demo.getSum();
		demo.getMax();
		demo.getAverage();
	}

}
