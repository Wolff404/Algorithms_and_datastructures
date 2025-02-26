package org.example;

import java.lang.reflect.Array;

public class IntStack
{
    private int top, max;
    private int stack[];

    public IntStack(int length)
    {
        top = 0;
        max = length;
        stack = new int[max];
    }

    public void push(int i)
    {
        stack[top] = i;
        top++;
    }

    public int pop()
    {
        top--;
        return(stack[top]);
    }

    public int peek()
    {
        return(stack[top-1]);
    }

    public boolean isEmpty()
    {
        return (top == 0);
    }

    public int size()
    {
        return top;
    }

    public static void main(String[]args){
        IntStack ew = new IntStack(5);
        ew.push(1);
        ew.push(2);
        ew.push(3);
        ew.push(4);
        ew.pop();
        ew.isEmpty();


        System.out.println(ew.size());
        System.out.println(ew.isEmpty());
        System.out.println(ew.peek());


    }
}