/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* @author: Kimberly Orozco
* @link:https://github.com/kimOrozco/DSA/blob/master/QueueExample.java
* @version: n/a
* @since: [10/05/16]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */
package queueexample;

public class QueueExample {
    
    private String[] storage;
    private int tail = 0;
    private int capacity = 0;
    
    public QueueExample(int capacity) {
        this.capacity = capacity;
        this.storage = new String[capacity];
    }

    public static void main(String[] args) {
        
        QueueExample queue = new QueueExample(10);
        System.out.println("STORAGE CAPACITY = " + "10" );
        System.out.println();
        
        queue.enqueue("one");
        queue.show();
        queue.enqueue("two");
        queue.show();
        queue.enqueue("three");
        queue.show();
        queue.enqueue("four");
        queue.show();
        queue.enqueue("five");
        queue.show();
        queue.enqueue("six");
        queue.show();
        queue.enqueue("seven");
        queue.show();
        queue.enqueue("eight");
        queue.show();
        queue.enqueue("nine");
        queue.show();
        queue.enqueue("ten");
        queue.show();
        queue.dequeue();
        queue.show();
        
    }
    
    public void show() {
      for (int i = this.capacity-1; i >= 0; i--) {
          System.out.println("Storage ["+ i + "] = " + this.storage[i]);
      }
      System.out.println();
    }
  
  private boolean isEmpty() {
    if (this.storage[0] == null) {
      System.out.println("Storage is empty");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (this.tail == this.capacity) {
      System.out.println("Storage is full");
      return true;
    } 
    return false;
  }
    
    public  void enqueue(String value){
        if (this.isFull()){
            System.out.println("The queue is full. Sorry we cant add anything anymore. Try to dequeue first.");
            return;
        }
        this.storage[tail++] = value;        
    }
    
    public void dequeue(){
        if (this.isEmpty()){
            System.out.println("The queue is empty. Sorry but we dont have anything to dequeue. Try to enqueue first.");
            return;
        }
        this.storage[0] = null;
        this.rearrange();
        this.tail--;
    }
    
    public void rearrange(){
        for (int i = 1; i < this.capacity; i++){
            String tmp = this.storage[i];
            this.storage[i-1] = tmp;
            this.storage[i] = null;
        }
    }
}


/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/
/**
public class ArrayQueue {
  
  // note: variable declarations
  private int capacity; // note: optional, you may also use array.length
  private int head; // note: value of front item
  private int tail; // note: counter number of tail
  private int[] storage; // note: array is of integer values
  
  // note: constructor = initialize an object instance of the class
  public ArrayQueue(int size) {
    capacity = size; // note: optional, can directly pass a new int[size]
    storage = new int[capacity];
    // todo: initialize values for tail, head, and tail
  } 

  // note: will display the array
  public void show() {
    // note: the top of the queue starts from array[0] then newer item gets added on the tail and removes in the front
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ i +"] = " + storage[]); // todo: use adjust(head+i) to adjust each item's position
    }
      System.out.println(); // note: prints optional new line for readability
  }
  
  // note: will check if it's true that the array is empty
  private boolean isEmpty() {
    if (tail == 0) { // note: checks if numbers tail has reached 0 or empty
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  private boolean isFull() {
    if (tail == capacity) { // note: compares if number of tail has reached capacity limit
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  // note: will add value to the tail of array
  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("... trying to enqueue on queue[" + (tail-1) + "] ...");
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: prints optional new line for readability
    } else {
      System.out.println("... trying to enqueue on queue[" + tail + "] ...");
      storage[adjust(head + tail)]; // todo: assign the value to the adjusted position of head
      tail; // todo: should increment or decrement?
      System.out.println(value + " was successfully _________."); // todo: what does enqueue do?
      System.out.println(); // note: prints optional new line for readability
    }
  }

  // note: will remove value to the head of array
  public int dequeue() {    
    if (isEmpty()) { // note: checks if empty, then stop
      System.out.println("... trying to dequeue head ...");
      System.out.println(" "); // print error message here
      System.out.println(); // prints optional new line for readability
    } else {  
      System.out.println("... trying to dequeue head ...");
      int temp; // todo: pass the value of head to a temporary variable
      storage[head]; // todo: now, empty the value of current head
      adjust(head + 1); // todo: pass the next value as new head
      tail; // todo: should increment or decrement?
      System.out.println(head + " was successfully _________."); // todo: what does dequeue do?
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

}*/
