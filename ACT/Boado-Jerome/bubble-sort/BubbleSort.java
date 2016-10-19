/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Jerome L.Boado]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

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
        Random aw = new Random();
        
        for(int x = 0; x < capacity; x++){
            int y = aw.nextInt(100);
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
        System.out.print("\n\nSorted Arrays: ");
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
        System.out.print("\n\nPlease enter a number to find: ");
        search = in.nextInt();
        while(left <= right){
            middle = (left + right)/2;
            if(array[middle] == search){
                System.out.print("The value found at Array["+middle+"]: ");
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
        System.out.print("The value not found!");
    }
 }
    public static void main(String[] args) {
        int Laman; 
        Scanner jerome = new Scanner(System.in);
        System.out.print("Enter array size: ");
        Laman = jerome.nextInt();
        BubbleSort Jerome = new BubbleSort(Laman);
        Jerome.getArray();
        Jerome.show();
        Jerome.Sorting();
        Jerome.show();
        Jerome.Search();
    }
    
}
