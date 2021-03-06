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
package interviewpreparation.northtrust;

import java.util.Arrays;
import java.util.Scanner;

public class FindClosestZero
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int[] intArr = new int[n];
        /*for (int i = 0; i < n; i++)
        {
            intArr[i] = in.nextInt();
        }*/
        // System.out.println("Enter the inuts for " + n);
        String[] lines = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int closest = Integer.parseInt(lines[0]);
        int curr = 0;
        Arrays.sort(lines);

        //System.out.println("" + Arrays.toString(lines));
        for (int i = 0; i < n; i++)
        {
            int data = Integer.parseInt(lines[i]);
            curr = data * data;
            if (curr < (closest * closest))
            {
                closest = data;
            }
        }
        System.out.println(closest);

    }

}
