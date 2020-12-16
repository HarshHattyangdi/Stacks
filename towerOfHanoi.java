
/**
 * towerOfHanoi
 */

import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        // Input no of disk;
        System.out.println("Enter no. of disk:");
        Scanner sc = new Scanner(System.in);
        int num_of_disk = sc.nextInt();
        sc.close();

        towerOfHanoi ob = new towerOfHanoi();
        Stack source, destination, auxiliary;

        source = ob.createStack(num_of_disk);
        destination = ob.createStack(num_of_disk);
        auxiliary = ob.createStack(num_of_disk);
    }

    class Stack {
        int capacity;
        int top;
        int array[];
    }

    Stack createStack(int capacity) {
        Stack stack = new Stack();
        stack.capacity = capacity;
        stack.top = -1;
        stack.array = new int[capacity];
        return stack;
    }

    boolean isFull(Stack stack) {
        return (stack.top == stack.capacity - 1);
    }

    boolean isEmpty(Stack stack) {
        return (stack.top == 1);
    }

    void push(Stack stack, int item) {
        if (isFull(stack)) {
            return;
        }
        stack.array[++stack.top] = item;
    }

    int pop(Stack stack) {
        if (isEmpty(stack)) {
            return Integer.MIN_VALUE;
        }
        return stack.array[stack.top--];
    }

}