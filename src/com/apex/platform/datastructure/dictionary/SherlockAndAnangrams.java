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
package com.apex.platform.datastructure.dictionary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnangrams
{

	public static void main(String[] args)
	{
		String a = "kkkk";

		sherlockAndAnagrams(a);
	}

	private static void sherlockAndAnagrams(String a)
	{

		Map<String, Integer> anagramsMap = new HashMap<String, Integer>();
		int totalCountOfAnagrams = 0;
		for (int i = 0; i < a.length(); i++)
		{
			for (int j = i + 1; j <= a.length(); j++)
			{
				String currentSubStr = a.substring(i, j);
				char[] charArray = currentSubStr.toCharArray();
				Arrays.sort(charArray);
				currentSubStr = String.valueOf(charArray);
				Integer value = anagramsMap.get(currentSubStr);
				if (value == null)
				{
					anagramsMap.put(currentSubStr, 1);
				}
				else
				{
					totalCountOfAnagrams = totalCountOfAnagrams + value;
					//anagramsMap.put(currentSubStr, value + 1);
					anagramsMap.merge(currentSubStr, 1, Integer::sum);
				}

			}
		}

		System.out.println("Anagrams == " + totalCountOfAnagrams);

	}

}
