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
package com.hackerrank.tree.samplebst;

import java.util.Scanner;

class Node
{
    Node left;

    Node right;

    int data;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution
{

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    public static Node lca(Node root, int v1, int v2)
    {
        // Write your code here.
        if (root == null && v1 == v2)
        {
            return new Node(0);
        }
        else
        {
            if (root.left != null && root.right != null)
            {
                if (root.left.data == v1 && root.right.data == v2)
                {
                    return root;
                }
                else
                {
                    lca(root.left, v1, v2);
                    lca(root.right, v1, v2);
                }
            }
            /*(root.left != null && root.left.data != v1){
                Node leftNode=lca(root.left,v1,v2)
            }
            if(root.right != null && root.right.data != v2){
                Node rightNode = lca(root.right, v1, v2)
            }*/
        }

        return root;
    }

    public static Node insert(Node root, int data)
    {
        if (root == null)
        {
            return new Node(data);
        }
        else
        {
            Node cur;
            if (data <= root.data)
            {
                cur = insert(root.left, data);
                root.left = cur;
            }
            else
            {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0)
        {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root, v1, v2);
        System.out.println(ans.data);
    }
}
