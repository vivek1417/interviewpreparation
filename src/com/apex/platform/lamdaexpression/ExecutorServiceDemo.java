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
package com.apex.platform.lamdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Executor Service Demo!");
		ExecutorService executor = Executors.newWorkStealingPool();
		List<Callable<String>> callables = Arrays.asList(() -> "task1", () -> "task2", () -> "task3");
		executor.invokeAll(callables).stream().map(future -> {
			try
			{
				return future.get();
			}
			catch (Exception e)
			{
				System.out.println("Exception " + e.getMessage());
			}
			return null;
		}).forEach(System.out::println);
	}
}
