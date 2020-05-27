/*
 * ==============================================================================
 * (c) 2020
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

import java.util.HashSet;
import java.util.Objects;

import interviewpreparation.datastructure.linkedlistcustom.MyLinkedList.Node;

public class FindLoopFromLinkedList
{
    //Flyod's finn algorithm
    public static void main(String[] args)
    {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(1);
        myLinkedList.head.next = new Node(2);
        Node node = myLinkedList.head.next.next = new Node(3);
        myLinkedList.head.next.next.next = new Node(4);
        myLinkedList.head.next.next.next.next = new Node(5);
        myLinkedList.head.next.next.next.next.next = node;
        System.out.println("Returns: " + hasLoop(myLinkedList));
    }

    private static boolean hasLoop(MyLinkedList myLinkedList)
    {
        HashSet<Object> obj = new HashSet<Object>();
        Node head = myLinkedList.head;
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        while (Objects.nonNull(slow) && Objects.nonNull(fast) && Objects.nonNull(fast.next))
        {

            slow = slow.next;
            fast = fast.next.next;
            System.out.println("Slow: " + slow.data + " Fast: " + fast.data);
            if (slow == fast)
            {
                loop = true;
                break;
            }

        }
        return loop;

    }
}
