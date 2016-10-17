/* @author  [Gerald De Guzman]
* @link    [https://github.com/igooop]
* @version [version number]
* @since   [10/17/2016]
*/


import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	
	 static int size,array[],search,y,x,temp;
	 
	 
	 public void sizeofArray(){    
	    Scanner in = new Scanner(System.in);
	    Random rand = new Random(); 
	    System.out.println("Enter the size of the array: ");
	    size = in.nextInt();
	    array = new int[size];
	     for(int i=0;i<array.length;i++){
	      array[i] = rand.nextInt(1000);
	    } 
	  }
	
	 
	  static int binarySearch(){
		    int left,right,middle;
		    left = 0;
		    right = array.length - 1;
		    
		     Scanner in = new Scanner(System.in);
		     System.out.println("\nEnter the number you are looking for: ");
		     search = in.nextInt();
		  
		     while(left <=right){
		      middle=(left+right) / 2;
		      if (array[middle] ==search){
		        return middle;
		      }
		      else if (array[middle]<search){
		        left = middle + 1;
		      }
		      else{
		        right = middle - 1;
		      }
		    }
		    return -1;
		  }
	
	  
    	
	
	public void randomArray(){
		
		 System.out.println("\n" + size + " random numbers generated.");
	     for ( y = 0; y <= size-1; y++){
	       System.out.print(array[y] + " ");

	       for(x = 0; x < size-y-1; x++){
	         if(array[x] > array[x+1]){
	           temp = array[x];
	           array[x] = array[x+1];
	           array[x+1] = temp;
	         }
	       }
	      }
	      
	      System.out.println("\n\nSorted Numbers:");
	      for(y = 0; y < size; y++){
	      System.out.print(array[y] + " ");
	     }
	      System.out.println("\n\nBubbleSorting Done!.");
	}
	public void show(){
	    int i;
	    
	    for(i = 0; i < array.length; i++){
	      if (search == array[i]){
	        System.out.println("Found at array["+i+"].");
	        break;
	      }
	    }
	    if (i == array.length){
	      System.out.println("Value not found.");
	    }
	  }
	

	

	public static void main (String[] Args){

		BinarySearch summon = new BinarySearch ();
		
		summon.sizeofArray();
		summon.randomArray();
		summon.binarySearch();
		summon.show();
		
		
	
		
	
	}
}
