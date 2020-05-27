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

import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPoolExecutor
{
    //Thread pool size
    private int poolSize;

    //Internally pool is an array
    private WorkerThread[] workers;

    private LinkedBlockingQueue<Runnable> queue;

    public CustomThreadPoolExecutor(int poolSize)
    {
        this.poolSize = poolSize;
        queue = new LinkedBlockingQueue<Runnable>();
        workers = new WorkerThread[poolSize];
        for (int i = 0; i < poolSize; i++)
        {
            workers[i] = new WorkerThread();
            workers[i].start();
        }

    }

    /**
     *
     * @param task
     */
    public void execute(Runnable task)
    {
        synchronized (queue)
        {
            queue.add(task);
            queue.notify();

        }
    }

    /**
     * Stop all the running the threads
     */
    public void shutdown()
    {
        System.out.println("Shutting down thread pool");
        for (int i = 0; i < poolSize; i++)
        {
            workers[i] = null;
        }
    }

    private class WorkerThread extends Thread
    {

        @Override
        public void run()
        {
            Runnable task;
            while (true)
            {
                synchronized (queue)
                {
                    while (queue.isEmpty())
                    {
                        try
                        {
                            queue.wait();
                        }
                        catch (InterruptedException e)
                        {
                            System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                        }
                    }
                    task = queue.poll();
                }
                task.run();
            }

        }
    }

    /***
     * Main thread which is used to run this program
     * @param args
     */
    public static void main(String args[])
    {
        CustomThreadPoolExecutor threadPool = new CustomThreadPoolExecutor(2);
        for (int i = 1; i <= 5; i++)
        {
            Task task = new Task("Task " + i);
            System.out.println("Created: " + task.getName());
            threadPool.execute(task);
        }
    }
}
