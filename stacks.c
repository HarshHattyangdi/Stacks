/*
Stacks ADT:
A linear data structure that can be thought of as a physical stack or a pile. 
Works in LIFO order where things inserted at top are removed from the top itself first, i.e 
insertion and deletion occurs from one end(top).

Operations on a stack:
1. push : Insert elements from the top.
2. pop : Remove elements from the top.
3. top : Returns element at the top.
4. is_empty : Returns true if the stack is empty(no elements present in the stack).
4. is_full : Returns true if stack is full.
5. get_size : Returns the size of the stack.
*/

#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

int stack[SIZE];
int top = -1; //initialize top to -1 as array indexing for stack start from 0

int is_full()
{
    if (top == SIZE)
    {
        return 1;
    }
    return 0;
}

int push(int value)
{
    if (!is_full())
    {
        stack[++top] = value; //value of top increases with every successful insertion
    }
    else
    {
        printf("Stack is full, cannot push more elements");
    }
}

int is_empty()
{
    if (top == -1)
    {
        return 1;
    }
    return 0;
}

int pop()
{
    int value;

    if (!is_empty())
    {
        value = stack[top--];
        return value;
    }
    else
    {
        printf("Stack is empty, no elements present");
    }
}

int stack_top()
{
    if (is_empty())
    {
        printf("Stack is empty, no elements present");
    }
    return stack[top];
}

void display()
{
    if (is_empty())
        printf("\nStack is Empty!!!");
    else
    {
        int i;
        printf("\nStack elements are:\n");
        for (i = top; i >= 0; i--)
            printf("%d\n", stack[i]);
    }
}

int main()
{
    int value, choice;

    while (1)
    {
        printf("\n\n***** MENU *****\n");
        printf("1. Push\n2. Pop\n3. Top\n4. Display\n5. Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter the value to be inserted: ");
            scanf("%d", &value);
            push(value);
            break;
        case 2:
            pop();
            break;
        case 3:
            printf("%d", stack_top());
            break;
        case 4:
            display();
            break;
        case 5:
            exit(0);
        default:
            printf("\nWrong selection!!! Try again!!!");
        }
    }

    return 0;
}
