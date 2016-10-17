Stack
=======================

## Description

 - A STACK is an ADT (abstract data type) in LIFO order (last in, first out).
 - It has 2 main operations: (1) PUSH for adding, and (2) POP for removing elements.
 - It is a protected SINGLY LINKED LIST where PUSH and POP are only allowed on the top front or last element in the stack.
 - You may also PEEK to show the last element added.
 - Implementation can either be in ARRAY or LINKED LIST.
 - It's algorithmic complexity is CONSTANT or O(1).

## Screenshots

![Image 1](https://github.com/lvcc-dsa/Students/blob/master/BSIS/Florentino-Lorenz/array-stack/1.png)
![Image 2](https://github.com/lvcc-dsa/Students/blob/master/BSIS/Florentino-Lorenz/array-stack/2.png)
![Image 3](https://github.com/lvcc-dsa/Students/blob/master/BSIS/Florentino-Lorenz/array-stack/3.png)
![Image 4](https://github.com/lvcc-dsa/Students/blob/master/BSIS/Florentino-Lorenz/array-stack/4.png)
![Image 5](https://github.com/lvcc-dsa/Students/blob/master/BSIS/Florentino-Lorenz/array-stack/5.png)
![Image 6](https://github.com/lvcc-dsa/Students/blob/master/BSIS/Florentino-Lorenz/array-stack/6.png)

## To Do:

 - Implement a STACK using ARRAY that can hold a maximum of 10 string values.
 - Create operations PUSH, POP, and PEEK.
 - Allow PUSH only if the stack is not yet full.
 - Allow POP only if the stack is not yet empty.
 - Allow PEEK to see the topmost topmost element.
 - Show the updated ARRAY STACK everytime you PUSH or POP.

## Pseudocode:

    START PROGRAM
    
     SET capacity, top, stack[]
    
     PROCEDURE show
      FOR EACH element IN stack.capacity
       PRINT stack[element]
    
     PROCEDURE isEmpty
      IF stack[0] == null
       PRINT stack is empty
       return TRUE
    
     PROCEDURE isFull
     IF top == capacity
       PRINT stack is full
       return TRUE
    
     PROCEDURE push(element)
      IF isFull
       PRINT add failed
      ELSE
       PRINT trying to push on stack[top]
       storage[top] = element
       top++
       PRINT element was successfully added
    
     PROCEDURE pop
      IF isEmpty
       PRINT remove failed
      ELSE
       PRINT trying to push on stack[top]
       storage[top] = null
       top--
      PRINT storage[top] was successfully removed
      
     PROCEDURE peek
      IF isEmpty
       PRINT NULL
      ELSE 
       PRINT storage[top]
    
     PROCEDURE main
     // show that stack is empty
     // push 10 integers until stack is full
     // show updated stack
     // try to push again, expect push error message
     // pop last element
     // peek last element
     // pop all elements until stack is empty
     // show updated stack
     // try to pop again, expect pop error message
    
    END PROGRAM 
