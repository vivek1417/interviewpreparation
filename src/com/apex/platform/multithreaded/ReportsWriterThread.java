/*
 * ==============================================================================
 * (c) 2019, 2020
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
package com.apex.platform.multithreaded;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class ReportsWriterThread implements Runnable
{
    ConcurrentHashMap<String, StringBuffer> writerMap = new ConcurrentHashMap<String, StringBuffer>();

    private BlockingQueue<StringBuffer> queue = new ArrayBlockingQueue<StringBuffer>(1024);

    private File file = new File("D:\\java\\reports\\splitted_reports");

    ReportsWriterThread()
    {

    }

    ReportsWriterThread(ConcurrentHashMap<String, StringBuffer> writeMap)
    {
        this.writerMap = writeMap;
    }

    ReportsWriterThread(BlockingQueue queue)
    {
        this.queue = queue;
    }

    @Override
    public void run()
    {
        //writeReportsOnFile();
        generateReportsUsingQueue();
    }

    /**
     *
     */
    private void generateReportsUsingQueue()
    {
        PrintWriter pw = null;
        try
        {
            while (true)
            {
                StringBuffer buffer = queue.take();
                if (buffer == null && !ReportFileSplitter.isReaderLive())
                {
                    return;
                }
                if (buffer != null)
                {
                    String institutionId = buffer.substring(0, 1).equals("1") ? buffer.substring(82, 92) : "";
                    if (!institutionId.isEmpty()) pw = new PrintWriter(file.getAbsolutePath() + "/" + institutionId
                            + "_DSR_FINDTR_" + getCurrentDateFormat() + ".txt");

                    pw.write(buffer.toString());
                    System.out.println(String.format("Institution Id of %s is finished by %s", institutionId,
                            Thread.currentThread().getName()));
                }

            }

        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            pw.close();
        }
    }

    private void writeReportsOnFile()
    {
        PrintWriter pw = null;
        try
        {
            for (Entry<String, StringBuffer> entry : writerMap.entrySet())
            {
                pw = new PrintWriter(file.getAbsolutePath() + "/" + entry.getKey() + "_DSR_FINDTR_"
                        + getCurrentDateFormat() + ".txt");
                pw.write(entry.getValue().toString());
                System.out.println(String.format("Institution Id of %s is finished by %s", entry.getKey(),
                        Thread.currentThread().getName()));
                writerMap.remove(entry.getKey());

                pw.flush();
            }

        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            //pw.close();
        }

    }

    public static String getCurrentDateFormat()
    {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        return df.format(date);

    }
}
