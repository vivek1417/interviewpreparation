/*
 * ==============================================================================
 * (c) 2019, 2020
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
package interviewpreparation.datastructure.linkedlistcustom;

import java.util.LinkedList;

public class LinkedListDemo
{
    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll)
    {
        if (ll.isEmpty())
        {
            return ll;
        }
        else
        {
            int data = ll.poll();
            //ll.remove();
            reverseLinkedList(ll);
            ll.add(data);
            return ll;
        }
    }

    static void print(LinkedList<Integer> ll)
    {
        /* for (Integer integer : ll)
        {
            System.out.print(integer + ",");
        }*/
        while (!ll.isEmpty())
        {
            // ll.
            System.out.print(ll.poll() + ",");
            //ll.remove();
        }
    }

    static void findMiddleElement(LinkedList<Integer> ll)
    {
        int n = ll.size();
        int midInd = n / 2;
        System.out.println("Middle index : " + midInd + " element is " + ll.get(midInd));
    }

    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        //linkedList.add(7);
        findMiddleElement(linkedList);
        // reverseLinkedList(linkedList);
        // print(linkedList);

    }

}
