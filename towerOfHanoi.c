#include <stdio.h>
#include <stdlib.h>

struct Stack
{
    unsigned capacity;
    int top;
    int *array; //*array is actually an array
};

struct Stack *createStack(unsigned capacity)
{
    struct Stack *stack = (struct Stack *)malloc(sizeof(capacity));
    stack->capacity = capacity;
    stack->top = -1;
    stack->array = (int *)malloc(sizeof(int));
};