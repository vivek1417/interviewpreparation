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
package com.apex.platform.multithreaded;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class ReportFileSplitter
{
	private static final String INPUT_PATH = "D:\\java\\reports";

	private static final int QUEUE_SIZE = 1024;

	private static final int READER_THREAD_SIZE = 10;

	static ConcurrentHashMap<String, StringBuffer> blockConcurrentHashMap = new ConcurrentHashMap<String, StringBuffer>();

	private static ArrayBlockingQueue<StringBuffer> queue;

	private static Collection<Thread> fileReaderThread, fileWriterThread, allCollectionThread;

	public static void main(String[] args)
	{
		long startTime = System.nanoTime();

		//File[] files = ;
		//ReportsReaderThread readerThread = new ReportsReaderThread(blockConcurrentHashMap, files);
		//ReportsWriterThread writerThread = new ReportsWriterThread(blockConcurrentHashMap);
		//Thread reader = new Thread(readerThread);
		fileReaderThread = new ArrayList<Thread>();
		//fileWriterThread = new ArrayList<Thread>(blockConcurrentHashMap.size());
		fileWriterThread = new ArrayList<Thread>();
		allCollectionThread = new ArrayList<Thread>();
		queue = new ArrayBlockingQueue<StringBuffer>(QUEUE_SIZE);
		//Thread writer = new Thread(writerThread);
		//reader.start();
		//reader.join();
		//fileLoader(loadReports(INPUT_PATH));
		readAndSplitReports(loadReports(INPUT_PATH));
		createAndWriteReports();
		for (Thread t : allCollectionThread)
		{
			try
			{
				t.join();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Thread.sleep(1000);
		//writer.start();
		//writer.join();

		long totalTime = System.nanoTime() - startTime;
		System.out.println("total Time consumed: " + TimeUnit.NANOSECONDS.toMillis(totalTime) + " MilliSeconds");
	}

	private static void fileLoader(File[] loadReports)
	{
		for (int i = 0; i < loadReports.length; i++)
		{
			//Thread fileThread = new Thread(new Reports);
		}

	}

	private static void readAndSplitReports(File[] files)
	{
		for (int i = 0; i < files.length; i++)
		{
			Thread readThread = new Thread(new ReportsReaderThread(queue, files[i]), "reader-" + i);
			fileReaderThread.add(readThread);
			readThread.start();
		}
		allCollectionThread.addAll(fileReaderThread);
	}

	private static void createAndWriteReports()
	{

		for (int i = 0; i < READER_THREAD_SIZE; i++)
		{
			Thread writerThread = new Thread(new ReportsWriterThread(queue), "writer-" + i);
			allCollectionThread.add(writerThread);
			writerThread.start();

		}
	}

	static File[] loadReports(String inputPath)
	{
		File folder = new File(inputPath);
		if (folder.isDirectory())
		{
			File[] listOfFiles = folder.listFiles();
			return listOfFiles;
		}
		return null;
	}

	static void processFileSplitter()
	{

	}

	static void readReportsFile()
	{

	}

	public static boolean isReaderLive()
	{
		for (Thread thread : fileReaderThread)
		{
			if (thread.isAlive())
			{
				return true;
			}
		}
		return false;

	}
}
