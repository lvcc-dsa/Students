
public class arrayStck {

}
class ArrayStack {

   private int laman;
   private int top = 0;
   private String [] array;

   public ArrayStack(int sukat) {
    laman = sukat;
    array = new String[laman];
   }

   public void show() {
    System.out.println("Current Stack Element: ");
    for (int x = laman - 1; x >= 0; x--) {
     
    
     System.out.println("Stack[" + x + "]  =  " + array[x]);

    }

   System.out.println(""); 
   }

   private boolean walanglaman() {
    if (array[0] == null) {
     System.out.println("Stack is Empty.");
     System.out.println("");
     return true;
    } else {
     return false;
    }
   }

   private boolean overload() {
    if (top == laman) {
     System.out.println("Stack is Full.");
     System.out.println("");
     return true;
    } else {
     return false;
    }
   }

   public void push(String val) {
    if (overload()) {
     System.out.println("Add failed. Element did not push.");
     System.out.println("");
    } else {
     System.out.println(". . . executing push on stack[" + top + "] . . .");
     array[top] = val;
     top++;
     System.out.println(val + " was successfully added");
     System.out.println("");
    }
   }

   public void pop() {
    if (walanglaman()) {
     System.out.println("Remove failed. No element to pop.");
     System.out.println("");
    } else {
     System.out.println(". . . executing pop on stack[" + (top-1) + "] . . .");
     top--;
     System.out.println(array[top] + " was successfully removed");
     System.out.println("");
     array[top] = null;
    }
   }

   public void peek() {
    if (array[top-1] == array[0]) {
     System.out.println("Peek top = " + array[top]);
     System.out.println(""); 
    } else {
     System.out.println("Peek top = " + array[top-1]);
     System.out.println(""); 
    }
   }

   public static void main(String [] args) {

    ArrayStack arrObj = new ArrayStack(10);
    System.out.println("");
    System.out.println("Storage capacity = " + arrObj.laman);
    System.out.println("");

    arrObj.push("first");
    arrObj.push("second");
    arrObj.push("third");
    arrObj.push("fourth");
    arrObj.push("fifth");
    arrObj.push("sixth");
    arrObj.push("seventh");
    arrObj.push("eight");
    arrObj.push("nineth");
    arrObj.push("tenth");
    arrObj.push("eleventh");

    arrObj.peek();

    arrObj.show();

   }
  }