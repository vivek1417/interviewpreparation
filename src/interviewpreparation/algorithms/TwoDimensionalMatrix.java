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
package interviewpreparation.algorithms;

public class TwoDimensionalMatrix
{

    public static void main(String[] args)
    {
        int[][] twoD =
        {
                {
                        10, 20, 30, 40
                },
                {
                        15, 25, 35, 45
                },
                {
                        27, 29, 37, 48
                },
                {
                        32, 33, 39, 50
                }
        };
        long start = System.currentTimeMillis();
        searchIndex(twoD, 4, 50);
        System.out.println("Milli Seconds: " + (System.currentTimeMillis() - start));

    }

    private static void searchIndex(int[][] twoD, int n, int x)
    {
        int i = 0, j = n - 1;
        while (i < n && j >= 0)
        {
            if (twoD[i][j] == x)
            {
                System.out.println("Fount at " + i + "," + j);
                return;
            }
            if (twoD[i][j] > x)
                j--;
            else
                i++;
        }
        System.out.println("Elemnt not found");
        return;
    }

}
