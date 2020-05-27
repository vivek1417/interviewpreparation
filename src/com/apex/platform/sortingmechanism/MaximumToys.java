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

import java.util.Arrays;

public class MaximumToys
{

	public static void main(String[] args)
	{
		int n = 7;
		//Maximum spend Amount
		int k = 80000000;
		/*int[] prices =
		{
				1, 12, 5, 111, 200, 1000, 10
		};*/
		/*int[] prices =
		{
				1, 2, 3, 4
		};*/
		String s = "2716485 47574329 54317443 73887797 4690442 50158330 36082844 35504863 10098449 36757751 51223808 70905600 2915719 19449463 15531534 90627969 10138256 56422983 94058705 61663313 49377065 49952346 67204721 50973358 35007152 35561646 21839119 62717102 25604425 42393960 26469586 28320910 89968289 33303381 54725059 94658731 83461711 90807903 82679946 46076512 80082006 33903754 69498465 82997725 5869569 85029999 73625694 16007825 41452983 20200751 77671138 43346400 70153097 44875859 46836111 57676602 32953858 68675230 20393704 11074635 63585542 99379642 91911897 6070183 85199375 46636956 53245266 21177439 37444859 35925213 19770303 70043217 69828967 89268768 53040943 75698537 74298768 79182989 44222714 68268103 51900093 21893853 64130855 22053190 19286064 10966966 32246144 52239922 32158548 5156201 15830909 48260442 57052195 7742806 54330625 42251571 54379762 7575892 15945362 44340973 96017457 35715665 14384191 65846424 77500786 19941486 94061313 4315906 51640827 38284028 72584009 3540920 12694233 8923";
		String[] strArr = s.split(" ");
		int[] prices = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++)
		{
			prices[i] = Integer.parseInt(strArr[i]);
		}
		/*for (int i = 0; i < prices.length - 1; i++)
		{
			for (int j = i + 1; j < prices.length; j++)
			{
				if (prices[i] > prices[j])
				{
					prices[i] = prices[i] + prices[j];
					prices[j] = prices[i] - prices[j];
					prices[i] = prices[i] - prices[j];
				}

			}

		}*/
		System.out.println("Total Length: " + prices.length);
		System.out.println("Sorted Array: " + Arrays.toString(prices));
		System.out.println(" Maximum Toys: " + buyMaximumToys(k, prices));
	}

	private static int buyMaximumToys(int k, int[] prices)
	{
		/*for (int i = 0; i < prices.length - 1; i++)
		{
			for (int j = i + 1; j < prices.length; j++)
			{
				if (prices[i] > prices[j])
				{
					prices[i] = prices[i] + prices[j];
					prices[j] = prices[i] - prices[j];
					prices[i] = prices[i] - prices[j];
				}
		
			}
		
		}*/
		Arrays.sort(prices);
		int count = 0;
		int spendAmt = 0;
		for (int i = 0; i < prices.length; i++)
		{
			if (prices[i] <= k && spendAmt <= k)
			{
				spendAmt = spendAmt + prices[i];

				if (spendAmt <= k)
				{
					count++;

				}
			}

		}

		return count;
	}

}
