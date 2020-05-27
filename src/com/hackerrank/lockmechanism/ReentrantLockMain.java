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
package com.hackerrank.lockmechanism;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain
{
    private Lock lock = new ReentrantLock();

    int count = 0;

    public static void main(String[] args)
    {

    }

    public int increment()
    {
        try
        {
            lock.lock();
            int newCount = ++count;
            return newCount;
        }
        finally
        {
            lock.unlock();
        }

    }

}
