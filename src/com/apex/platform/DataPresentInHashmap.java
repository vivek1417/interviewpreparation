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

import java.util.concurrent.ConcurrentHashMap;

public class DataPresentInHashmap
{

	public static void main(String[] args)
	{
		ConcurrentHashMap<String, String> cmap = new ConcurrentHashMap<String, String>();
		cmap.put("apexdev~apexeims~e5285484", "accesstoken");
		cmap.put("apexdev~apexeims~e5285483", "accesstoken1");
		cmap.put("apexdev~apexeims~e5285482", "accesstoken2");
		if (cmap.get("apexdev~apexeims~e5285484") != null)
		{
			//cmap.computeIfPresent("apexdev~apexeims~e5285484", (k, v) -> v + 1);
			cmap.replace("apexdev~apexeims~e5285484", "acceaayon");
		}
		System.out.println("Map ::" + cmap.toString());
	}

}
