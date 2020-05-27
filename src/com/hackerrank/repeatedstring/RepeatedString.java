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
package com.hackerrank.repeatedstring;

import java.util.Scanner;

public class RepeatedString
{
	static long repeatedString(String s, long n)
	{
		int count = 0;
		long divider = n / s.length();
		StringBuilder sb = new StringBuilder();
		if (s.length() == 1 && s.contains("a"))
		{
			return n;
		}
		else
		{

			for (int i = 0; i < n; i++)
			{
				//sb = sb.append(s);
				if (sb.length() - n <= 0)
				{
					repeat(s, sb);
				}

				if (i <= n)
				{
					if (sb.charAt(i) == 'a')
					{
						count++;
					}
					else
					{
						count = count + 0;
					}
				}
			}
		}
		System.out.println("before before  repeated String: " + sb + " Length: " + sb.length() + " divide: " + divider);
		/*for (int k = 0; k < divider; k++)
		{
			sb = sb.append(s);
		}
		System.out.println("before repeated String: " + sb);
		if (sb.length() - n != 0)
		{
			long length = sb.length() - n;
			if (length > 0)
			{
		
				sb.append(s.charAt(0));
			}
		
		}
		System.out.println("repeated String: " + sb);
		*/
		/*for (int i = 0; i < n; i++)
		{
			if (i <= n)
			{
				if (sb.charAt(i) == 'a')
				{
					count++;
				}
			}
		}*/
		return count;

	}

	private static StringBuilder repeat(String s, StringBuilder sb)
	{

		for (int i = 0; i < s.length(); i++)
		{
			sb = sb.append(s.charAt(i));
		}

		return sb;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);
		System.out.println("repeated a character : " + result);
		scanner.close();

	}

}
