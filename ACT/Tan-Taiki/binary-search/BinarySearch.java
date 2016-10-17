

/**
 *
 * @author taiki nakamura
 */
import java.util.Scanner;
import java.util.Random;
public class BinarySearch {

    
    public static void main(String[] args) {
        int [] array = new int[10];
        int search = 0, index;
        Scanner copy = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = copy.nextInt();
        }
        
        System.out.println("Enter number to find: ");
        search = copy.nextInt();
        index = binarySearch(array, search);
        if(index != -1){
            System.out.println("FOUND at index " + index);
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
    
    static int binarySearch(int [] numbers, int find){
        int left, right, middle;
        left = 0;
        right = numbers.length -1;
        while(left <= right){
            middle = left +(right + left)/2;
            if(numbers[middle] == find){
                return middle;
            }
        else if(numbers[middle] < find){
                left = middle + 1;
            }
            else{
                right = middle -1;
            }
        } 
        return -1;
    }
}
