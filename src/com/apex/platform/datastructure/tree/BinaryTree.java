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
package com.apex.platform.datastructure.tree;

public class BinaryTree
{
    Node root;

    public BinaryTree(int item)
    {
        root = new Node(item);
    }

    public BinaryTree(String item)
    {
        root = new Node(item);
    }

    public BinaryTree()
    {
        root = null;
    }

    public static Node addRecursive(Node current, String value)
    {
        if (current == null)
        {
            return new Node(value);
        }

        //Node curr;
        char[] charArr = value.toCharArray();
        int asciiVal = charArr[0];

        int asciiNewVal = current.item.charAt(0);
        System.out.println("AscII Value: " + asciiVal + " Current Item: " + asciiNewVal);
        if (asciiVal <= asciiNewVal)
        {
            current.lefNode = addRecursive(current.lefNode, value);
        }
        else if (asciiVal >= asciiNewVal)
        {
            current.rightNode = addRecursive(current.rightNode, value);
        }
        else
        {
            return current;
        }
        /*int val = current.item.compareTo(value);
        System.out.println("After Compared the String :: " + val);
        if (val <= 1)
        {
            current.lefNode = addRecursive(current.lefNode, value);
        }
        else if (val >= -1)
        {
            current.rightNode = addRecursive(current.rightNode, value);
        }
        else
        {
            return current;
        }*/
        return current;

    }

    public void add(String value)
    {
        //	System.out.println("Element: " + value);
        root = addRecursive(root, value);
    }

    /**
     * Traverse the tree from pre order of tree
     * @param root
     */
    public void preOrder(Node root)
    {
        if (root != null)
        {
            System.out.print(root.item + " ");
            preOrder(root.lefNode);
            preOrder(root.rightNode);
        }

    }

    /**
     * Traverse the tree from post Order of Tree
     * @param root
     */

    public void postOrderTraversal(Node root)
    {
        if (root != null)
        {
            postOrderTraversal(root.lefNode);
            postOrderTraversal(root.rightNode);
            System.out.print(root.item + " ");
        }
    }

    /**
     * in order
     * @param root
     */
    public void inOrderOfTraversal(Node root)
    {
        if (root != null)
        {
            inOrderOfTraversal(root.lefNode);
            System.out.print(root.item + " ");
            inOrderOfTraversal(root.rightNode);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BinaryTree [root=");
        builder.append(root);
        builder.append("]");
        return builder.toString();
    }

}
