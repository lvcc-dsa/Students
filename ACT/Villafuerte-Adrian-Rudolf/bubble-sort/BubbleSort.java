/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Adrian Villafuerte]
* @since   [last updated 06/10/2016]
*/

import java.util.*;

class BubbleSort {

	public static void main(String[] args) {

		int array[], size, x, y, swap;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.println();
		System.out.print("How many numbers are to be sorted: ");
		size = input.nextInt();
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers generated.");

		for (x = 0; x < size; x++) {
			array[x] = rand.nextInt(1000);
			System.out.print(array[x] + " ");
		}

		System.out.println();
		// note: compare each from the first index until largest number is moved to the last index.
		for (x = 0; x < size-1; x++) { // note: loop until before the end of array
			for (y = 0; y < size-x-1; y++) { // note: will not loop to numbers already sorted
				if (array[y] > array[y+1]) { // note: compare adjacent numbers which is greater
					swap = array[y]; // note: swap positions...
					array[y] = array[y+1]; // note: smaller will be move to the left
					array[y+1] = swap; // note: larger will move to the right
				}
			}
		}

		System.out.println();

		System.out.println("After Sorting.");
		
		for (x = 0; x < size; x++) {
			System.out.print(array[x] + " ");
		}
		System.out.println();
	}
}
