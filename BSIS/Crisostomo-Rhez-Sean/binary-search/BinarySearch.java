import java.util.Scanner;
import java.util.Random;
public class BinarySearch {
 
 Scanner input =  new Scanner(System.in);
 private int  search, array[], capacity;
 
 public BinarySearch (int size){
  capacity = size;
  array = new int [capacity];
 }
 
 public void GenerateRandom() {
  Random rand = new Random();
  System.out.println("\n"+capacity + " RANDOM NUMBERS GENERATED.");
  
  for (int i = 0; i < array.length; i++) {
   array[i] = rand.nextInt(1000);
  }
 }
 
 public void bubbleSort() {
  
  
  for (int i = 0; i < capacity-1; i++) {
   for (int j = 0; j < capacity-i-1; j++) {
    if (array[j] > array[j+1]) {
     int swap = array[j];
     array[j] = array[j+1];
     array[j+1] = swap;
    }
   }
  }
  
  for ( int i = 0; i < capacity; i++) {
   System.out.print(array[i] + " ");
  }
  
 }

 
 public void Search(int find) {
  int left = 0, right = array.length-1, middle;
  // TODO: initialize value for left and right
  
  
  while (left <= right) {
   middle = left + (right - left) / 2;
   if (array[middle] == find) {
    System.out.print("\nFOUND! " + find + " is at array[" + middle +"].");
    return;
   } else if (find < array[middle]) {
    right = middle - 1;
   } else { // if numbers[middle] < find
    left = middle + 1;
   }
  }
  if (left > right) {
   System.out.print("\nNOT FOUND! " + find + " is not in the array.");
  }
  
 }
 
 public static void main(String [] args){
  
  Scanner input = new Scanner(System.in);
  int size; int value;
  
  System.out.print("Enter array size: ");
  size = input.nextInt();
  
  BinarySearch implement = new BinarySearch(size);
  
  implement.GenerateRandom();
  implement.bubbleSort();
  
  System.out.print("\n\nEnter number to find: ");
  int find = input.nextInt();
  
  implement.Search(find);
 }
}