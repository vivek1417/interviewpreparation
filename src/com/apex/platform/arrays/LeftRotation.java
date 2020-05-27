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

public class LeftRotation
{
	private static final Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Out ::" + 3 % 5);
		int n = in.nextInt();
		int leftRotator = in.nextInt();
		int a[] = new int[n];
		int[] rotator = new int[n];
		//int left_rotator = 2;

		int[] holder = new int[n];
		System.out.println("Enter the number %d times" + n);
		for (int i = 0; i < n; i++)
		{
			System.out.println("i = " + i + " Left Rotator : " + leftRotator + " N times : " + n);
			int new_index = (i + (n - leftRotator)) % n;
			System.out.println("New location :: " + new_index);
			a[new_index] = in.nextInt();

		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("After :: " + a[i]);
		}
		System.out.println("Before: " + a.toString());

		System.out.println("" + holder.length);

	}

}
