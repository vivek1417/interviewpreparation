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
package interviewpreparation;

import java.util.HashMap;
import java.util.Map;

public class MapInter
{

    public static void main(String[] args)
    {
        Map<String, String> hm = new HashMap<String, String>();
        String[] k =
        {
                null, "2", "3", null, "5"
        };
        String[] v =
        {
                "a", "b", "c", "d", "e"
        };
        for (int i = 0; i < 5; i++)
        {
            hm.put(k[i], v[i]);
            System.out.print(hm.get(k[i]) + " ");
        }
        System.out.print(hm.size() + " " + hm.values() + "\n");
    }

}
