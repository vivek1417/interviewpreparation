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

public class BinaryTreeDemo
{
    public static void main(String[] args)
    {
        //BinaryTree binaryTree = new BinaryTree();
        //Create a root node
        /*binaryTree.root = new Node("A");
        //Create a children
        binaryTree.root.lefNode = new Node("B");
        binaryTree.root.rightNode = new Node("C");
        binaryTree.root.lefNode.lefNode = new Node("D");
        binaryTree.root.rightNode.rightNode = new Node("E");
        System.out.println("Binary Tree: " + binaryTree);*/
        String s = "A";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char apex = chars[i];
            int val = apex;
            System.out.println(String.format("Ascii value of %c = and Ascii Value is %d", chars[i], val));
        }
        //int val = c;
        System.out.println("Binary Tree Created: " + createBinaryTree().toString());
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("####### Pre Order Traversal ########");
        binaryTree.preOrder(createBinaryTree().root);
        System.out.println();
        System.out.println("##########Post Order Traversal #############");
        binaryTree.postOrderTraversal(createBinaryTree().root);
        System.out.println();
        System.out.println("##########In Order Traversal #############");
        binaryTree.inOrderOfTraversal(createBinaryTree().root);
    }

    private static BinaryTree createBinaryTree()
    {
        BinaryTree bt = new BinaryTree();
        bt.add(new String("A"));
        bt.add(new String("C"));
        bt.add(new String("E"));
        bt.add(new String("D"));
        bt.add(new String("B"));
        return bt;

    }
}
