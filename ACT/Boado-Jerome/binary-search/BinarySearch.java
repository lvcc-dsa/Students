/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Jerome L. Boado]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

import java.util.*;
import java.util.Random;
import java.util.*;
public class BinarySearch {
        int [] arr;
	int index, size, capacity;
	int search = 0;
    public BinarySearch (int size) {
		capacity = size;
		arr = new int [capacity];
        	}
    public void sortArr (int [] num) {
		int temp;
		for (int x = 0; x < num.length - 1; x++) {
			for (int y = 0; y < num.length - 1; y++) {
				if (num[y] > num[y+1]) {
					temp = num[y];
					num[y] = num[y+1];
					num[y+1] = temp;
				}
			}
		}
	}
	public int binarySearch (int [] num, int find) {
		int left, middle, right;
		left = 0;
		right = num.length - 1;
			while (right >= left) {
			middle = (left + right) / 2;
			if (num[middle] == find) {
				return 1;
			}
			if (num[middle] < find) {
				left = middle + 1;
			}
			if (num[middle] > find) {
				right = middle - 1;	
			}
		}

		return -1;
	}
    public static void main(String [] args) {
		Scanner Jerome = new Scanner(System.in);
		Random rand = new Random();
                int userSize, numFind, target;
		System.out.println();
		System.out.print("Enter array size: ");
		userSize = Jerome.nextInt();
		System.out.println();
        BinarySearch objClass = new BinarySearch(userSize);
		System.out.print("Enter number to find: ");
		numFind = Jerome.nextInt();
		System.out.println();
		System.out.println("Array values: ");
		for (int i = 0; i < userSize; i++) {
			objClass.arr[i] = 1+(rand.nextInt(100));
		}
		objClass.sortArr(objClass.arr);
		for (int i = 0; i < userSize; i++) {
			System.out.print("" + objClass.arr[i] + ", ");	
		}
		System.out.println();
		target = objClass.binarySearch(objClass.arr, numFind);
		for (int count = 0; count < userSize; count++) {
			if (objClass.arr[count] == numFind) {
				System.out.println(numFind + " is found at element: " + (count+1) + ".");
			}
		}

		if (target == -1) {
			System.out.println("Number is not found in the array.");
		}
	}
}
