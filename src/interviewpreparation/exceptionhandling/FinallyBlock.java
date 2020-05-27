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
package interviewpreparation.exceptionhandling;

public class FinallyBlock
{

    public static void main(String[] args)
    {
        System.out.println("" + returnInt());
    }

    @SuppressWarnings("finally")
    static int returnInt()
    {
        try
        {
            System.out.println("Try Block(); ");
            return 0;
        }
        catch (Exception e)
        {
            return 1;
        }
        finally
        {
            return 2;
        }

    }
}
