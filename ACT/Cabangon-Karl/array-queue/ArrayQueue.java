/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [karl cabangon]
* @link    [https://github.com/cabangonkulas/WAD-dsa/blob/master/queue.txt]
* @version [version number]
* @since   [last updated 06/10/2016]
*/

public class ArrayQueue {
	private int QSIZE;
	private int[]queue;
	private int nItems = 0;

	public ArrayQueue (int size) {
		this.QSIZE= size;
		this.queue = new int[this.QSIZE];
	}

	public void showQueue(){
			for (int i=0; i< this.QSIZE;i++){
			System.out.println("QUEUE["+i+"] = " + this.queue[i]);
			
		}
			System.out.println();
	}

	public boolean isFull() {
			if (this.nItems == this.QSIZE) {
				System.out.println ("The Queue is already full");
				return true;
			} else{
				return false;
			}}
			
	public boolean isEmpty() {
			if (this.nItems == 0){
				System.out.println("The Queue is Empty");
				return true;
			}	else{
				return false;
			}}

	public boolean enqueue (int num) {
			System.out.println("Trying to enqueue " + num + "...");
			if (!this.isFull()){
				this.queue[nItems] = num;
				System.out.println("\t" + "Added " + num);
				this.nItems++;
					return true;
			}	else{
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
		      for (int a=0; a<nItems-1; a++) {
		    	  this.queue[a]=queue[a+1];
		      }
		      nItems--;
		    }
		 }

	public int peekFront() {
			System.out.println("The front number is : "+queue[0]);
			return this.queue[0];
	}
	public int peekRear() {
		System.out.println("The rear number is : "+queue[this.nItems-1]);
			return this.queue[this.nItems-1];
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
		System.out.println("Sorted list of Numbers");
		
		for (c = 0; c < QSIZE; c++){
			System.out.println("QUEUE["+c+"] = " + this.queue[c]);
		}
	}

	public static void main(String[]args){
		
		ArrayQueue queueFunction = new ArrayQueue(10);
		  queueFunction.showQueue();
		  queueFunction.enqueue(3);
		  queueFunction.showQueue();
		  queueFunction.dequeue();
		  queueFunction.dequeue();
		  queueFunction.enqueue (19);
		  queueFunction.showQueue();
		  queueFunction.enqueue (70);
		  queueFunction.enqueue (81);
		  queueFunction.enqueue (1);
		  queueFunction.enqueue (4);
		  queueFunction.enqueue (19);
		  queueFunction.enqueue (20);
		  queueFunction.showQueue();
		  queueFunction.peekFront();
		  queueFunction.peekRear();
		  queueFunction.showQueue();
		  queueFunction.enqueue (43);
		  queueFunction.enqueue (24);
		  queueFunction.dequeue();
		  queueFunction.enqueue (16);
		  queueFunction.enqueue (13);
		  queueFunction.enqueue(59);
		  queueFunction.showQueue();
		  queueFunction.rearangeQueue();
	}
}
