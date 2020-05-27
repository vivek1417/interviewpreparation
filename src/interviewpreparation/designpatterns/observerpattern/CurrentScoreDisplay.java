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
package interviewpreparation.designpatterns.observerpattern;

public class CurrentScoreDisplay implements Observer
{
    int runs;

    int wickets;

    float overs;

    @Override
    public void update(int runs, int wickets, float overs)
    {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();

    }

    public void display()
    {
        System.out.println("Current Score Display:" + "Runs: " + runs + " Wickets: " + wickets + " Overs: " + overs);
    }

}
