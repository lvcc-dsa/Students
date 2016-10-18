/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Stephanie Alviar]
* @link    [full github url]
* @version [version number]
* @since   [last updated 6/10/2016]
*/

public class ArrayStack {

   private int capacity;
   private int top = 0;
   private String[] array;
   
   public ArrayStack(int size) {
       capacity = size;
       array = new String[capacity];
   }
   
   public void show() {
       System.out.println("Current Stack Elements: ");
        for (int x = capacity - 1; x >= 0; x--) {
            System.out.println("Stack["+ x +"] = " + array[x]);
        }
       System.out.println("");
   }
   
   private boolean isEmpty() {
       if (array[0] == null) {
           System.out.println("Stack is EMPTY.");
           System.out.println("");
           return true;
       }
       else {
           return false;
       }
   }
   
   private boolean isFull() {
       if (top == capacity) {
           System.out.println("Stack is FULL.");
           System.out.println("");
           return true;
       }
       else {
           return false;
       }
   }
   
   public void push(String val) {
       if (isFull()) {
           System.out.println("Adding FAILED. Element did not push.");
           System.out.println("");
       }
       else {
           System.out.println("... trying to push on stack[" + top + "]");
           array[top] = val;
           top++;
           System.out.println(val + " was SUCCESSFULLY added.");
           System.out.println("");
       }
   }
   
    public void pop() {
        if (isEmpty()) {
            System.out.println("Removing FAILED. No element to pop.");
            System.out.println("");
        }
        else {
            System.out.println("... trying to pop on stack[" + (top-1) + "]");
            top--;
            System.out.println(array[top] + " was SUCCESSFULLY removed.");
            System.out.println("");
            array[top] = null;
        }
    }
    
    public void peek() {
        if (array[top-1] == array[0]) {
            System.out.println("Peek top = " + array[top]);
            System.out.println("");
        }
        else {
            System.out.println("Peek top = " + array[top-1]);
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        ArrayStack arrObj = new ArrayStack(10);
        System.out.println("");
        System.out.println("Storage capacity = " + arrObj.capacity);
        System.out.println("");
        
        arrObj.push("First");
        arrObj.push("Second");
        arrObj.push("Third");
        arrObj.push("Fourth");
        arrObj.push("Fifth");
        arrObj.push("Sixth");
        arrObj.push("Seventh");
        arrObj.push("Eight");
        arrObj.push("Nineth");
        arrObj.push("Tenth");
        arrObj.push("Eleventh");
        
        arrObj.peek();
        arrObj.show();
        
    }
    
}