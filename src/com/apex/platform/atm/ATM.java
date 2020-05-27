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
package com.apex.platform.atm;

public class ATM
{

    // function to count and
    // print currency notes
    public static void countCurrency(int amount)
    {
        int[] notes = new int[]
        {
                2000, 500, 200, 100, 50, 20, 10, 5, 1
        };
        int[] noteCounter = new int[9];

        // count notes using Greedy approach
        for (int i = 0; i < 9; i++)
        {
            if (amount >= notes[i])
            {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++)
        {
            if (noteCounter[i] != 0)
            {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }

    // driver function
    public static void main(String argc[])
    {
        int amount = 2456;
        countCurrency(amount);
    }

    /* This code is contributed by Sagar Shukla */
}
