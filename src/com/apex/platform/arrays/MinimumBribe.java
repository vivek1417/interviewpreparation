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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MinimumBribe
{

	static void minimumBribes(int[] q, List<Object> ai)
	{
		int count = 0;
		int midOfThree = Integer.MAX_VALUE;
		int maxOfThree = Integer.MAX_VALUE;
		int minOfThree = Integer.MAX_VALUE;
		for (int i = q.length - 1; i >= 0; i--)
		{
			if ((q[i] - i) > 3)
			{
				System.out.println("Too chaotic");
				return;
			}
			else
			{
				if (q[i] > maxOfThree)
				{
					System.out.println("Too chaotic");
					return;
				}
				else if (q[i] > midOfThree)
				{
					count = count + 2;
				}
				else if (q[i] > minOfThree)
				{
					count = count + 1;
				}

				if (q[i] < minOfThree)
				{
					maxOfThree = midOfThree;
					midOfThree = minOfThree;
					minOfThree = q[i];
				}
				else if (q[i] < midOfThree)
				{
					maxOfThree = midOfThree;
					midOfThree = q[i];
				}
				else if (q[i] < maxOfThree)
				{
					maxOfThree = q[i];
				}
			}
		}
		System.out.println(count);
	}

	private static final Scanner scanner = new Scanner(System.in);

	private static BufferedReader reader;

	private static StringTokenizer tokenizer;

	public static void main(String[] args) throws IOException
	{
		reader = new BufferedReader(new InputStreamReader(System.in));
		//int t = scanner.nextInt();
		int t = readInt();

		System.out.println("N times :" + t);
		//reader.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		List<Object> ai = new ArrayList<Object>();
		for (int tItr = 0; tItr < t; tItr++)
		{
			//int n = scanner.nextInt();
			int n = readInt();
			//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			//String[] qItems = scanner.nextLine().split(" ");
			//String[] qItems = reader.readLine().split(" ");
			//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			int swap;
			int position = 0;
			for (int i = 0; i < n; i++)
			{
				q[i] = readInt();
				/*if ((q[i] - (i + 1)) > 2)
				{
					//System.out.println("Too Chaotic");
					ai.add("Too chaotic");
					return;
				}
				for (int j = i + 1; j < n; j++)
				{
					swap = q[i];
					q[i] = q[j];
					q[j] = swap;
					position = position + 1;
				}*/
			}
			//ai.add(position);

			minimumBribes(q, ai);
		}
		reader.close();
		for (Object object : ai)
		{
			if (object instanceof Integer)
			{
				System.out.println(object);
			}
			else
			{
				System.out.println(object);
			}
		}
		//scanner.close();

	}

	private static int readInt() throws IOException
	{
		return Integer.parseInt(nextToken());
	}

	private static String nextToken() throws IOException
	{
		while (tokenizer == null || !tokenizer.hasMoreElements())
		{
			if (!reader.ready())
			{
				//System.exit(0);
			}
			tokenizer = new StringTokenizer(reader.readLine().trim());

		}
		return tokenizer.nextToken();

	}
}
