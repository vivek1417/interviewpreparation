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
package com.hackerrank.sock.merchant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant
{

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{

		System.out.println("Enter User Input: ");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int[] inAr = new int[n];
		String[] arrStrings = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 0; i < n; i++)
		{
			int arrItem = Integer.parseInt(arrStrings[i]);
			inAr[i] = arrItem;
		}
		sockMerchant(n, inAr);
		scanner.close();
	}

	private static void sockMerchant(int n, int[] inAr)
	{
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		final ArrayList<Integer> sockPairCounter = new ArrayList<Integer>();
		int c = 1;
		for (int i = 0; i < inAr.length; i++)
		{
			int item = inAr[i];
			if (!hm.containsKey(item))
			{
				hm.put(item, 1);
			}
			else
			{
				if (hm.get(item) >= 1 && hm.get(item) <= 2)
				{
					hm.put(item, hm.get(item) + 1);
					if ((hm.get(item) % 2) == 0)
					{
						hm.remove(item);
						sockPairCounter.add(c);
						c++;
					}
				}
			}
		}
		System.out.println("Total Sock Pairs: " + sockPairCounter.size());
	}

}
