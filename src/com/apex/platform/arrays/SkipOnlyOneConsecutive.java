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
package com.apex.platform.arrays;

public class SkipOnlyOneConsecutive
{

	public static void main(String[] args)
	{
		int[] arr =
		{
				1, -7, -5, 8, -3, 9
		};
		/*int[] arr =
		{
				5, 5, 10, 100, 10, 5
		};*/
		System.out.println("Maximum Value of " + findMaxSum(arr, arr.length));

	}

	private static int findMaxSum(int[] arr, int length)
	{
		int skipCons = 0;
		int incl = arr[0];
		int skip_new;

		for (int i = 1; i < arr.length; i++)
		{
			skip_new = (incl > skipCons) ? incl : skipCons;
			System.out.println("Skip Consecutive New No: " + skip_new);
			System.out.println("Skip Consecutive No: " + skipCons + " Current Value of Array= " + arr[i]);
			incl = skipCons + arr[i];
			skipCons = skip_new;
		}
		return ((incl > skipCons) ? incl : skipCons);
	}

}
