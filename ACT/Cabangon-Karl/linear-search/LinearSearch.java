import java.util.Scanner;
import java.util.Random;
public class LinearSearch {
	
	Scanner input =  new Scanner(System.in);
	private int  search, array[], capacity;
	
	public LinearSearch (int size){
		capacity = size;
		array = new int [capacity];
	}
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		int size; int value;
		
		System.out.print("Enter array size: ");
		size = input.nextInt();
		
		LinearSearch method = new LinearSearch(size);
		
		method.generateRandomArray();
		
		System.out.print("\n\nEnter number to find: ");
		value = input.nextInt();
		
		method.search(value);


	}

	
	
		
	public void generateRandomArray() {
		Random rand = new Random();
		System.out.println("\n"+capacity + " RANDOM NUMBERS GENERATED.");
			for( int i = 0; i < capacity; i++){
				array[i] = rand.nextInt(1000);
			}
			
			for(int i = 0; i < capacity; i++){
				System.out.print(array[i] + " ");
			}
	}
	public void search(int value) {
		
		search = value;
		int Found=0;
		for(int i = 0; i < capacity; i++){
			
			if (array[i] == search){
				Found = array[i];
				System.out.print("\nFOUND! " +search + " is at array["+i+"].");
				
			}
		}
		if (Found != search) {
			
			System.out.print("\nNOT FOUND! " +search + " is not in the array.");
			
		}
		
	}
}
