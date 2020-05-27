/*
 * ==============================================================================
 * (c) 2019
 * Fidelity National Information Services, Inc. and/or its subsidiaries - All 
 * Rights Reserved worldwide.
 * ---------------------------------------------------------------------------
 * This document is protected under the trade secret and copyright laws as the
 * property of Fidelity National Information Services, Inc. and/or its subsidiaries.
 * Copying, reproduction or distribution should be limited and only to employees
 * with a 'need to know' to do their job. Any disclosure of this document to
 * third parties is strictly prohibited.
 * =============================================================================
 */
package interviewpreparation.datastructure;

import java.util.Arrays;

public class Stack
{
    static final int MAX_SIZE = 10;

    int data;

    int[] arr = new int[MAX_SIZE];

    public Stack()
    {
        data = -1;
    }

    public static void main(String[] args)
    {
        //java.util.Stack<E>
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        //stack.push(110);
        stack.display();
        System.out.println(String.format("%d elements pop out from Stack", stack.pop()));
        stack.display();
        System.out.println(String.format("%d current top element on Stack", stack.peek()));
    }

    private boolean push(int x)
    {
        if (data >= (MAX_SIZE - 1))
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            arr[++data] = x;
            System.out.println(x + " pushed into Stack");
            return true;
        }

    }

    private int pop()
    {
        if (data < 0)
        {
            System.out.println("Stack Underflow!");
            return 0;
        }
        else
        {
            return arr[data--];
        }

    }

    private int peek()
    {
        if (data < 0)
        {
            System.out.println("Stack Underflow!");
            return 0;
        }
        else
        {
            int x = arr[data];
            return x;
        }

    }

    private void display()
    {
        System.out.println("Stack elements are " + Arrays.toString(arr));
    }

    private int arraySize()
    {
        return MAX_SIZE * 2;

    }
}
