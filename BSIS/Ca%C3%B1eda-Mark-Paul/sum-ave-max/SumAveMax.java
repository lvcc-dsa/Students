/*
SOURCE CODE: Sum-Ave-Max
AUTHOR NAME: Mark Paul A. Cañeda
GITHUB URL:  https://github.com/Markpaulcan
LAST UPDATE: October 17, 2016
*/
package sum.ave.max;
import java.util.Scanner;
import java .util.Random;
public class SumAveMax {
    
    public float average = 0;
    public int array[];
    public int capacity;
    public int sum = 0;
    public int max = 0;
    
    public SumAveMax(int size){
        capacity = size;
        array = new int[capacity];
    }
    public void array(){
        Scanner inputDevice = new Scanner(System.in);
        Random rand = new Random();
        for(int x = 0; x < capacity; x++){
            int y = rand.nextInt(10000);
            array[x] = y;
        }
        System.out.println();
    }
    public void show(){
        for(int a = 0; a < capacity; a++){
            System.out.print("Array["+a+"] = " + array[a]);
            System.out.println();
        }
        System.out.println();
    }
    public void getSum(){
        for(int a = 0; a < capacity; a++){
            sum =+ array[a];
        }
        System.out.println("Sum = " + sum);
        System.out.println();
    }
    public void getMax(){
        for(int a = 0; a < capacity; a++){
            if(array[a] > max){
                max = array[a];
            }
        }
        System.out.println("Maximum number = " + max);
        System.out.println();
    }
    public void getAve(){
 
            average = sum/capacity;
            System.out.println("Total Average = " + average);
            System.out.println();
        
    }

    public static void main(String[] args) {
        
        Scanner inputDevice = new Scanner(System.in);
        int arraysize;
        
        System.out.println("Enter the number of arrays:");
        arraysize = inputDevice.nextInt();
        
        SumAveMax Action = new SumAveMax(arraysize);
        
        Action.array();
        Action.show();
        Action.getSum();
        Action.getMax();
        Action.getAve();
    }
    
}
