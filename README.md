# STACKS

## ***Strating this repo as a practice to learn github and Data Structures and Algorithms***

## Stacks ADT

A linear data structure that can be thought of as a physical stack or a pile. 
Works in LIFO order where things inserted at top are removed from the top itself first, i.e 
insertion and deletion occurs from one end(top).

## Operations on a stack

1. push : Insert elements from the top.
2. pop : Remove elements from the top.
3. top : Returns element at the top.
4. is_empty : Returns true if the stack is empty(no elements present in the stack).
5. is_full : Returns true if stack is full.
6. get_size : Returns the size of the stack.

## Updated on 15-12-20

### Algorithm to convert to binary with stacks

   1. Create a stack
   2. Enter a decimal number which has to be converted into its equivalent binary form.
   3. Iteration1 (while number > 0)
       1. Digit = number % 2
       2. Push digit into the stack
       3. If the stack is full
            1. Print an error
            2. Stop the algorithm
       4. End the if condition
       5. Divide the number by 2
   4. End iteration1
   5. Iteration2 (while stack is not empty)
       1. Pop digit from the stack
       2. Print the digit
   6. End iteration2
   7. STOP

## Updated on 17-12-2020

### Main algorithm to solve tower of hanoi problem using stacks

1. Calculate the total number of moves required i.e. "pow(2, n)
   - 1" here n is number of disks.
2. If number of disks (i.e. n) is even then interchange destination
   pole and auxiliary pole.
3. for i = 1 to total number of moves:
    1. if i%3 == 1:
    legal movement of top disk between source pole and
        destination pole
    2. if i%3 == 2:
    legal movement top disk between source pole and
        auxiliary pole
    3. if i%3 == 0:
        legal movement top disk between auxiliary pole
        and destination pole

