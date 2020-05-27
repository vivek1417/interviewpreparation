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

import java.util.Arrays;

public class ArrangeArray
{

	public static void main(String[] args)
	{
		/**
		 * Input like 1 2 3
		 * 2 1 3 - First Arrangement
		 * 2 3 1- Second Arrangement
		 * 3 2 1 - First Arrangement
		 */
		int n = 4;
		int temp = 0;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = i + 1;

		}
		System.out.println("Initial: " + Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i <= n; i++)
		{
			int j = i;

			if (arr[i] < arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				//if (arr[j] / i) count++;
				System.out.println(" i = " + i);
				if (i != 0 && arr[i] % i == 0)
				{
					System.out.println("i = " + i + "arr[[j]" + arr[j]);
					int m = arr[j] / i;
					System.out.println("M= " + m);
					count++;
				}
			}

		}
		for (int i = 0; i < 3; i++)
		{
			System.out.println("" + arr[i]);
		}
		System.out.println("Count == " + count);
	}

}
