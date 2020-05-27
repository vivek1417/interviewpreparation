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
package interviewpreparation.utils;

import java.util.ArrayList;

public class SampleArrayList
{

    public static void main(String[] args)
    {
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("A");
        s1.add("B");
        modifyList(s1);
        System.out.println(s1);

    }

    private static void modifyList(ArrayList<String> s1)
    {
        s1.add("B");
        System.out.println(s1);

    }

}
