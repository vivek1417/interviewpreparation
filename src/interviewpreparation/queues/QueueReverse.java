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
package interviewpreparation.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse
{
    static void print(Queue<Integer> queue)
    {
        while (!queue.isEmpty())
        {

            System.out.print(queue.poll() + ",");
            // queue.remove();
        }
    }

    /**
     * Reverse the queue
     * @param values
     */
    static void reverse(Queue<Integer> values)
    {
        Stack<Integer> stack = new Stack<Integer>();
        while (!values.isEmpty())
        {
            stack.add(values.poll());
            //values.remove();
        }

        while (!stack.isEmpty())
        {
            values.add(stack.peek());
            stack.pop();
        }
    }

    /**
     * Reverse the queue using recursion
     * @param queue
     * @return
     */
    static Queue<Integer> reverseQueueUsingRecursion(Queue<Integer> queue)
    {
        int data;
        if (queue.isEmpty())
        {
            return queue;
        }
        else
        {
            data = queue.poll();
            //queue.remove();
            queue = reverseQueueUsingRecursion(queue);
            queue.add(data);
            return queue;
        }
    }

    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        //reverse(queue);
        reverseQueueUsingRecursion(queue);
        print(queue);
    }

}
