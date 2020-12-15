# STACKS

## Stacks ADT:
A linear data structure that can be thought of as a physical stack or a pile. 
Works in LIFO order where things inserted at top are removed from the top itself first, i.e 
insertion and deletion occurs from one end(top).

## Operations on a stack:
1. push : Insert elements from the top.
2. pop : Remove elements from the top.
3. top : Returns element at the top.
4. is_empty : Returns true if the stack is empty(no elements present in the stack).
4. is_full : Returns true if stack is full.
5. get_size : Returns the size of the stack.

## Updated on 15-12-20
### Algorithm to convert to binary with stacks
   1. Create a stack
   2. Enter a decimal number which has to be converted into its equivalent binary form.
   3. iteration1 (while number > 0)
       1. 3.1 digit = number % 2
       2. 3.2 Push digit into the stack
       3. 3.3 If the stack is full
            1. 3.3.1 Print an error
            2. 3.3.2 Stop the algorithm
       4. 3.4 End the if condition
       5. 3.5 Divide the number by 2
   4. End iteration1
   
   5. iteration2 (while stack is not empty)
       1. 5.1 Pop digit from the stack
       2. 5.2 Print the digit
   6. End iteration2
   7. STOP

***Strating this repo as a practice to learn github and Data Structures and Algorithms***
