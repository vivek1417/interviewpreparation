/*
 * ==============================================================================
 * (c) 2019
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
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
package com.hackerrank.cloudjumps;

import java.io.IOException;
import java.util.Scanner;

public class CountingCloudJumps
{

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c)
	{
		int k = 0;
		int counter = -1;
		int n = c.length;
		for (int i = 0; i < c.length; i++, counter++)
		{
			if (i < n - 2 && c[i + 2] == 0)
			{
				//k = k + i;
				i++;
				//jumpsCounter.add(counter);
				//counter++;
			}
		}
		return counter;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++)
		{
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);
		System.out.println("Clouds :: " + result);

		/*bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		*/
		scanner.close();
	}

}
