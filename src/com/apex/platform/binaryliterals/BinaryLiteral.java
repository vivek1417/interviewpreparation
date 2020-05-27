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
package com.apex.platform.binaryliterals;

public class BinaryLiteral
{

	public static void main(String[] args)
	{
		System.out.println("And Operation : " + andOperation());
		//Invoke BinaryLiteral in Byte
		printByteValue();

		printLongValue();
	}

	static int andOperation()
	{
		int a = 7;//0b0001010
		int b = 16;//0b0000000
		System.out.println("Listen : " + Integer.bitCount(a) + " Binary Value: " + Integer.toBinaryString(a));
		return a & b;

	}

	static void printByteValue()
	{
		byte b1 = 0b1111111;
		byte b2 = 0B101;
		System.out.println("Binary Literal in Byte");
		System.out.println("b1 = " + b1 + " Bits count: " + Integer.bitCount(b1));
		System.out.println("b2 = " + b2);
	}

	static void printLongValue()
	{
		long l1 = 0b111110000;
		long l2 = 0B101;
		System.out.println("Binary Literal in long");
		System.out.println("b1 = " + l1 + " Bits count: " + Long.bitCount(l1));
		System.out.println("b2 = " + l2);
	}

	static void printShortValue()
	{
		short s1 = 0b111110000;
		short s2 = 0B101;
		System.out.println("Binary Literal in short");
		//Short.bi
		System.out.println("b1 = " + s1 + " Bits count: " + Long.bitCount(s1));
		System.out.println("b2 = " + s2);
	}

}
