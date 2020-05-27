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
package com.hackerrank.dicandhashmaps;

public class NumberMain
{

    public static void main(String[] args)
    {
        try
        {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        }
        catch (Exception e)
        {
            System.out.println("bad number");
        }

        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(value & mask);

    }

}
