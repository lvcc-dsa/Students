/**
* Java implementation of a stack using array.* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]


public class ArrayStack {

  // note: variable declarations
  private int capacity; // note: max length of array
  private int top = 0; // note: initialize a default value of top
  private String[] storage; // note: array is of string values
  
  // note: constructor = initialize an object instance of the class
  public ArrayStack(int size) {
    // todo: pass the value of size to capacity
    storage = new String[/*__________]; // todo: update the array capacity
  }

  // note: will display the array
  public void show() {
    // note: the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = capacity-1; i >= 0; i--) {
       note: should print like this: 
      stack[9]   = 10th value
      stack[8]   = 9th value
      stack[7]   = 8rd value
      ....  
      stack[1]   = 2nd value
      stack[0]   = 1st value
      *
    }
    System.out.println(); // note: prints optional new line for readability
  }
  
  // note: will check if it's true that the array is empty
  private boolean isEmpty() {
    if (storage[0] == null) { // note: compares if index[0] or top is null or empty
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    }     return false; // note: defaults to false
  }

  // note: will check if it's true that the array is full
  private boolean isFull() {
    if (top == capacity) { // note: compares if top has reached capacity limit
      System.out.println(" "); // todo: print error message here
      return true;
    } 
    return false; // note: defaults to false
  }

  // note: will add value to the array
  public void push(String value) {
    System.out.println("... trying to push on stack[" + top + "] ...");
    if (isFull()) {
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: prints optional new line for readability
    } else {      
      storage[top]; // todo: assign the value to top
      top; // todo: should increment or decrement?
      System.out.println(value + " was successfully _________."); // todo: what does push do?
      System.out.println(); // prints optional new line for readability
    }
  }

  // note: will remove value to the array
  public void pop() {
    System.out.println("... trying to pop stack[" + (top-1) + "] ...");
    if (isEmpty()) { // note: checks if empty, then stop
      System.out.println(" "); // print error message here
      System.out.println(); // prints optional new line for readability
    } else {      
      storage[top]; // todo: empty the value of top
      top; // todo: should increment or decrement?
      System.out.println(storage[top] + " was successfully _________."); // todo: what does pop do?
      System.out.println();
    }
  }

  // note: will show the topmost value of the array
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
    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
    System.out.println("STORAGE CAPACITY = " + /* return the size limit );
    System.out.println();
    // show empty stack
    // try removing on an empty stack
    // peek top element of an empty stack
    storage.push("one");
    // show the updated stack
    // peek if top element is "one"
    storage.push("two");
    // show the updated stack
    // peek if top element is "two"
    storage.push("three");
    // show the updated stack
    // peek if top element is "three"
    storage.push("four");
    // show the updated stack
    storage.push("five"); 
    // show the updated stack
    // try removing "five"
    storage.push("six"); 
    storage.push("seven"); 
    storage.push("eight"); 
    storage.push("nine");    
    storage.push("ten"); 
    // show the updated stack
    // peek if top element is "ten"
    // try adding "eleven"
    // try adding "twelve"
    // show the updated stack
  }  

}*//** 
 * Java implementation of a stack using array. 
 * For demo purpose, should hold a maximum of 10 string values. 
 * 
 * @author  [John Michael Cao] 
 * @link    [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Cao-John-Michael/array-stack/ArrayStack.java] 
 * @version [final build] 
 * @since   [17/10/2016] 
 */ 

public class Stack {

       private int capacity ;
       private int top = 0;
       private String storage[];
        
      
    public Stack(int size){
        capacity=size;
        storage= new String[capacity];
        
    }
    public void show(){
        for(int i=capacity-1; i>=0; i--){
            System.out.println("Stack[" + i + "] =" + storage[i]);
        }
       System.out.println();
    }
        
        private boolean isEmpty(){
            if (storage[0] == null){
                System.out.println("Empty Stack!");
                System.out.println();
                return true;
            }
            return false;
        }
        
        private boolean isFull(){
            if(top == capacity){
                System.out.println("The Stack is Full!");
                return true;
            }
            return false;
        }
        
        public void push(String value){
            if (isFull ()) {
                System.out.println("ADD FAILED!");
                System.out.println();
            }else{
                System.out.print("... Trying to push on stack[" + top +"]...");
                storage[top]=value;
                top++;
                System.out.println(value + " was succesfully added.");
                System.out.println();
            }
        }
        public void pop(){
            if(isEmpty()){
                System.out.print("REMOVE FAILED!");
                System.out.println();
            }else{
                System.out.println("... trying to pop stack[" + (top-1) + "] ...");
                storage[top]=null;
                top--;
                System.out.println(storage[top] + " was succesfully removed.");
                System.out.println();
            }
        }
        
        public void peek(){
            if(storage[top]==(storage[0])){
                System.out.println("PEEK TOP " + storage[top]);
                System.out.println();
            }else{
                System.out.println("PEEK TOP " + storage[top-1]);
                System.out.println();
            }
        }
        
        public static void main(String [] args){
        
            Stack storage=new Stack(10);
          
            
            System.out.println("STORAGE CAPACITY = " + storage.capacity);
            System.out.println();
           
            storage.isEmpty();
            storage.pop();
            storage.peek();
            storage.push("one");
            storage.show();
            storage.peek();
            storage.push("two");
            storage.show();
            storage.peek();
            storage.push("three");
            storage.show();
            storage.peek();
            storage.push("four");
            storage.show();
            storage.peek();
            storage.push("five");
            storage.show();
            storage.pop();
            storage.push("six");
            storage.push("seven");
            storage.push("eight");
            storage.push("nine");
            storage.push("ten");
            storage.show();
            storage.pop();         
            storage.push("eleven");
            storage.push("twelve");
            storage.show();
               
           
        }
}
