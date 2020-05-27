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
 * String permutations of a given string
 * @author E5285484
 *
 */
public class StringPermutation
{
    /**
     * Possibilities of given String become like GOD, DOG, OGD, ODG,DGO
     * @param args
     */
    public static void main(String[] args)
    {
        final String givenString = "GODY";
        createUniqueString(givenString, "");

    }

    /**
     * Create more unique sting using given String
     *
     * @param givenString
     * @return
     */
    private static void createUniqueString(String givenString, String str)
    {

        if (givenString.length() == 0)
        {
            System.out.println(str + " ");
            return;
        }

        for (int i = 0; i < givenString.length(); i++)
        {
            char c = givenString.charAt(i);

            String pos = givenString.substring(0, i) + givenString.substring(i + 1);
            // System.out.println("" + pos);
            //Recursive call
            createUniqueString(pos, str + c);

        }

    }

}
