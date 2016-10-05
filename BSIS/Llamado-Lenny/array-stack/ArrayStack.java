
/* @author  [Lenny Llamado]
* @link    [https://github.com/lvcc-dsa/Students/edit/master/BSIS/Llamado-Lenny/array-stack/ArrayStack.java]
* @version [version number]
* @since   [05/10/2016]
*/

package arraystack;
import java.util.Scanner;

public class Arraystack {
    private int capacity; 
    private int top=0;
    private String[] storage;
    
      public Arraystack(int size){
        capacity = size;
        storage = new String[capacity];
    }
      public void show(){
        for (int i=capacity-1; i>=0 ; i--){
            System.out.print("\n storage[" + i + "] = " + storage[i]);
        }
        System.out.println();
    }
      private boolean isEmpty(){
        if (storage[0] == null){
            System.out.print("\nSorry but the stack is empty\n");
            return true;
        }
        return false;
    }
       private boolean isFull() {
    if (top == capacity) {
        System.out.print("\n Sorry the stack is already full\n");
         return true;
    } 
    return false;
  }
       public void push(String value) {
    if (isFull()) {
      System.out.println();
    } 
    else {
      System.out.println("\n ... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;
      System.out.println("'" + value + "' was successfully added.");
      System.out.println();
    }
  }
    public void pop() {
    if (isEmpty()){
      System.out.println();
    } 
    else{
      System.out.println("\n ... trying to pop storage[" + (top-1) + "] ...");
      storage[top-1]=null;
     top--;
      
    
      System.out.println("'" + storage[top] + "' was successfully removed.\n");
      System.out.println();
    }
  }
    
    public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("\nPEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("\nPEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
   
    public static void main(String[] args) {
       int limit = 11;
        Arraystack storage = new Arraystack(limit);
        
        System.out.println("STORAGE CAPACITY = " + limit);
        
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
        storage.push("five"); 
        storage.show();
        storage.push("six"); 
        storage.push("seven"); 
        storage.push("eight"); 
        storage.push("nine");    
        storage.push("ten");
        storage.show();
        storage.pop();
        storage.show();
        storage.push("eleven");
        storage.show();
        
     
    }
}
