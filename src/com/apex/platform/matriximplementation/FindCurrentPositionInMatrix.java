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
package com.apex.platform.matriximplementation;

import java.util.ArrayList;
import java.util.List;

public class FindCurrentPositionInMatrix
{

    public static void main(String[] args)
    {
        List<String> listOfDirections = new ArrayList<String>();
        listOfDirections.add("RIGHT");
        listOfDirections.add("LEFT");
        listOfDirections.add("TOP");
        //listOfDirections.add("BOTTOM");
        //listOfDirections.add("RIGHT");
        listOfDirections.add("RIGHT");
        int n = 4;

        int[][] arr =
        {
                {
                        1, 2, 3, 4
                },
                {
                        8, 9, 11, 14
                },
                {
                        22, 33, 44, 55
                },
                {
                        34, 45, 66, 77
                }
        };
        int[] currentX;
        int[] currentY;
        int currentPointer;
        boolean alwaysStartingFromLeft = false;
        for (int i = 0; i < n; i++)
        {
            /* System.out.print(arr[i][0]);*/
            for (int j = 0; j < n; j++)
            {
                //arr[i][j] = arr[0][j];
                System.out.print(arr[i][j] + " ");
                currentPointer = arr[i][j];

                if (alwaysStartingFromLeft)
                {
                    for (String direction : listOfDirections)
                    {
                        if ("RIGHT".equals(direction))
                        {
                            currentPointer = arr[i][j + 1];
                        }
                        else if ("TOP".equals(direction))
                        {
                            currentPointer = arr[i + 1][j];
                        }
                        else if ("LEFT".equals(direction))
                        {
                            currentPointer = arr[i][j - 1];
                        }
                        break;
                    }
                }
                alwaysStartingFromLeft = true;
            }
            System.out.println("");

        }

    }

}
