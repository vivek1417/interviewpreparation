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

import java.util.Scanner;

public class ArrayManipulationMain
{
	//System Inputs via scanner
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		String[] nm = scanner.nextLine().split(" ");
		int a, b, k;
		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		//int[][] queries = new int[m][3];
		long[] queries = new long[n];
		long max = 0, x = 0;
		for (int i = 0; i < m; i++)
		{
			//String[] queriesRowItems = scanner.nextLine().split(" ");
			//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			/*for (int j = 0; j < 3; j++)
			{
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				System.out.println("Item: " + queriesItem);
				queries[i][j] = queriesItem;
				System.out.println(queries[i][j]);
			}*/
			a = scanner.nextInt();
			b = scanner.nextInt();
			k = scanner.nextInt();
			//System.out.println("a=" + a + " b=" + b + " k = " + k);
			queries[a - 1] += k;
			//System.out.println("queries[" + (a - 1) + "]=" + k);
			if (b <= n - 1) queries[b] -= k;

		}
		//long result = arrayManipulation(n, queries);
		for (int i = 0; i < n; i++)
		{
			x += queries[i];

			if (max < x) max = x;

		}
		System.out.println(max);
		scanner.close();
	}

	private static long arrayManipulation(int n, int[][] queries)
	{
		System.out.println("Array Manipulation : " + queries);
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (j == 0)
				{
					System.out.println(queries[i][j] + " ");
				}

			}
			//System.out.println();
		}
		return 0;
	}
}
