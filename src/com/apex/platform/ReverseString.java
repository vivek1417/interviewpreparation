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
package com.apex.platform;

public class ReverseString
{

	public static void main(String[] args)
	{
		String str = "7835345";
		String reverseStr = "";
		String revString = "";
		int j = str.length() - 1;
		while (j >= 0)
		{
			revString = revString + str.charAt(j);
			j--;
		}
		System.out.println("Reverse String using whileloop: " + revString);
		for (int i = str.length() - 1; i >= 0; i--)
		{

			reverseStr = reverseStr + str.charAt(i);

		}
		System.out.println("Reverse String using for loop: " + reverseStr);

	}

}
