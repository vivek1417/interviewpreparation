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

public class Checker implements Comparator<Player>
{
    //Ascending order- Object1.getField().compareTo(Object2.getField());
    @Override
    public int compare(Player o1, Player o2)
    {
        //if(o1.getScore() == o2.getScore())
        //Descending order
        int score = o2.getScore() - o1.getScore();
        int name = o2.getName().compareTo(o1.getName());
        if (score == 0)
        {
            return ((name == 0) ? score : name);
        }
        else
        {
            return score;
        }
    }

}
