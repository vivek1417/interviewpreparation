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
package com.hackerrank.valleys;

import java.io.IOException;
import java.util.Scanner;

public class CountValleys
{
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{

		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);
		System.out.println(" output: " + result);
		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}

	static int countingValleys(int n, String s)
	{
		int sum = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == 'U')
			{
				if (++sum == 0) count++;
			}
			else
			{
				sum--;
			}
		}
		return count;
	}
}
