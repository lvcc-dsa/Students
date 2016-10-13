/*
* @author: Kyle Vincent Q. Tan
* @link: https://github.com/elyk18
* @version: v1
* @since: 10/07/2016
*/

import java.util.*;

class BubbleSort {

	public static void main(String[] args) {

		int array[], size, x, y, swap;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.println();
		System.out.print("Enter array size to sort: ");
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

		System.out.println("Bubble Sorting... Done!");
		
		for (x = 0; x < size; x++) {
			System.out.print(array[x] + " ");
		}
		System.out.println();
	}
}
