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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets
{

	public static void main(String[] args)
	{
		int ratio = 5;

		List<Long> longList = new ArrayList<Long>();
		//longList = Arrays.asList(arr);
		longList.add(1l);
		longList.add(new Long(5));
		longList.add(5l);
		longList.add(25l);
		longList.add(125l);
		System.out.println("Count of Triplets == " + countTripletsFromGivenArray(longList, ratio));
	}

	private static long countTripletsFromGivenArray(List<Long> arr, int r)
	{
		Map<Long, Long> counter = new HashMap<Long, Long>();
		Map<Long, Long> tripletMap = new HashMap<Long, Long>();
		long count = 0;
		for (int i = 0; i < arr.size(); i++)
		{
			Long arrKey = arr.get(i);
			count += counter.get(arrKey) == null ? 0 : counter.get(arrKey);
			if (tripletMap.get(arrKey) != null) counter.compute(arrKey * r,
					(key, value) -> value != null ? value + tripletMap.get(arrKey) : tripletMap.get(arrKey));
			tripletMap.compute(arrKey * r, (key, value) -> value == null ? 1 : value + 1);
		}
		counter.forEach((k, v) -> {
			System.out.println("Key: " + k + " Value: " + v);
		});
		tripletMap.forEach((k, v) -> {
			System.out.println("Key from TripletMap -> " + k + " Value from TripletMap-> " + v);
		});
		return count;

	}

	private static boolean multiplyWithRatio(int first, List<Long> longList, int r, int second)
	{
		return longList.get(first) * r == longList.get(second) ? true : false;

	}

	private static String formTriplet(int i, int j, int k)
	{
		return i + "," + j + "," + k;
	}

	private static String getListVal(int i, int j, int k, List<Long> longList)
	{

		return longList.get(i) + "," + longList.get(j) + "," + longList.get(k);
	}

}
