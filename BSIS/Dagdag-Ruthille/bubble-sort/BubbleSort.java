/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Ruthille Dagdag]
* @link    [https://github.com/lvcc-dsa/Students/edit/master/BSIS/Dagdag-Ruthille/bubble-sort/BubbleSort.java]
* @version [version number]
* @since   [18 October, 2016]
*/
import java.util.Random;
public class BubbleSort {
	public static void main(String[] args) {
		
		int capacity, x, y, swap, arraysize[];
		
		Scanner input = new Scanner (System.in); 
		Random rand = new Random ();

		System.out.print("Enter array size to sort: ");
			size = input.nextInt();
		 	array = new int [capacity];
		
		for (int i = 0; i < arraysize.length; i++ ){
			array [i] = rand.nextInt(1000);
		}
		System.out.println();
		
		System.out.println(capacity + " random numbers generated ");
		
		for ( int x = 0; x < capacity; x++){
			array [x] = rand.nextInt(1000);
			System.out.print(arraysize[x] + " ");
			
		}
		
		System.out.println();
		for ( int x=0; x < capacity -1; x++){
		     for ( int y = 0; y< capacity -x -1; y++){
				
			  if (arraysize[y] > arraysize[y+1]){
				swap = arraysize [y];
				arraysize[y] = arraysize [y+1];
				arraysize[y+1] = swap;
			    }
		      }
		}
		
		System.out.println();
		System.out.println("Bubble Sorting Done! ");
		
		for ( int x = 0; x < capacity ; x++){
			System.out.print(arraysize [x] + " ");
		}
	}
