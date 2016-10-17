/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Mark Paul Cañeda]
* @link    [Markpaulcan]
* @version [1.0]
* @since   [October 17, 2016]
*/
pack age arrayqueue;
import java.util.Scanner;
public class ArrayQueue {
    private int QSIZE;
	private int[]queue;
	private int capacity= 0;

	public ArrayQueue (int size) {
		this.QSIZE= size;
		this.queue = new int[this.QSIZE];
                System.out.println("|--------------------------------------------------|");
                System.out.println("|---------- ARRAYQUEUE DEQUEUE & DEQUEUE ----------|");
                System.out.println("|--------------------------------------------------|");
	}

	public void show(){
			for (int i=0; i< this.QSIZE;i++){
			System.out.println("QUEUE["+i+"] = " + this.queue[i]);
			
		}
			System.out.println();
	}

	public boolean isFull() {
			if (this.capacity == this.QSIZE) {
				System.out.println ("\nTHE QUEUE IS ALREADY FULL");
				return true;
			} else{
				return false;
			}}
			
	public boolean isEmpty() {
			if (this.capacity == 0){
				System.out.println("THE QUEUE IS EMPTY");
				return true;
			}	else{
				return false;
			}}

	public boolean enqueue (int x) {
			System.out.println("TRYING TO ENQUEUE " + x + "...");
			if (!this.isFull()){
				this.queue[capacity] = x;
				System.out.println("\t\t|*****************************|");
                                System.out.println("\t\t|******* Added ["+x+"]***********|");
			        System.out.println("\t\t|*****************************|");
			
				this.capacity++;
					return true;
			}else{
			  return false;
	 }}

	public void dequeue() {
		 if (isEmpty()) {
		    	System.out.println("REMOVE FAILED, Storage is empty.");
		      System.out.println();
		    } else {
		    int num=queue[0];
		    
		      System.out.println("... trying to dequeue [0] ...");
		      queue[0] = 0;
		      System.out.println(num + " was successfully removed.");
		      System.out.println();
		      for (int a=0; a<capacity-1; a++) {
		    	  this.queue[a]=queue[a+1];
		      }
		      capacity--;
		    }
		 }

	public int peekFront() {
			System.out.println("THE FRONT NUMBER IS : "+queue[0]);
			return this.queue[0];
	}
	public int peekRear() {
		System.out.println("THE REAR NUMBER IS : "+queue[this.capacity-1]);
			return this.queue[this.capacity-1];
	}
	private void rearangeQueue() {
		
		int c, d, swap;

		for (c = 0; c < (QSIZE-1); c++){
			for (d = 0; d < QSIZE -c -1; d++){
				if (this.queue[d] > this.queue [d+1]){
					swap       = this.queue[d];
					this.queue[d]   = this.queue[d+1];
					this.queue[d+1] = swap;
				}
			}
		}
		System.out.println("SORTED ARRAY LIST NUMBERS");
		
		for (c = 0; c < QSIZE; c++){
			System.out.println("QUEUE["+c+"] = " + this.queue[c]);
		}
	}

   public static void main(String[] args) {
        ArrayQueue method = new ArrayQueue(10);
        
		  method.show();
		  method.enqueue(12);
		  method.show();
		  method.dequeue();
		  method.dequeue();
		  method.enqueue (67);
		  method.show();
		  method.enqueue (89);
		  method.enqueue (20);
		  method.enqueue (3);
		  method.enqueue (78);
		  method.enqueue (1);
		  method.enqueue (99);
		  method.show();
		  method.peekFront();
		  method.peekRear();
		  method.show();
		  method.enqueue (25);
		  method.enqueue (60);
		  method.dequeue();
		  method.enqueue (15);
		  method.enqueue (35);
		  method.enqueue(72);
		  method.show();
		  method.rearangeQueue();
	
    }
    
}
