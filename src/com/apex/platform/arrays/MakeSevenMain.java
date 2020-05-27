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

public class MakeSevenMain
{

	public static void main(String[] args)
	{
		//makeSeven(5, 9);
		makeDiamond("ABCDEF");

	}

	private static void makeDiamond(String string)
	{
		String space = " ";
		for (int i = 0; i < string.length(); i++)
		{
			if (i == 0)
			{
				System.out.println(string);
			}
			else
			{
				string = string.substring(1, string.length() - 1);

				System.out.println(space + string);
				space = space + " ";
			}
		}
	}

	private static void makeSeven(int n, int k)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = i - 1; j < n; j++)
			{
				if (i == 0)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print(k);
				}

			}
			System.out.println(" ");
		}

	}

}
