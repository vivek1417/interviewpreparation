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

import java.util.ArrayList;

public class CricketData implements Subject
{
    int runs;

    int wickets;

    float overs;

    ArrayList<Observer> observerList;

    public CricketData()
    {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o)
    {
        observerList.add(o);

    }

    @Override
    public void unregisterObserver(Observer o)
    {
        observerList.remove(o);

    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer : observerList)
        {
            observer.update(runs, wickets, overs);
        }
    }

    /**
     * @return the runs
     */
    public int getRuns()
    {
        return runs;
    }

    /**
     * @return the wickets
     */
    public int getWickets()
    {
        return wickets;
    }

    /**
     * @return the overs
     */
    public float getOvers()
    {
        return overs;
    }

    public void dataChanged()
    {
        runs = getRuns();
        wickets = getWickets();
        overs = getOvers();
        notifyObservers();
    }
}
