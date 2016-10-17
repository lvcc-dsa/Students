/******************************************************************************
 * SORTING is the process of arranging items in ascending or descending order.
 *         This process can be implemented via many different algorithm's. 
 *****************************************************************************/
/*
SOURCE CODE: BubbleSort
AUTHOR NAME: Mark Paul A. Caneda
GIHUB URL:   https://github.com/Markpaulcan
LAST UPDATE: October 17, 2016
*/

package bubblesort;
import java.util.Scanner;
import java.util.Random;
public class BubbleSort {
    
    public int array[];
    public int capacity;
    
    public BubbleSort(int size){
        capacity = size;
        array = new int[capacity];
    }
    private void getArray(){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        for(int x = 0; x < capacity; x++){
            int y = rand.nextInt(100);
            array[x] = y;
        }
        System.out.println();
    }
    private void Sorting(){
        int swap;
        for(int y = 0; y < capacity-1; y++){
            for(int b = 0; b < capacity-b-1; b++){
                if(array[b] > array[b+1]){
                    swap = array[b];
                    array[b] = array[b+1];
                    array[b+1] = swap;
                }
            }
        }
        System.out.println("\n\nSorted Arrays\n");
    }
    private void show(){
        int last = 0;
        for(int x = 0; x < capacity; x++){
            System.out.print(array[x] + " ");
            last += 1;
            if(last == 10){
                System.out.println();
                last = 0;
            }
         
        }
        
    }
    private void Search(){
        
        int left,
            right,
            middle,
            search;
        
        middle = 0;
        left = 0;
        right = capacity - 1;
        
        Scanner in = new Scanner(System.in);
        System.out.println("\n\nPlease enter a number to find:");
        search = in.nextInt();
        
        while(left <= right){
            middle = (left + right)/2;
            if(array[middle] == search){
                System.out.println("The value found at Array["+middle+"]");
                break;           
            }
            else if (array[middle] < search){
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        if(array[middle]!= search){
        System.out.println("The value not found!");
    }
 }
    public static void main(String[] args) {
        
        int size; 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter array size:");
        size = in.nextInt();
        
        BubbleSort paul = new BubbleSort(size);
        
        paul.getArray();
        paul.show();
        paul.Sorting();
        paul.show();
        paul.Search();
    }
    
}
