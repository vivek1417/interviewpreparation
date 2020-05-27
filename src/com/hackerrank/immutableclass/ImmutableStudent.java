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

public final class ImmutableStudent
{

	private final int id;

	private final String name;

	private Age age;

	public ImmutableStudent(int id, String name, Age age)
	{
		this.id = id;
		this.name = name;
		final Age cloneAge = new Age();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		this.age = cloneAge;

	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public Age getAge()
	{
		Age cloneAge = new Age();
		cloneAge.setDay(this.age.getDay());
		cloneAge.setMonth(this.age.getMonth());
		cloneAge.setYear(this.age.getYear());
		return cloneAge;
	}

}
