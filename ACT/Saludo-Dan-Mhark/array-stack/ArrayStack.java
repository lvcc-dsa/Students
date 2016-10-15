public class ArrayStack {
 
	int top = 0;
	int capacity; 
	String [] storage;

 
 public ArrayStack (int size) {
	 capacity = size;
	 storage = new String [capacity];
 }
 	public void show ()
 	{
 		for ( int i = capacity-1; i>= 0; i--) {
 			System.out.println("stack[" + i + "] = " + storage[i]);
 		}
 		  System.out.println(" ");
 	}
 	
 	private boolean isEmpty() {
 		if (storage[0] == null) {
 			System.out.println("Stack is Empty.");
 			return true;
 		} else {
 			return false;
 		}
 	}
 	
 	private boolean isFull() {
 		if (top == capacity) {
 			System.out.println(" Stack is Full.");
 			return true;
 		} else {
 			return false;
 		}
 	}
 	
 	public void push (String value) {
 		if (isFull()) {
 			System.out.println(" Adding Failed.");
 			System.out.println(" ");
 		}
 		else {
 			System.out.println("...trying to push on stack[" + top + "] ...");
 			storage[top] = value;
 			top ++;
 		System.out.println(value + " was successfully added.");
 		System.out.println(" ");
 		}
 	}
 	
 	public void pop () {
 		if (isEmpty()) {
 			System.out.println("Removing Failed.");
 		}
 		else {
 			System.out.println("...trying to pop on stack[" + (top-1) + "]...");
 			System.out.println(" ");
 			storage[top] = null;
 			top --;
 		System.out.println("storage[top]" + " was succesfully removed.");
 		System.out.println(" ");
 		}
 	}
 	
 	public void peek() {
 		if (storage[top-1] == storage[0]) {
 			System.out.println("PEEK TOP = " + storage[top]);
 			System.out.println(" ");
 		}
 		else {
 			System.out.print("PEEK TOP = " + storage[top-1]);
 			System.out.println(" ");
 		}
 	}

	public static void main(String [] args) {
		
		ArrayStack object = new ArrayStack(10);
		System.out.println("Storage capacity = " + object.capacity);
		System.out.println(" ");
		
		object.push("one");
		object.push("two");
		object.push("three");
		object.push("four");
		object.push("five");
		object.push("six");
		object.push("seven");
		object.push("eight");
		object.push("nine");
		object.push("ten");
		object.push("eleven");
		object.push("twelve");
		
		object.peek();
		object.show();
		
	}
}
