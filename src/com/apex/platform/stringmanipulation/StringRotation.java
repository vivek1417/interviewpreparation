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

/**
 * Two Strings one string matches with other if s2 is rotation of s1
 * @author E5285484
 *
 */
public class StringRotation
{

    public static void main(String[] args)
    {
        String s1 = "ABCD";
        String s2 = "ACBD";
        if (areRotations(s1, s2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }

    private static boolean areRotations(String s1, String s2)
    {
        System.out.println("First String concatenated itself: " + (s1 + s1));
        return (s1.length() == s2.length()) && ((s1 + s1).contains(s2));

    }

}
