/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Joane Pauline S. Maunes]
* @link    [https://github.com/paulineMaunes]
* @version [v.1.5]
* @since   [17/10/2016]
*/

import java.util.*;

public class BinarySearch {

	static int array[], index, size, search;
        
        public static void BubbleSort(){
            
            int x, y, temp;
            
            for(x = 0; x < size-1; x++){
              for(y = 0; y < size-1; y++){
                  if (array[y] > array[y+1]){
                  temp = array[y+1];
                  array[y+1] = array[y];
                  array[y] = temp;
                  }
             }
            }
             for(int a =0; a < size;a++){
                  if(a%10 == 0){
                     System.out.println();
                  }
                System.out.print(array[a]+ "\t");
            }
        }

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];

		System.out.println(size + " random numbers generated.");
		
		for (int i = 0; i < array.length; i++) {
                    array[i] = rand.nextInt(10000);
		}
		BinarySearch.BubbleSort();
		System.out.println();
		
		System.out.print("Enter number to find: ");
		search = input.nextInt();	
		index = binarySearch(array, search);	
		
		if (index != -1) {
			System.out.println("FOUND: " + search + " is at " + "array["+index+"]");
		}
		else {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

	static int binarySearch(int[] numbers, int find) { 

		int left = 0,  right = size-1, middle = left + (right-left) / 2;
		
		
		while (left <= right) {
			middle = left + (right - left) / 2;
			if (numbers[middle] == find) {
				return middle;
			} else if (find < numbers[middle]) {
				right = middle - 1;
			} else { 
				left = middle + 1;
			}
		}
		return -1; 

	}
