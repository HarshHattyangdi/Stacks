/*
 ALGORITHM:
   1. Create a stack
   2. Enter a decimal number which has to be converted into its equivalent binary form.
   3. iteration1 (while number > 0)
         3.1 digit = number % 2
         3.2 Push digit into the stack
         3.3 If the stack is full
              3.3.1 Print an error
              3.3.2 Stop the algorithm
         3.4 End the if condition
         3.5 Divide the number by 2
   4. End iteration1
   
   5. iteration2 (while stack is not empty)
         5.1 Pop digit from the stack
         5.2 Print the digit
   6. End iteration2
   7. STOP
*/
#include <stdio.h>
#define SIZE 100
int stack[SIZE];
int top = -1;

int is_full()
{
    if (top == SIZE)
    {
        return 1;
    }
    return 0;
}

int push(int element)
{

    if (!is_full())
    {
        stack[++top] = element;
    }
    else
    {
        printf("Stack overflow, enter smaller number");
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
    int element;
    if (!is_empty())
    {
        element = stack[top--];
        return element;
    }
    else
    {
        printf("Stack underflow.");
    }
}

int convertToBinary(int number)
{
    int rem;
    while (number != 0)
    {
        rem = number % 2;
        push(rem);
        number /= 2;
    }
    while (!is_empty())
    {
        printf("%d", pop());
    }
}

int main()
{
    int number;
    printf("Enter a number :");
    scanf("%d", &number);
    convertToBinary(number);
    return 0;
}