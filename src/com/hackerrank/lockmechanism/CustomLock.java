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

public class CustomLock
{
    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException
    {
        while (isLocked)
        {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock()
    {
        isLocked = false;
        notify();
    }
}
