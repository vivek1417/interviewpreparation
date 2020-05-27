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
package com.hackerrank.immutableclass;

public class ImmutableMain
{

	public static void main(String[] args)
	{
		Age age = new Age();
		age.setDay(10);
		age.setMonth(12);
		age.setYear(2019);
		ImmutableStudent immutableStudent = new ImmutableStudent(1, "Vivek", age);
		System.out.println(" Before Year: " + immutableStudent.getAge().getYear());
		immutableStudent.getAge().setYear(2014);
		age.setYear(2017);
		System.out.println(" After Year: " + immutableStudent.getAge().getYear());

	}

}
