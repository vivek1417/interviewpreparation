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
import java.util.LinkedList;
import java.util.Queue;

public class FraudulentActivityMain
{

	public static void main(String[] args)
	{
		/*
				int[] expenditure =
				{
						2, 3, 4, 2, 3, 6, 8, 4, 5
				};*/
		int[] expenditure =
		{
				10, 20, 30, 40, 50
		};
		/*int[] expenditure = new int[200000];
		for (int i = 0; i < 200000; i++)
		{
			expenditure[i] = i;
		}*/
		//No of transaction
		int n = 5;
		//No of Days
		int d = 3;
		int totalNotifications = 0;
		//Arrays.sort(expenditure);
		//System.out.println("Mid: " + midVal(expenditure));
		System.out.println("Total Notifications: " + computeNotifications(expenditure, d));
	}

	private static int computeNotifications(int[] expenditure, int d)
	{
		int totalNotifications = 0;
		Queue<Integer> medianArray = new LinkedList<Integer>();
		//int[] countArray = new int[201];

		for (int j = d; j < expenditure.length; j++)
		{

			if (medianArray.size() < d)
			{
				medianArray.add(expenditure[j]);
				//countArray[expenditure[i]]++;
			}
			else
			{
				int[] medianSortedArray = sortedMedianArrays(medianArray, d);
				//int[] medianSortedArray = sortedMedianArrays(countArray, d);
				System.out.println("Sorted Array " + Arrays.toString(medianSortedArray));
				double median = getMedianVal(medianSortedArray);
				System.out.println("Median: " + median);
				if (expenditure[j] >= (2 * median))
				{
					totalNotifications++;
				}
				int beginEle = medianArray.remove();
				//countArray[beginEle]--;
				medianArray.add(expenditure[j]);
				//countArray[expenditure[i]]++;

			}

		}
		return totalNotifications;

	}

	private static int[] sortedMedianArrays(Queue<Integer> medianArray, int d)
	{

		Object[] stringSubArray = medianArray.toArray();
		int[] subArray = new int[d];
		Arrays.sort(stringSubArray);
		//	int index = 0;
		for (int i = 0; i < d; i++)
		{
			//int repeat = countArray[i];
			subArray[i] = (int) stringSubArray[i];
			/*while (repeat > 0)
			{

				subArray[index++] = i;
				repeat--;
			}*/
		}
		return subArray;
	}

	private static double getMedianVal(int[] arr)
	{
		return midVal(arr);

	}

	private static double midVal(int[] arr)
	{
		int pos = arr.length / 2;
		return arr.length % 2 == 0 ? ((arr[pos - 1] + (double) arr[pos]) / 2) : arr[pos];

	}

}
