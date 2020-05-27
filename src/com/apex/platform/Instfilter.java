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

public class Instfilter
{

	public static void main(String[] args)
	{
		String insId = "5912345456";
		String prefix = "59";
		System.out.println(insId.startsWith(prefix) ? insId.replaceFirst(prefix, "") : insId);
		if (insId.startsWith(prefix))
		{
			System.out.println("59 removed in INSTID: " + insId.replaceFirst(prefix, ""));
		}
		else
		{
			System.out.println("No Change: " + insId);
		}

	}

}
