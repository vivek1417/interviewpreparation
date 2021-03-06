/*
 * ==============================================================================
 * (c) 2020
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
package interviewpreparation;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class FindJVMInstalledBit
{

    public static void main(String[] args)
    {
        System.out.println(System.getProperty("sun.arch.data.model") + "-bit JVM");
        Map<String, String> tmap = new TreeMap<String, String>();
        tmap.put("Kelly", "Dummy");
        tmap.put("body", "School");
        NavigableMap<String, String> navigableMap = new TreeMap<String, String>();
        navigableMap.put("flower", "Rose");
        navigableMap.put("employee1", null);
        System.out.println(navigableMap.lastKey());

    }
}
