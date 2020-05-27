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
package com.apex.platform.multithreaded.threadpoolexecutorexample;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author E5285484
 *
 * Create 5 tasks and submit to executor queue. The executor use two threads to execute all tasks.
 */
public class ThreadPoolExecutorTask
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //Fixed thread size
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 5; i++)
        {
            OneTask task = new OneTask("Task " + i);
            System.out.println("Created: " + task.getName());
            threadPoolExecutor.execute(task);
        }
        threadPoolExecutor.shutdown();
    }

}
