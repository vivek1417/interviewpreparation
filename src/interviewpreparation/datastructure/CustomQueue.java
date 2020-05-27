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

public class CustomQueue
{
    int[] arr;

    int capacity;

    int front;

    int rear;

    int count;

    CustomQueue(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    void dequeue()
    {
        exitIfempty();
        System.out.println("Removing " + arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    public void enqueue(int item)
    {
        if (isFull())
        {
            System.out.println("Overflow Program Terminated!");
            System.exit(1);
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int peek()
    {
        exitIfempty();
        return arr[front];
    }

    public boolean isEmpty()
    {
        return (size() == 0);
    }

    public int size()
    {
        return count;
    }

    public boolean isFull()
    {
        return (size() == capacity);
    }

    public void exitIfempty()
    {
        if (isEmpty())
        {
            System.out.println("Underflow Program terminated!");
            System.exit(1);
        }
    }

    public static void main(String[] args)
    {
        CustomQueue queue = new CustomQueue(4);
        System.out.println(queue.isEmpty() ? "Queue is empty" : "Queue is not empty");
        queue.enqueue(10);
        System.out.println(queue.isEmpty() ? "Queue is empty" : "Queue is not empty");

        queue.enqueue(20);
        System.out.println("Queue Size is " + queue.size());
        System.out.println("Current Item in Queue " + queue.peek());

    }

}
