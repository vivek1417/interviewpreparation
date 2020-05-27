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
package interviewpreparation;
/*
 * =============================================================================
 * = (c) 2019 Fidelity National Information Services, Inc. and/or its
 * subsidiaries - All Rights Reserved worldwide.
 * ---------------------------------------------------------------------------
 * This document is protected under the trade secret and copyright laws as the
 * property of Fidelity National Information Services, Inc. and/or its
 * subsidiaries. Copying, reproduction or distribution should be limited and
 * only to employees with a 'need to know' to do their job. Any disclosure of
 * this document to third parties is strictly prohibited.
 * =============================================================================
 */

import java.util.Scanner;

public class RemoveDuplicatesFromString
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter a String here...");
        System.out.println("Output is: " + remvoeDuplicates(in.nextLine()));

    }

    /**
     * Remove brackets from a given string if does not have any match
     *
     * @param nextLine
     */
    private static String remvoeDuplicates(String str)
    {

        StringBuilder rightBracketer = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            //  System.out.println("length : " + str.length() + "ith: " + i);
            char nextchar = str.length() - 1 == i ? str.charAt(i) : str.charAt(i + 1);
            //System.out.println("Next Char: " + nextchar);
            if ('(' == c && ')' == nextchar)
            {
                // str = str.substring(i, i + 1);
                //System.out.println("fist %d: ",i + c + " next one : " + nextchar);
                System.out.println(String.format("%dth=%c, next %dth = %c", i, c, i + 1, nextchar));
                //  System.out.println("Before: " + rightBracketer + " Original : " + str);
                // str = str.replace("" + c, "").replace(")", "");
                rightBracketer.deleteCharAt(i).deleteCharAt(i + 1);
                System.out.println("After delete character at index 1" + rightBracketer.toString());
                //rightBracketer.deleteCharAt(i + 1);
                System.out.println("" + rightBracketer);
            }

        }

        System.out.println("output : " + rightBracketer.toString());

        return rightBracketer.toString();
    }

}
