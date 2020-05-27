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

public class StringAnagrams
{

	public static void main(String[] args)
	{
		//String a = "fcrxzwscanmligyxyvym";
		//String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		String a = "imkhnpqnhlvaxlmrsskbyyrhwfvgteubrelgubvdmrdmesfxkpykprunzpustowmvhupkqsyjxmnptkcilmzcinbzjwvxshubeln";
		String b = "wfnfdassvfugqjfuruwrdumdmvxpbjcxorettxmpcivurcolxmeagsdundjronoehtyaskpwumqmpgzmtdmbvsykxhblxspgnpgfzydukvizbhlwmaajuytrhxeepvmcltjmroibjsdkbqjnqjwmhsfopjvehhiuctgthrxqjaclqnyjwxxfpdueorkvaspdnywupvmy";
		//String a = "cde";
		//String b = "abc";
		//StringBuilder builder = new StringBuilder(a);
		//StringBuilder builder2 = new StringBuilder(b);
		/*int count = 0;
		for (int i = 0; i < a.length(); i++)
		{
			//StringBuilder removeCharacter = new StringBuilder();
			char c = a.charAt(i);
			if (b.indexOf(c) != -1)
			{
				//removeCharacter.append(b)
				System.out.println("" + a.charAt(i));
				a = a.replace(c, '~');
				b = b.replace(c, '~');

				count++;
			}

		}
		System.out.println("total count ==> " + count);*/
		int totalCount;
		if (a.length() == b.length())
		{
			totalCount = findAnagrams(a, b);
		}
		else if (a.length() > b.length())
		{
			totalCount = findAnagrams(a, b);
		}
		else
		{
			totalCount = findAnagrams(b, a);
		}

		System.out.println(" total Count of " + totalCount);
	}

	private static int findAnagrams(String a, String b)
	{
		System.out.println("String length() " + a.length());
		char[] charArr = a.toCharArray();
		for (int i = 0; i < charArr.length; i++)
		{
			//System.out.println("Char : " + c);
			if (b.indexOf(charArr[i]) != -1)
			{
				a = a.replaceFirst("" + charArr[i], "");
				b = b.replaceFirst("" + charArr[i], "");

			}
		}

		return (a.length() + b.length());

	}

	private static int replaceCharacters(String a, String b)
	{
		char[] charArr = a.toCharArray();
		for (int i = 0; i < charArr.length; i++)
		{
			if (b.indexOf(charArr[i]) != -1)
			{
				a = a.replaceFirst("" + charArr[i], "");
				b = b.replaceFirst("" + charArr[i], "");
			}
		}
		return (a.length() + b.length());
	}

}
