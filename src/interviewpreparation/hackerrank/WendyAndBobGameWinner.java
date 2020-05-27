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
package interviewpreparation.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class WendyAndBobGameWinner
{

    public static void main(String[] args)
    {
        String s = "wwwbbbww";
        Map<Character, Integer> gameWinnerMap = new HashMap<Character, Integer>();
        for (int i = 1; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (gameWinnerMap.get(c) == null)
            {
                gameWinnerMap.put(c, 1);
            }
            else
            {
                gameWinnerMap.put(c, gameWinnerMap.get(c) + 1);
            }
        }

        int wendyCount = gameWinnerMap.get('w');
        int bobCount = gameWinnerMap.get('b');
        if (wendyCount == bobCount)
        {
            System.out.println("WendyBob");
        }
        else if (wendyCount > bobCount)
        {
            System.out.println("Wendy");
        }
        else
        {
            System.out.println("Bob");
        }

    }

}
