/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Joane Pauline S. Maunes]
* @link    [https://github.com/paulineMaunes]
* @version [v.2.0]
* @since   [17/10/2016]
*/

public class ArrayStack {

public class ArrayStack{ 

        private int size; 
        private String[] Stacks; 
        private int top; 
 
        
        public ArrayStack (int size){ 

        Stacks = new String[size]; 
        this.size = size;
        top = 0; 
} 
        public void push(String item){ 

           if (!is_full()){ 
            Stacks[top] = item; 
            System.out.println(item);             
	    top++; 
            
           }	
	
	else{ 
        
	System.out.println("STACK is already full!\nADD Failed!"); 
}
 
} 
        public String peek(){
                int front = Stacks.length - 1;
                System.out.println("Top Item: " + Stacks[front]);
                return Stacks[front]; 
} 
        public boolean is_full(){ 
                return (size==top);
} 
        public boolean is_empty(){ 
                return (top == 0);
        } 
        
        public String pop(){ 
               String hello = "";
		if(!is_empty()){
                String value = Stacks[--top]; 
                System.out.println("Popped: " + value);             
                }
                return hello;
        }


        public void showArray(){
            System.out.print("Current Stack Items: \n");
              while (top!=0){
                   System.out.print(Stacks[--top] + " ");
                   } 
              if (is_empty()== true){
                       System.out.println();
              }
        }

        public static void main(String [] args){ 

                ArrayStack pauline = new ArrayStack(10);
                
                System.out.println("Pushed Items: ");
                pauline.push("1"); 
                pauline.push("2"); 
                pauline.push("3"); 
                pauline.push("4"); 
                pauline.push("5"); 
                pauline.push("6"); 
                pauline.push("7"); 
                pauline.push("8");
                pauline.push("9"); 
                pauline.push("10");
                pauline.pop();
                pauline.showArray();
                           
        } 
} 

