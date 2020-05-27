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
package com.apex.platform.datastructure.tree;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeDemo
{

    public static void main(String[] args)
    {
        String[] strArr =
        {
                "Vivek", "Ninju", "Vithyu", "vaishu"
        };
        SortedSet<String> set = new TreeSet<String>();
        for (String string : strArr)
        {

            set.add(string);
        }

    }

    void printAll(SortedSet<Integer> tree)
    {
        System.out.println("" + tree.toString());
    }
}
