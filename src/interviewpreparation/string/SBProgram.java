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
package interviewpreparation.string;

public class SBProgram
{

    public static void main(String[] args)
    {
        String s = "abcd";
        StringBuilder builder = new StringBuilder(s);
        // builder.deleteCharAt(1);
        System.out.println("Removed index 1 from given string: " + builder.toString());
        for (int i = 0; i < builder.length(); i++)
        {
            System.out.println(String.format("index is %d, value is %c", i, builder.charAt(i)));

        }
        System.out.println("Removed: " + builder.deleteCharAt(1).deleteCharAt(2));
    }

}
