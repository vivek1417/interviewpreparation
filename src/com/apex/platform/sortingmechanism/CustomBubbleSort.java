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

public class CustomBubbleSort
{

	public static void main(String[] args)
	{
		int size = 3;
		int[] unorderedArray =
		{
				6, 4, 1
		};
		int[] sortedArray = new int[size];
		int swapsCount = 0;
		for (int i = 0; i < unorderedArray.length - 1; i++)
		{
			for (int j = i + 1; j < unorderedArray.length; j++)
			{
				if (unorderedArray[i] > unorderedArray[j])
				{
					//int temp = unorderedArray[i];
					//unorderedArray[i] = unorderedArray[j];
					//unorderedArray[j] = temp;
					unorderedArray[i] = unorderedArray[i] + unorderedArray[j];
					unorderedArray[j] = unorderedArray[i] - unorderedArray[j];
					unorderedArray[i] = unorderedArray[i] - unorderedArray[j];
					swapsCount++;

				}
			}
		}
		for (int i = 0; i < unorderedArray.length; i++)
		{

			System.out.print(unorderedArray[i]);
		}
		System.out.println();
		int len = unorderedArray.length;
		System.out.println(String.format("Array is sorted in %d swaps.", swapsCount));
		System.out.println(String.format("First Element: %d", unorderedArray[0]));
		System.out.println(String.format("Last Element: %d", unorderedArray[len - 1]));
	}

	private static int swap(int i, int j)
	{
		int temp = 0;
		temp = i;
		i = j;
		return j = temp;
	}

}
