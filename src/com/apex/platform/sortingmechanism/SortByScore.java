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
package com.apex.platform.sortingmechanism;

import java.util.Comparator;

public class SortByScore implements Comparator<Player>
{

    @Override
    public int compare(Player o1, Player o2)
    {
        int val;
        val = o1.getName().compareTo(o2.getName());
        if (val == 0) val = o1.getScore() - o2.getScore();
        return val;
    }

}
