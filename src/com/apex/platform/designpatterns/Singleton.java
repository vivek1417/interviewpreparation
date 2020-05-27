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
package com.apex.platform.designpatterns;

public class Singleton
{
	private static Singleton singleton = null;

	private Singleton()
	{

	}

	public static Singleton getInstance()
	{
		if (singleton == null)
		{
			synchronized (Singleton.class)
			{
				if (singleton == null)
				{
					singleton = new Singleton();
				}
			}

		}
		return singleton;
	}

	public static void main(String[] args)
	{
		Singleton.getInstance();

	}

}
