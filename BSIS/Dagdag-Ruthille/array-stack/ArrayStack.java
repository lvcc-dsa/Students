/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Ruthille Dagdag]
* @link    [https://github.com/lvcc-dsa/Students/edit/master/BSIS/Dagdag-Ruthille/array-stack/ArrayStack.java]
* @version [version number]
* @since   [28 september 2016]
*/

public class ArrayStack {

 
  private int capacity; 
  private int top = 0; 
  private String[] storage; 
  
  public ArrayStack(int size) {
    
    storage = new String[size]; 
  }

  public void show() {
    
    for (int i = capacity-1; i >= 0; i--) {
      System.out.println("stack[" + i + "] = " + storage[i] );
    }
    System.out.println(); 
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) { 
      System.out.println("Storage is empty "); 
      System.out.println();
      return true;
    } 
    return false; 
  }

  
  private boolean isFull() {
    if (top == capacity) { 
      System.out.println("Storage is full");
      return true;
    } 
    return false; 
  }

  public void push(String value) {
    System.out.println("... trying to push on stack[" + top + "] ...");
    if (isFull()) {
      System.out.println("ADD FAILED "); 
      System.out.println(); 
    } else {      
      storage[top]; 
      top++; 
      System.out.println(value + " was successfully added."); 
      System.out.println(); }
  }
 

  public void pop() {
    System.out.println("... trying to pop stack[" + (top-1) + "] ...");
    if (isEmpty()) { 
      System.out.println("POP FAILED"); 
      System.out.println(); 
    } else {      
      storage[top]; 
      top;
      System.out.println(storage[top] + " was successfully removed."); 
      System.out.println();
    }
  }

  
  public void peek() {
    if (isEmpty()) { 
      System.out.println("PEEK TOP = NULL");
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
   
		ArrayStack storage = new ArrayStack(10);
		storage.show();
		storage.pop();
		storage.peek();
		storage.push("one");
		storage.show();
		storage.pop();
		storage.peek();
		storage.push("two");
		storage.show();
		storage.pop();
		storage.peek();
		storage.push("three");
		storage.show();
		storage.pop();
		storage.peek();
		storage.push("four");
		storage.show();
		storage.pop();
		storage.peek();
		storage.push("five");
		storage.show();
		storage.pop();
		storage.peek();
		storage.push("six");
		storage.show();
		storage.pop();
		storage.peek();
		storage.push("seven");
		storage.show();
		storage.pop();
		storage.peek();
		storage.push("eight");
		storage.show();
  }  

