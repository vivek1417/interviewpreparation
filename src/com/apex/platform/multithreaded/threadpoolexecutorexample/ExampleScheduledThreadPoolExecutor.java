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

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledFuture will execute tasks in repeated manner.
 * @author E5285484
 *
 */
public class ExampleScheduledThreadPoolExecutor
{

    public static void main(String[] args)
    {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) Executors
                .newScheduledThreadPool(2);
        Task task = new Task("Repeat Task");
        System.out.println("Created : " + task.getName());
        scheduledThreadPoolExecutor.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);

    }

}

class Task implements Runnable
{
    private String name;

    public Task(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void run()
    {
        System.out.println("Executing : " + name + " , Current Seconds" + new Date().getSeconds());
    }
}
