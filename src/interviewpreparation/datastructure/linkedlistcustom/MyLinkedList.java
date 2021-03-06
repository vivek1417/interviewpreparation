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

public class MyLinkedList
{
    public Node head;

    static class Node
    {
        Object data;

        Node prev;

        Node next;

        Node(Object data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
    }

}
