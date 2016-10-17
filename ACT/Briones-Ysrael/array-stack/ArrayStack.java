/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Ysrael Carlos Briones]
* @link    [www.github.com/Bibleaffliction11]
* @version [version number]
* @since   [last updated 17/10/2016]
*/

package arraystack;
public class ArrayStack {
        private int capacity;
	private int top = 0;
	private String [] array;
	public ArrayStack(int size) {
		capacity = size;
		array = new String[capacity];
	}
	public void show() {
		System.out.println("Current Stack Element: ");
		for (int x = capacity - 1; x >= 0; x--) {	
			System.out.println("Stack[" + x + "]  =  " + array[x]);
		}
	System.out.println("");	
	}
	private boolean isEmpty() {
		if (array[0] == null) {
			System.out.println("Stack is Empty.");
			System.out.println("");
			return true;
		} else {
			return false;
		}
	}
	private boolean isFull() {
		if (top == capacity) {
			System.out.println("Stack is Full.");
			System.out.println("");
			return true;
		} else {
			return false;
		}
	}
	public void push(String val) {
		if (isFull()) {
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
		if (isEmpty()) {
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
		ArrayStack aa = new ArrayStack(10);
		System.out.println("");
		System.out.println("Storage capacity = " + aa.capacity);
		System.out.println("");
		aa.push("First");
		aa.push("Second");
		aa.push("Third");
		aa.push("Fifth");
		aa.push("Six");
		aa.push("Seven");
		aa.push("Eight");
		aa.push("Nine");
		aa.push("Ten");
		aa.push("Eleventh");
		aa.pop();
		aa.peek();
		aa.show();

	}
}
