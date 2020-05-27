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
package com.apex.platform.stringmanipulation;

public class LeftAndRightRotate
{

    public static void main(String[] args)
    {
        String s1 = "GeeksforGeeks";
        String s2 = "GeeksforGeeks";
        System.out.println("Left rotation of String: " + leftRotate(s1, 2));
        System.out.println("Right rotation of String " + rightRotate(s2, 2));
    }

    private static String rightRotate(String s2, int i)
    {
        return leftRotate(s2, s2.length() - i);

    }

    private static String leftRotate(String s1, int i)
    {
        return (s1.substring(i) + s1.substring(0, i));

    }

}
