/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

import java.util.*; // note: imports all classes inside java.util

public class BinarySearch {

	static int array[], index, size, search, space;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];

		System.out.println(size + " random numbers generated.");
		
		for (int i = 0; i < array.length; i++) {
			// TODO: use nextInt() to assign random numbers (range of 1000) to array index
			array[i] = rand.nextInt(1000);
		} /* ipapakita yung nagenerate na random numbers
		for (int z = 0; z < array.length; z++) {
                    System.out.print (array[z]+"\t");
                    space+=1;
                    if (space == 5){
                        System.out.println();
                        space=0;
                    } 
                } */
                
		// TODO: call bubbleSort method to sort the generated random numbers
		bubbleSort(array);
		System.out.println();
		
		System.out.print("Enter number to find: ");
		// TODO: use nextInt() to assign keyboard input as search item
		search = input.nextInt();	
		index = binarySearch(array, search); // note: assign the search result to array index where it was found	
		
		if (index != -1) {
			System.out.println("FOUND: " + search + " is at " + "array["+index+"]");
		}
		else {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

	static int binarySearch(int[] numbers, int find) { // note: @param array[], search

		int left, right, middle;
		// TODO: initialize value for left and right
		left = 0;
		right = array.length-1;
                
		
		while (left <= right) {
			middle = left + (right - left) / 2;
			if (numbers[middle] == find) {
				return middle;
			} else if (find < numbers[middle]) {
				right = middle - 1;
			} else { // if numbers[middle] < find
				left = middle + 1;
			}
		}
		return -1; // note: exit loop if not found

	}
	
	static int bubbleSort(int[] arr) {
        int temp = 0;
		// TODO: sort the random array first before searching
		for (int a = 0; a < array.length; a++) {
		   for (int b = 0; b < a; b++) {
   		      if (array[a] < array[b]) {
      		      temp = array[a];
      		      array[a] = array[b];
      		      array[b] = temp;
                      }
		   }
                } /* ipiprint yung sinort na random numbers
                System.out.println();
                System.out.print("Sorted\n");
                for (int z = 0; z < array.length; z++){
                       System.out.print(array[z]+"\t");
                       space+=1;
                       if (space==5){
                           System.out.println();
                           space=0;
                       }
		} */
            return 0;
	}
}

