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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingByComparator
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        List<Player> players = Arrays.asList(player);
        SortByScore score = new SortByScore();
        for (int i = 0; i < n; i++)
        {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        //Arrays.sort(player, checker);
        //Collections.sort(player, score);
        Collections.sort(players, checker);
        for (int i = 0; i < player.length; i++)
        {
            System.out.printf("%s %s\n", player[i].getName(), player[i].getScore());
        }

    }

}
