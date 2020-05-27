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
package com.apex.platform.sortingmechanism;

import java.util.Scanner;

public class ArmstrongNumber
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        int[] arrs = new int[n];
        String[] strings = in.nextLine().split(" ");

        int remainder, result = 0;
        for (int i = 0; i < n; i++)
        {
            arrs[i] = Integer.parseInt(in.nextLine());

        }
        for (int i = 0; i < arrs.length; i++)
        {
            int original = arrs[i];
            while (original != 0)
            {
                remainder = original % 10;
                result += Math.pow(remainder, 3);
                original /= 10;
            }
            if (result == arrs[i])
                System.out.println("This is an Armstrong number");
            else
                System.out.println("This is not an Armstrong number");
        }
        in.close();
    }

}
