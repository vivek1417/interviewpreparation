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
package interviewpreparation.java8.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParalellStreamMain
{

    public static void main(String[] args)
    {
        Integer[] values =
        {
                1, 2, 3, 4, 5, 7, 9, 10
        };
        List<Integer> list = Arrays.asList(values);
        Map<Integer, String> map = new HashMap<Integer, String>();
        list.parallelStream().forEach(val -> {
            map.put(val, "A" + val);
            System.out.println("Values: " + val);
        });
    }

}
