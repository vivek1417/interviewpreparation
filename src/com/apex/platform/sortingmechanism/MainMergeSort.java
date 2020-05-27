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
package com.apex.platform.sortingmechanism;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class MainMergeSort
{
    //static int swapCount = 0;

    public static void main(String[] args)
    {
        /*int arr[] =
        {
        		90, 23, 101, 45, 65, 23, 67, 89, 34, 23
        };*/
        int[] arr =
        {
                // 1, 1, 1, 2, 2
                //2, 1, 3, 1, 2
                //1, 20, 6, 4, 5
                // 1, 5, 3, 7
                7, 5, 3, 1
        };
        long startTime = System.currentTimeMillis();
        int begin = 0;
        int end = arr.length - 1;
        long swapCount = mergeSort(arr, begin, end);
        System.out.println("Sorted Array " + swapCount);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print((i == arr.length) ? arr[i] : arr[i] + " ");
        }
        System.out.println();
        long totalTime = System.currentTimeMillis() - startTime;
        long elapsedTime = TimeUnit.SECONDS.convert(totalTime, TimeUnit.MILLISECONDS);
        System.out.println("Total time consumed :" + elapsedTime);
        //System.out.println("total Inversions: " + swapCount);
    }

    static long mergeSort(int[] commonArray, int begin, int end)
    {

        if (begin == end) return 0;

        System.out.println("Before : " + Arrays.toString(commonArray));
        int mid = (begin + end) / 2;
        long swapCount = 0;
        swapCount += mergeSort(commonArray, begin, mid);
        swapCount += mergeSort(commonArray, mid + 1, end);
        swapCount += merge(commonArray, begin, mid, end);
        System.out.println("After : " + Arrays.toString(commonArray));

        return swapCount;

    }

    private static long merge(int[] commonArray, int begin, int mid, int end)
    {
        // int mid = (begin + end) / 2;
        System.out.println("End: " + end + " Begin: " + begin);
        int[] temp = new int[end - begin + 1];
        int i = begin, j = mid + 1, k = 0;
        long swaps = 0;

        while (i <= mid && j <= end)
        {

            if (commonArray[i] > commonArray[j])
            {
                System.out.println("Array of i: " + commonArray[i] + " array of j : " + commonArray[j]);
                temp[k++] = commonArray[j++];
                swaps += mid - i + 1;
            }
            else
                temp[k++] = commonArray[i++];
        }
        while (i <= mid)
        {
            temp[k++] = commonArray[i++];
        }
        while (j <= end)
        {
            temp[k++] = commonArray[j++];
        }
        int length = end - begin + 1;
        System.out.println("Copying array length is: " + length);
        System.arraycopy(temp, 0, commonArray, begin, length);
        return swaps;

    }

}
