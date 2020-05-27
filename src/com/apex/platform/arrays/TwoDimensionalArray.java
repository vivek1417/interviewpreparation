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

public class TwoDimensionalArray
{

	public static void main(String[] args)
	{
		int[][] twoDim = new int[2][3];
		int k = 1;
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				twoDim[i][j] = k;
				System.out.println("twoDim[" + i + "][" + j + "]=" + twoDim[i][j] + " ");
				k++;
			}
			//System.out.println();
		}
	}

}
