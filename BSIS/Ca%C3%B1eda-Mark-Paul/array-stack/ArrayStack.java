/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* DESCRIPTION: 
*
* A STACK is an ADT (abstract data type) in LIFO order (last in, first out).
* It has 2 main operations: (1) PUSH for adding, and (2) POP for removing elements.
* It is a protected SINGLY LINKED LIST where PUSH and POP are only allowed on the top front or last element in the stack.
* You may also PEEK to show the last element added.
* Implementation can either be in ARRAY or LINKED LIST.
* It's algorithmic complexity is CONSTANT or O(1).
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* TODO: 
* 
* Implement a STACK using ARRAY that can hold a maximum of 10 string values.
* Create operations PUSH, POP, and PEEK.
* Allow PUSH only if the stack is not yet full.
* Allow POP only if the stack is not yet empty.
* Allow PEEK to see the topmost element.
* Show the updated ARRAY STACK everytime you PUSH or POP.
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: ArrayStack.java
* AUTHOR NAME: Mark Paul A. Cañeda
* GITHUB URL:  https://github.com/Markpaulcan
* LAST UPDATE: October 17, 2016
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/
package arraystack;
import java.util.Scanner;
public class ArrayStack {
    private int capacity;
    private int top = 0;
    private String[] storage;
      
    public ArrayStack(int size){
    capacity = size;
    storage = new String[capacity];    
    }
    public void show(){
    
    for(int h = capacity-1; h >= 0; h--){
        System.out.println("Stack["+ h +"] = " + storage[h]);
       }
        System.out.println();
    }
    private boolean isEmpty(){
        
        if(storage[0] == null){  
            System.out.println("STORAGE IS EMPTY.");
           System.out.println();
        
        return true;
    }
    return false;
}
    private boolean isFull(){
        if(top == capacity){
            System.out.println("STORAGE IS FULL.");
            System.out.println();
            return true;
            
        }
        return false;
    }
      public void push(String value) {
    if (isFull()) {
      System.out.println("ADD FAILED");
        System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println("REMOVE FAILED");
        System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = null;
      top--;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }

    public static void main(String[] args) {
        ArrayStack storage = new ArrayStack(10);
      
    System.out.println("STORAGE CAPACITY = " + storage.capacity);
    System.out.println();
    storage.show();
    storage.pop();
    storage.peek();
    storage.push("1");
    storage.show();
    storage.peek();
    storage.push("2");
    storage.show();
    storage.peek();
    storage.push("3");
    storage.show();
    storage.peek();
    storage.push("4");
    storage.show();
    storage.push("5");
    storage.show();
    storage.pop();
    storage.push("6"); 
    storage.push("7"); 
    storage.push("8"); 
    storage.push("9"); 
    storage.push("10"); 
    storage.show();
    storage.pop();
    storage.push("11"); 
    storage.show();
    storage.push("12");
    storage.show();
      
    }
    
}
