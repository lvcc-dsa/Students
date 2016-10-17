/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]


import java.util.*; // note: imports all classes inside java.util

public class BinarySearch {

	static int array[], index, size, search;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];

		System.out.println(size + " random numbers generated.");
		
		for (int i = 0; i < array.length; i++) {
			// TODO: use nextInt() to assign random numbers (range of 1000) to array index
		}
		
		// TODO: call bubbleSort method to sort the generated random numbers
		System.out.println();
		
		System.out.print("Enter number to find: ");
		// TODO: use nextInt() to assign keyboard input as search item	
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

		// TODO: sort the random array first before searching

	}

}*/


/* 
* @author: [John Michael Cao]
 * @link: [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Cao-John-Michael/array-queue/ArrayQueue.java]
 * @version: [final build]
 * @since: [10/17/2016] 
 */ 

 
 import java.util.*; 
 
 
 public class BinarySearch { 
 
 
  static int array [], index, size, capacity;  
  static int search,limit; 
 
 
  public BinarySearch (int size) { 
   capacity = size; 
   array = new int [capacity]; 
  } 
 
  
  public void sorted (int [] num) { 
 
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
 
 
  public int binSearch (int [] num, int find) { 
   int left, mid, right; 
 
   left = 0; 
   right = num.length - 1; 
    
   while (right >= left) { 
    mid = (left + right) / 2; 
    if (num[mid] == find) { 
     return 1; 
    } 
    if (num[mid] < find) { 
     left = mid + 1; 
    } 
    if (num[mid] > find) { 
     right = mid - 1;  
    } 
   } 
   return -1; 
  } 
 
 
  public static void main(String [] args) { 
 
   Scanner console = new Scanner(System.in); 
   Random rand = new Random();  

   System.out.print("Enter array size: "); 
   size = console.nextInt(); 
   System.out.println(); 
 
   BinarySearch objClass = new BinarySearch(size); 
  
   System.out.print("Enter number to find: "); 
   search = console.nextInt(); 
   System.out.println(); 
 
   System.out.println("ARRAY INPUTTED: "); 
   for (int i = 0; i < size; i++) { 
    objClass.array[i] = 1+(rand.nextInt(100)); 
   } 
 
   objClass.sorted(objClass.array); 
 
   for (int i = 0; i < size; i++) { 
    System.out.print("[" + objClass.array[i] + "] ");  
   } 
   System.out.println(); 
 
   limit = objClass.binSearch(objClass.array, search); 
 
   for (int i = 0; i < size; i++) { 
     if (objClass.array[i] == search) { 
       System.out.println(search + " is located at element: " + (i+1) + "."); 
     }  else { 
       System.out.println("NOT FOUND: " + search + " is not in the array."); 
     } break;
   }
  } 
 } 
