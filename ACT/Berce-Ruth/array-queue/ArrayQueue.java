/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Ma.Ruth N. Berce]
* @link    [github.com/maruthberce20]
* @version [version number]
* @since   [last updated 10/18/2016]
*/

public class ArrayQueue {
  
  
  private int capacity;
  private int head;
  private int tail; 
  private int[] storage;
  
 
  public ArrayQueue(int size) {
    capacity = size;
    storage = new int[capacity];
    // todo: initialize values for tail, head, and tail
  } 

  // note: will display the array
  public void show() {
    // note: the top of the queue starts from array[0] then newer item gets added on the tail and removes in the front
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ (i+1) +"] = " + storage[i]);
    }
      System.out.println(); // note: prints optional new line for readability
  }
  
  // note: will check if it's true that the array is empty
  private boolean isEmpty() {
    if (tail == 0) { // note: checks if numbers tail has reached 0 or empty
      System.out.println("Error. Queue is empty."); 
      System.out.println(); 
      return true;
    } 
    return false; // note: defaults to false
  }

  private boolean isFull() {
    if (tail == capacity) { // note: compares if number of tail has reached capacity limit
      System.out.println("Queue is full. "); 
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  // note: will add value to the tail of array
  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("... trying to enqueue on queue[" + (tail-1) + "] ...");
      System.out.println("Adding failed. Queue is full. ");
      System.out.println(); // note: prints optional new line for readability
    } else {
      System.out.println("... trying to enqueue on queue[" + tail + "] ...");
      storage[adjust(head + tail=value]; 
      tail++; 
      System.out.println(value + " was successfully added."); // todo: what does enqueue do?
      System.out.println(); // note: prints optional new line for readability
    }
  }

  // note: will remove value to the head of array
  public int dequeue() {    
    if (isEmpty()) { // note: checks if empty, then stop
      System.out.println("... trying to dequeue head ...");
      System.out.println("No value to removed."); 
      System.out.println(); // prints optional new line for readability
    } else {  
      System.out.println("... trying to dequeue head ...");
      int temp=head; 
      storage[head]=0; 
      adjust(head + 1); // todo: pass the next value as new head
      tail++;
      System.out.println(head + " was successfully removed.");
      System.out.println(); // note: prints optional new line for readability
      return temp; // note: returns the temp as head
    }
    return 0; // note: returns the temp as head
  }

  // note: will wrap the array so we can adjust the position of each value towards the head of array
  private final int adjust(int i) {
    return (i + capacity) % capacity; 
  }

  // note: will show the front value or head of the array
  public int peekHead() {
    System.out.println("Head : " + storage[head]);
    if (isEmpty()) {
      return -1;
    }    
    System.out.println();
    return 0;
  }

  // note: will show the front value or head of the array
  public int peekTail() {
    System.out.println("Tail : " + storage[tail-1]);
    if (isEmpty()) {      
      return -1;
    }
    System.out.println();
    return 0;
  }

  public static void main(String[] args) {
    // note: construct a new array queue and assign 10 as the integer value for the size limit of the stack
    storage.enqueue(10);   
    storage.enqueue(20);    
    storage.enqueue(30);    
    storage.enqueue(40);    
    storage.enqueue(50);
    storage.enqueue(60); 
    storage.enqueue(70); 
    storage.enqueue(80); 
    storage.enqueue(90);    
    storage.enqueue(100); 
    storage.dequeue(); 
    storage.dequeue();
    storage.show();
  }  

}
