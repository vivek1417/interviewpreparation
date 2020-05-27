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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumMoves
{

	public static void main(String[] args)
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(1234654678);
		a.add(1345349813);
		List<Integer> m = new ArrayList<Integer>();
		m.add(1457892424);
		m.add(1784523413);
		int index = 0;
		for (Integer integer : a)
		{
			Integer m1 = m.get(index);
			int[] firstArray = getArray(integer);
			int[] mArray = getArray(m1);
			System.out.println(matchArray(firstArray, mArray));
			System.out.println("First Array:: " + Arrays.toString(firstArray));
			index++;
		}
	}

	private static int matchArray(int[] firstArray, int[] mArray)
	{
		int minmumMoves = 0;
		if (Arrays.equals(firstArray, mArray))
		{
			return 0;
		}
		else
		{
			for (int i = 0; i < firstArray.length; i++)
			{

				//Decrement firstArray when its equals with mArray[j]
				System.out.println(String.format("First array is %d == Second Array is %d ", firstArray[i], mArray[i]));
				if (firstArray[i] > mArray[i])
				{
					System.out.println("First Array is greater than M array");
					int dec = firstArray[i] - mArray[i];
					firstArray[i] = firstArray[i] - dec;
					minmumMoves++;
				}
				else
				{
					System.out.println("First Array is less than M array");
					int inc = mArray[i] - firstArray[i];
					firstArray[i] = firstArray[i] + inc;
					minmumMoves++;
				}

			}
		}
		return minmumMoves;
	}

	private static int[] getArray(Integer a)
	{

		String temp = a.toString();
		int arr[] = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			arr[i] = Character.getNumericValue(temp.charAt(i));

		}
		System.out.println("Before Array:: " + Arrays.toString(arr));
		return arr;

	}

}
