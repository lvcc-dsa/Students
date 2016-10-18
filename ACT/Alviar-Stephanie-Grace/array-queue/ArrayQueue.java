/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Stephanie Alviar]
* @link    [https://github.com/Stephanie101]
* @version [version number]
* @since   [last updated 6/10/2016]
*/

public class ArrayQueue {
     
    private int capacity;
    int queueArray[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;
     
    public ArrayQueue(int queueSize){
        this.capacity = queueSize;
        queueArray = new int[this.capacity];
    }

    public void enqueue(int item) {
        if (queueIsFull()) {
            System.out.println("Overflow! Unable to add element: "+item);
        } else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArray[rear] = item;
            currentSize++;
            System.out.println("Element " + item+ " is pushed to Queue.");
        }
    }
 
    public void dequeue() {
        if (queueIsEmpty()) {
            System.out.println("Underflow! Unable to remove element from Queue.");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Pop operation done! Element removed: "+queueArray[front-1]);
                front = 0;
            } else {
                System.out.println("Pop operation done! Element removed: "+queueArray[front-1]);
            }
            currentSize--;
        }
    }
 
    public boolean queueIsFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
 
    public boolean queueIsEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
     
    public static void main(String a[]){
         
        ArrayQueue queue = new ArrayQueue(4);
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
        queue.enqueue(7);
        queue.enqueue(8);
        queue.dequeue();
        queue.enqueue(9);
    }
}
