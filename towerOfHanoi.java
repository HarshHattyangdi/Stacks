
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

        ob.toh(num_of_disk, source, destination, auxiliary);
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
        return (stack.top == -1);
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

    void moveDisksBetween(Stack src, Stack dest, char s, char d) {
        int pole1TopDisk = pop(src);
        int pole2TopDisk = pop(dest);

        // When pole1 is empty
        if (pole1TopDisk == Integer.MIN_VALUE) {
            push(src, pole2TopDisk);
            moveDisk(d, s, pole2TopDisk);
        }
        // When pole2 is empty
        else if (pole2TopDisk == Integer.MIN_VALUE) {
            push(dest, pole1TopDisk);
            moveDisk(s, d, pole1TopDisk);
        }
        // When top disk of pole1>top disk of pole2
        else if (pole1TopDisk > pole2TopDisk) {
            push(src, pole1TopDisk);
            push(src, pole2TopDisk);
            moveDisk(d, s, pole2TopDisk);
        }
        // When top disk of pole1 < top disk of pole2
        else {
            push(dest, pole2TopDisk);
            push(dest, pole1TopDisk);
            moveDisk(s, d, pole1TopDisk);
        }
    }

    void moveDisk(char fromPeg, char toPeg, int disk) {
        System.out.println("Move the disk " + disk + " from " + fromPeg + " to " + toPeg);
    }

    void toh(int num_of_disk, Stack src, Stack dest, Stack aux) {
        // Calculate total number of steps required
        int num_of_steps = (int) (Math.pow(2, num_of_disk) - 1);

        char s = 'S', a = 'A', d = 'D';

        // When number of disk is even then interchange the auxiliary pole and
        // destination pole.
        if (num_of_disk % 2 == 0) {
            char temp = d;
            d = a;
            a = temp;
        }

        // Larger disks need to be pushed first
        for (int i = num_of_disk; i >= 1; i--) {
            push(src, i);
        }

        for (int i = 1; i <= num_of_steps; i++) {
            if (i % 3 == 1) {
                moveDisksBetween(src, dest, s, d);
            } else if (i % 3 == 2) {
                moveDisksBetween(src, aux, s, a);
            } else {
                moveDisksBetween(aux, dest, a, d);
            }
        }
    }

}