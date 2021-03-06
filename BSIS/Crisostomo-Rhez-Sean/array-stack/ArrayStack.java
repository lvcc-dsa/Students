public class ArrayStack
{
private int capacity;
private int top = 0;
private String[] storage;

public ArrayStack(int size){
    capacity = size;
    storage = new String[capacity];
 } 
    public void show() {
        for (int j = capacity-1; j >= 0; j--){
        for (int i = capacity-1; i >= 0; i--){
            System.out.println("STACK ["+ j-- + "]= "+ storage[i] );
           } 
        }
    System.out.println();
    }
    
private boolean isEmpty(){
if(storage [0] == null){
  System.out.println("Storage is empty.");
System.out.println();
return true;
}
return false;
}

private boolean isFull(){
if (top == capacity){
    System.out.println("Storage si full");
    System.out.println();
return true;
}
return false;
}

public void push (String value) {

if (isFull()){
System.out.print("ADD FAILED");
System.out.println();
}
else {
System.out.println ("... trying to push on stack ["+top+"] ...");
storage[top] = value;
top++;
System.out.println (value + "successfully added.");
System.out.println ();
}
}
public void pop(){
if (isEmpty()){
System.out.println ("REMOVE FAILED.");
System.out.println();
}
else {
System.out.println("... trying to pop stack [" +(top-1)+"] ...");
storage[top]= null;
top--;
System.out.println(storage [top] + "was successfully  removed.");
System.out.println();
}
}
public void peek(){
if (storage[top] == storage[0]){
System.out.println("PEEKTOP= " + storage[top]);
System.out.println();
}
else{
System.out.println("PEEKTOP = " + storage[top-1]);
System.out.println();
}
}

public static void main(String[] args) {
   int max = 10;
        ArrayStack storage = new ArrayStack(max);
        System.out.println(" Storage Capacity = " + storage.capacity);
        System.out.println();
  storage.show(); 
  storage.pop();
  storage.peek();
  storage.push("one"); 
  storage.show();
  storage.peek();
  storage.push("two");
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
  storage.peek();
  storage.push("six");
  storage.show();
  storage.peek();
  storage.push("seven");
  storage.push("eight");
  storage.push("nine");
  storage.push("ten");
  storage.show();
}
}