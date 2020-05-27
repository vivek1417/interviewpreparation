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
package com.apex.platform.stringmanipulation;

public class MainClass
{

	public static void main(String[] args)
	{
		System.out.println(" Result: " + allCharacterSame("aacad", "c"));
	}

	private static boolean allCharacterSame(String s, String mid)
	{
		int position = s.indexOf(mid);
		int midOnce = 0;
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);

			if (s.charAt(0) != c && position != i)
			{
				return false;

			}
			else if (mid.equals("" + c) && position == i && !mid.equals("" + s.charAt(0)) && midOnce >= 1)
			{
				midOnce++;
				return true;
			}

		}
		return true;
	}
}
