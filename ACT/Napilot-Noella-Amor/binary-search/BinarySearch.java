/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Noella Amor Napilot]
* @link    [@AmorNapilot]
* @version [version number]
* @since   [10-10-16]
*/

import java.util.Scanner;
import java.util.Random;

public class binarySearch{
  public static void main(String[]args){
  int[] array = new int[10];
  int search, index, size, i, swap;
  
  Scanner input = new Scanner(System.in);
  Random ran = new Random();
  
  System.out.print("Enter array size: ");
  size = input.nextInt();
  array = new int[size];
  
  System.out.println(size+ " random numbers generated: ");
    System.out.println();
    
  for( i = 0; i < size; i++){
    array[i] = ran.nextInt(100);
  BubbleSort(array);
  }
  
  System.out.print("Enter a number to find: ");
  search = input.nextInt();
  index = binarySearch(array, search);
  
  if(index != -1){
  System.out.println("FOUND! At index " + index);
  }
  
  else{
  System.out.println("NOT FOUND!");
  }
  }
  static int binarySearch(int[] numbers, int find){
  int left, right, middle;
  left = 0;
  right = numbers.length - 1;
  while(right >= left){
  middle = left + (right - left) / 2;
  if(numbers[middle] == find){
  return middle;
  }
  else if(numbers[middle] < find){
  left = middle + 1;
  }
  else{
  right = middle - 1;
  }
  }
  return -1;
  }
  static int BubbleSort(int[]args);
  for(int a = 0; a < size - 1; a++){
  for(int b = 0; b < size - i - 1; b++){
  swap = array[b]
  array[b] = array[b+1]
  array[b+1] = swap
  } 
  }
  }
