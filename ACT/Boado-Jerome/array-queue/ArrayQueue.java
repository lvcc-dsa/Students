/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Jerome L. Boado]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

public class ArrayQueue {
	private int queue[];
	private int aw = 0;
	private int capacity;
	private int front = 0;	
	public ArrayQueue(int size){
		capacity = size;
		queue = new int[capacity];
			}
	public void show(){
		for(int i=0;i<capacity;i++){
			System.out.println("index["+(i+1)+"]: "+queue[i]);
		}System.out.println();
	}
	public boolean isFull(){
		if (aw == capacity){
			System.out.println("You have reached the maximum limit of queue!");
			System.out.println();
			return true;
		}return false;
	}
	public boolean isEmpty(){
		if (front == aw){
			System.out.println("Queue is Empty!");
			System.out.println();
			return true;
			}return false;
	}
	public void enqueue(int value){
		if(isFull()==true){
			System.out.println("Error Enqueuing!");
		}
		else if(isEmpty()==true){
			System.out.println("Trying to enqueue: "+value);
			queue[aw]= value;
			queue[front] = value;
			aw++;
			System.out.println("Enqueue Successful");
		}
		else{
			System.out.println("Trying to enqueue: "+value);
			queue[aw]= value;
			aw++;
			System.out.println("Enqueue Successful");
		}
			System.out.println();
	}
	public void dequeue(){
		if(isEmpty()==true){
			System.out.println("Error Dequeuing!");
			return;
		}
			else if(front == aw) {
			System.out.println("Error Dequeuing!");
				}
		else{
			System.out.println("Trying to Dequeue "+queue[front]+"...");
			queue[front]=0;
			front++;
		}
		}
		public void peekFront(){
		System.out.println("Front Value: "+queue[front]);
	}
	
	public void peekRear(){
		System.out.println("Rear Value: "+queue[aw-1]);
	}
	
	public void rearrange(){
	 if(isEmpty()==true){
			System.out.println("Unable to Rearrange!");
							}
		else{
			System.out.println("Rearranging indexes...");
			do{for(int i=0;i<aw;i++){
				queue[i] = queue[i+1];
					}
			for(int i=aw;i<capacity;i++){
				queue[i]=0;
			}
			front = 0;
			aw= aw-1;
			}while(queue[front]==0);
		}
		System.out.println("Rearrange Successful!");
	}
	public static void main(String[] args) {
		ArrayQueue QueueApp = new ArrayQueue(10);
		QueueApp.show();
		QueueApp.enqueue(12);
		QueueApp.enqueue(12);
		QueueApp.show();
		QueueApp.peekFront();
		QueueApp.peekRear();
		QueueApp.enqueue(33);
		QueueApp.enqueue(37);
		QueueApp.show();
		QueueApp.peekFront();
		QueueApp.peekRear();
		QueueApp.dequeue();
		//trigger rearrange()
		QueueApp.rearrange();
		QueueApp.show();
		QueueApp.peekFront();
		QueueApp.peekRear();
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.show();
		QueueApp.peekFront();
		QueueApp.peekRear();
		QueueApp.enqueue(745);
		QueueApp.enqueue(95);
		QueueApp.enqueue(53);
		QueueApp.enqueue(79);
		QueueApp.rearrange();
		QueueApp.show();
		QueueApp.peekFront();
		QueueApp.peekRear();
		QueueApp.enqueue(458);
		QueueApp.enqueue(53);
		QueueApp.show();
		QueueApp.peekFront();
		QueueApp.peekRear();
    QueueApp.enqueue(56);
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.dequeue();
		QueueApp.show();
		
		

	}

}
