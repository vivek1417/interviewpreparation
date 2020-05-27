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

public class OneDimensionalIteratorImpl implements OneDimensionalContainer
{
    String[] arr;

    public OneDimensionalIteratorImpl(String[] arr)
    {
        this.arr = arr;
    }

    public static void main(String[] args)
    {
        String[] names =
        {
                "Happy", "Wedding", "Day", "Vithya"
        };
        OneDimensionalIteratorImpl driver = new OneDimensionalIteratorImpl(names);
        for (Iterator iterator = driver.getIterator(); iterator.hasNext();)
        {
            String type = (String) iterator.next();
            System.out.println("Array value " + type);

        }
    }

    @Override
    public Iterator<Object> getIterator()
    {

        return new OneDimensionalIterator();
    }

    private class OneDimensionalIterator implements Iterator
    {
        int index;

        @Override
        public boolean hasNext()
        {
            return index < arr.length;
        }

        @Override
        public Object next()
        {
            if (this.hasNext())
            {
                return arr[index++];
            }
            return null;
        }

    }
}
