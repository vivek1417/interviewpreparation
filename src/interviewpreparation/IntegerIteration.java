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

import java.util.ArrayList;
import java.util.List;

public class IntegerIteration
{

    public static void main(String[] args)
    {
        int[] arrs =
        {
                1344, 5656, 546557, 5654756, 786785, 435, 4645647, 35346, 53456, 333
        };
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(new Integer(12334));

        integers.add(new Integer(5656));
        integers.add(new Integer(546557));
        integers.add(new Integer(5654756));
        integers.add(new Integer(786785));
        integers.add(new Integer(435));
        integers.add(new Integer(4645647));
        integers.add(new Integer(35346));
        integers.add(new Integer(53456));
        integers.add(new Integer(333));

        int searchKey = 333;
        for (Integer integer : integers)
        {
            System.out.println("one by one: " + integer);
            if (integer.intValue() == searchKey)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

    }

}
