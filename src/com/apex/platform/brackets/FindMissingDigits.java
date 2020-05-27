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
package com.apex.platform.brackets;

public class FindMissingDigits
{

    public static void main(String[] args)
    {
        String input = "10 + 40 = x0";
        System.out.println(findMissingDigit(input));
    }

    private static String findMissingDigit(String input)
    {
        String[] arr = input.split(" ");
        String operator = arr[1];
        String originalX;
        int pos;
        if (arr[0].equals("x") || arr[0].contains("x"))
        {
            pos = 0;
        }
        else if (arr[2].equals("x") || arr[2].contains("x"))
        {
            pos = 2;
        }
        else
        {
            pos = 4;
        }

        if (pos == 0)
        {
            String operandOperator = arr[0];
            originalX = findXthPosition(operandOperator, missingDigit(operator, arr[2], arr[4]));
        }
        else if (pos == 2)
        {
            originalX = findXthPosition(arr[2], missingDigit(operator, arr[0], arr[4]));
        }
        else
        {
            originalX = findXthPosition(arr[4], missingDigit(operator, arr[0], arr[2], pos));
        }

        return originalX;

    }

    private static String findXthPosition(String operandOperator, String x)
    {
        if (!operandOperator.matches("[0-9]+"))
        {
            for (int i = 0; i < operandOperator.length(); i++)
            {
                if (operandOperator.charAt(i) != x.charAt(i))
                {
                    return String.valueOf(x.charAt(i));
                }
            }
        }

        return x;
    }

    private static String missingDigit(String operator, String operandA, String operandB)
    {
        int x;
        if (operator.equals("*"))
        {
            x = Integer.valueOf(operandB) / Integer.valueOf(operandA);
        }
        else if (operator.equals("+"))
        {
            x = Integer.valueOf(operandB) - Integer.valueOf(operandA);
        }
        else if (operator.equals("-"))
        {
            x = Integer.valueOf(operandB) + Integer.valueOf(operandA);
        }
        else
        {
            x = Integer.valueOf(operandB) * Integer.valueOf(operandA);
        }
        return String.valueOf(x);
    }

    private static String missingDigit(String operator, String operandA, String operandB, int position4)
    {
        int x;
        if (operator.equals("*"))
        {
            x = Integer.valueOf(operandA) * Integer.valueOf(operandB);
        }
        else if (operator.equals("+"))
        {
            x = Integer.valueOf(operandA) + Integer.valueOf(operandB);
        }
        else if (operator.equals("-"))
        {
            x = Integer.valueOf(operandA) - Integer.valueOf(operandB);
        }
        else
        {
            x = Integer.valueOf(operandA) / Integer.valueOf(operandB);
        }
        return String.valueOf(x);
    }

}
