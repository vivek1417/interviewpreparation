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

import java.util.Scanner;

public class RemoveDuplicatesFromString
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter a String here...");
        remvoeDuplicates(in.nextLine());

    }

    /**
     * Remove brackets from a given string if does not have any match
     *
     * @param nextLine
     */
    private static void remvoeDuplicates(String str)
    {
        final StringBuilder leftBracketer = new StringBuilder();
        final StringBuilder rightBracketer = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if ('(' == c)
            {
                leftBracketer.append(c);
            }
            else if (')' == c)
            {
                rightBracketer.append(c);
            }
        }
        System.out.println(leftBracketer);
    }

}
