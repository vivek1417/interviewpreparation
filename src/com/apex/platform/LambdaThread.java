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
package com.apex.platform;

public class LambdaThread
{
	class MyThread implements Runnable
	{

		@Override
		public void run()
		{
			System.out.println("Main Thread!");

		}

	}

	public static void main(String[] args)
	{
		new Thread(() -> {
			System.out.println("Lamba thread!" + Thread.currentThread());
		}).start();
		Addition addition = (a, b) -> (a + b);
		System.out.println("Total Addition: " + addition.calc(100, 200));
		Addition multiply = (a, b) -> (a * b);
		System.out.println("Multiplication : " + multiply.calc(100, 200));

	}

	interface Addition
	{
		int calc(int a, int b);
	}
}
