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

/**
 * Convert int from String
 * @author E5285484
 *
 */
public class ConvertStringToInt
{
    static int convertStringToInt(String s)
    {
        if (s.length() == 1) return (s.charAt(0) - '0');

        double y = convertStringToInt(s.substring(1));
        double x = s.charAt(0) - '0';
        x = x * Math.pow(10, s.length() - 1) + y;

        return (int) x;
    }

    public static void main(String[] args)
    {
        String val = "03456";
        System.out.println(convertStringToInt(val));

    }

}
