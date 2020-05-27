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

import java.util.Scanner;

public class FraudulentActivitySolution
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[210];
		int[] expenditure = new int[n];
		if (d >= n)
		{
			System.out.println(0);
			return;
		}
		for (int i = 0; i < d; i++)
		{
			expenditure[i] = in.nextInt();
			a[expenditure[i]]++;
		}
		int notifications = 0;
		for (int i = d; i < n; i++)
		{
			expenditure[i] = in.nextInt();
			int count = 0;
			double mid = 0;
			for (int j = 0; j < 210; j++)
			{
				count += a[j];
				if (2 * count >= d)
				{
					if (2 * count == d)
					{

						mid = j;
					}
					else
					{
						if (mid != 0)
						{
							mid = (mid + j) / 2;
						}
						else
						{
							mid = j;
						}

						break;
					}

				}
			}
			//Count if satisfied
			if (expenditure[i] >= 2 * mid) notifications++;

			a[expenditure[i]]++;
			a[expenditure[i - d]]--;
		}
		System.out.println(notifications);
		in.close();
	}
}
