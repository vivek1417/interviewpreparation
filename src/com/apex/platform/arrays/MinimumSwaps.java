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

import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps
{
	static void swap(int[] arr, int left, int right)
	{
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;

	}

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr)
	{
		int swap = 0;
		int count = 0;
		int firstPointer = arr.length - 1;
		System.out.println(" First Pointer : " + firstPointer);
		while (count < arr.length)
		{
			int arrVal = count + 1;
			if (arr[count] == arrVal)
			{
				System.out.println(" " + arr[count]);
				count++;
				continue;
			}
			while (arr[firstPointer] != arrVal)
			{
				System.out.println("Right Pointer: " + firstPointer);
				firstPointer--;
			}
			if (firstPointer != count)
			{
				System.out.println("swap: " + arr[count] + " left: " + count + " Right: " + firstPointer);
				swap(arr, count, firstPointer);
				swap++;
			}

			firstPointer = arr.length - 1;
			System.out.println("index= " + count + " it's value = " + arr[count]);
			count++;
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("i: " + i + " " + arr[i] + " ");
		}
		/*for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swap = swap + 1;
				}
			}
		}*/
		return swap;
	}

	private static final Scanner scanner = new Scanner(System.in);

	private static final String TRUNCATE_STRING = "{-truncated-}";

	private static final String REPLACEMENT_STRING = "\\{-truncated-\\}";

	public static void main(String[] args) throws IOException
	{
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		boolean truncate = false;
		for (int i = 0; i < n; i++)
		{
			int arrItem;
			if (arrItems[i].contains("{truncated}"))
			{
				arrItem = Integer.parseInt(arrItems[i].replaceAll("\\{truncated\\}", ""));
				truncate = true;
			}
			else
			{
				arrItem = Integer.parseInt(arrItems[i]);
			}

			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);

		System.out.println(truncate ? res + "{truncated}" : res);

		/*bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();
		*/
		scanner.close();

	}

}
