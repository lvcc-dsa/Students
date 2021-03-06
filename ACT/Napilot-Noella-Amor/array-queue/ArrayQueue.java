/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Noella Amor Napilot]
* @link    [ @AmorNapilot]
* @version [version number]
* @since   [10-06-16]
*/
public class ArrayQueue {

    int top;
    int rear;
    int capacity;
    String queue[];
    int Csize = 0;

    public ArrayQueue (int size){
    capacity = size;
    queue = new String[capacity];
    }
    
       public boolean isEmpty(){
        if((top == -1) && (rear == -1)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull(){
        if(capacity-1 == rear){
            return true;
        } else {
            return false;
        }
    }
    
    public void enqueue(int value){
      if (isFull()){
    System.out.println("Failed to add an element" +value);
      }else{
      rear++;
      if (rear == capacity-1){
        rear = 0;
      }
      Csize++;
      System.out.println("Element " + value + " is pushed to queue.");
      }
    }
      public void dequeue(){
    if (isEmpty()){
    System.out.println("Failed to remove an element.");
    }else{
      top++;
      if(top == capacity-1){
        System.out.println("Pop operation done! Elemenet removed: " +queue[top-1]);
      top = 0;
      }else{
        System.out.println("Underflow!");
      }
    Csize--;
    }
    }

     public static void main(String[] args) {
   ArrayQueue queue= new ArrayQueue(6);
  queue.enqueue(1);
  queue.dequeue();
  queue.enqueue(2);
  queue.enqueue(3);
  queue.dequeue();
  queue.enqueue(4);
  queue.dequeue();
  queue.dequeue();
  queue.enqueue(5);
  queue.dequeue();
  queue.enqueue(6);
}
}
