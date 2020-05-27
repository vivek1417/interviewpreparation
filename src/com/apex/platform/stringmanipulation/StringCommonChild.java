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
package com.apex.platform.stringmanipulation;

public class StringCommonChild
{

	public static void main(String[] args)
	{
		//String s = "AA BB";
		String s = "SHINCHAN NOHARAAA";
		String[] arr = s.split(" ");
		String a = arr[0];
		String b = arr[1];
		char[] chars = a.toCharArray();
		//System.out.println("a length: " + a.length() + " a String " + a + " b length: " + b.length());

		/*if (a.length() == b.length())
		{
			long s1 = 0;
			for (int i = 0; i < a.length(); i++)
			{
				if (b.contains("" + chars[i]))
				{
					//System.out.println("Server : " + a.charAt(i));
					//a = a.replace(a.charAt(i), Character.MIN_VALUE);

					//b = b.replace(b.charAt(i), Character.MIN_VALUE);
					a = a.replaceFirst("" + a.charAt(i), "");
					b = b.replaceFirst("" + b.charAt(i), "");
					s1 = s1 + 1;

				}

			}
			System.out.println("Deleted Character: " + s1);
		}*/
		//String s1 = "ABCDEF";
		//String s2 = "FBDAMN";
		String s1 = "WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";//"OUDFRMYMAW";
		String s2 = "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";//"AWHYFCCMQX";
		int m = s1.length();
		int n = s2.length();
		//System.out.println(" Common Child: " + commonChild(s1, s2, m, n));
		System.out.println("LCS :: " + commonChild(s1, s2));
	}

	private static int commonChild(String x, String y, int m, int n)
	{
		char[] charX = x.toCharArray();
		char[] charY = y.toCharArray();
		return lcm(charX, charY, m, n);
		/*if (m == 0 || n == 0)
		{
			return 0;
		}
		else if (x.charAt(m - 1) == y.charAt(n - 1))
		{
			x = new StringBuilder(x).deleteCharAt(x.indexOf(x.charAt(m - 1))).toString();
			y = new StringBuilder(y).deleteCharAt(y.indexOf(y.charAt(n - 1))).toString();
			System.out.println(String.format("First %s = = Second %s String", x, y));
			return 1 + commonChild(x, y, m - 1, n - 1);
		}
		else
		{
			//x = new StringBuilder(x).deleteCharAt(x.indexOf(x.charAt(m))).toString();
			//y = new StringBuilder(y).deleteCharAt(y.indexOf(y.charAt(n))).toString();
			//System.out.println(String.format("Else First %s = = Second %s String", x, y));
			return findMax(commonChild(x, y, m - 1, n), commonChild(x, y, m, n - 1));
		}
		*/
	}

	private static int lcm(char[] x, char[] y, int m, int n)
	{
		if (m == 0 || n == 0)
		{
			return 0;
		}
		else if (x[m - 1] == y[n - 1])
		{
			//x = new StringBuilder(x).deleteCharAt(x.indexOf(x.charAt(m - 1))).toString();
			//y = new StringBuilder(y).deleteCharAt(y.indexOf(y.charAt(n - 1))).toString();
			System.out.println(String.format("First %s = = Second %s String", x, y));
			return 1 + lcm(x, y, m - 1, n - 1);
		}
		else
		{
			//x = new StringBuilder(x).deleteCharAt(x.indexOf(x.charAt(m))).toString();
			//y = new StringBuilder(y).deleteCharAt(y.indexOf(y.charAt(n))).toString();
			//System.out.println(String.format("Else First %s = = Second %s String", x, y));
			return findMax(lcm(x, y, m, n - 1), lcm(x, y, m - 1, n));
		}

	}

	private static int findMax(int a, int b)
	{

		return a > b ? a : b;
	}

	public static int commonChild(String s1, String s2)
	{

		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();
		return lcs(x, y);

	}

	private static int lcs(char[] x, char[] y)
	{
		int[][] lcs = new int[x.length + 1][y.length + 1];

		/*for (int i = 0; i <= x.length; i++)
		{
			lcs[i][0] = 0;
		}
		for (int i = 0; i <= y.length; i++)
		{
			lcs[0][i] = 0;
		}*/
		for (int i = 1; i <= x.length; i++)
		{
			for (int j = 1; j <= y.length; j++)
			{
				if (x[i - 1] == y[j - 1])
				{
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
				}
				else
				{
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
					/*if (lcs[i][j] == lcs[i - 1][j])
					{
						System.out.println("Top");
					}
					else
					{
						System.out.println("Left");
					}*/
				}

			}
		}
		return lcs[x.length][y.length];

	}

}
