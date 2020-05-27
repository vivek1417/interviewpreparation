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
package com.apex.platform.designpatterns.iteratorpattern;

import java.util.Iterator;
import java.util.Objects;

public class MetricsIteratorImpl
{
    public String[][] twoD;

    MetricsIteratorImpl(String[][] twoD)
    {
        this.twoD = twoD;
    }

    private class MetricsIterator implements Iterator<Object>
    {
        int i = 0;

        int j = 0;

        @Override
        public boolean hasNext()
        {

            return i < twoD.length && j < twoD[i].length;
        }

        @Override
        public Object next()
        {
            //Check null
            if (!hasNext()) return null;
            while (i < twoD[j].length)
            {
                while (j < twoD[i].length)
                {
                    if (Objects.nonNull(twoD[i][j]))
                    {
                        String s = twoD[i][j];
                        j++;
                        resetIndexes();
                        return s;
                    }
                    else
                    {
                        j++;
                        resetIndexes();
                    }
                }
                i++;
            }
            return null;
        }

        private void resetIndexes()
        {
            if (j == twoD[i].length)
            {
                j = 0;
                i++;
            }
        }
    }

    public Iterator getIterator()
    {
        return new MetricsIterator();

    }

    public static void main(String[] args)
    {
        String[][] twoD =
        {
                {
                        "1", "2"
                },
                {
                        "3", "4"
                }
        };
        MetricsIteratorImpl metricsIteratorImpl = new MetricsIteratorImpl(twoD);
        for (Iterator iterator = metricsIteratorImpl.getIterator(); iterator.hasNext();)
        {
            String type = (String) iterator.next();
            System.out.println(type);

        }
    }
}
