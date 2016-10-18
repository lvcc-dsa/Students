/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = new int[10];
        int search = 0, index;
        
        System.out.println("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        
        System.out.print("Enter number to find: ");
        search = input.nextInt();
        index = binarySearch(array, search);
        
        if(index != -1){ //from return -1
            System.out.println("FOUND at index " + index);
        }else{
            System.out.println("NOT FOUND");
        }
    }
    
    static int binarySearch(int[] numbers, int find){ //numbers[] new array , new int find
        int left, right, middle;
        left = 0;
        right = numbers.length -1; //9
        
        while (left <= right){
            middle = (left + right) / 2; //0+9 = 9/2 = 4
            if(numbers[middle] == find){
                return middle;
            }else if(numbers[middle] < find){
                left = middle + 1; //2nd half
            }else{
                right = middle - 1; //first half
            }
        }
        return -1;
    }
}
