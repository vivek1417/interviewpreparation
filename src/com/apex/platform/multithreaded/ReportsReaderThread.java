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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class ReportsReaderThread implements Runnable
{
	// protected BlockingQueue<StringBuffer> blockingQueue = null;

	protected ConcurrentHashMap<String, StringBuffer> concurrentHashMap = new ConcurrentHashMap<String, StringBuffer>();

	private File[] files = null;

	protected ArrayBlockingQueue<StringBuffer> queue = null;

	private File file = null;

	private Map<String, StringBuffer> institutionList = new ConcurrentHashMap<String, StringBuffer>();

	ReportsReaderThread(ConcurrentHashMap<String, StringBuffer> concurrentHashMap, File[] files)
	{
		this.concurrentHashMap = concurrentHashMap;
		this.files = files;
	}

	ReportsReaderThread(ArrayBlockingQueue<StringBuffer> blockingQueue, File file)
	{
		this.queue = blockingQueue;
		this.file = file;
	}

	@Override
	public void run()
	{
		readAndStoreBlockingQueue();
		//storeIntoConcurrentHashmap();
	}

	private void readAndStoreBlockingQueue()
	{
		BufferedReader br = null;
		int fileCounter = 0;
		try
		{

			if (file.isFile() && file.getName().endsWith(".txt"))
			{
				System.out.println(file.getName());
				br = new BufferedReader(new FileReader(file));
				String buffer = null;
				//int lineNumber = 0;
				int institutionIdMissing = 0;
				String destinationFile = "";
				while ((buffer = br.readLine()) != null)
				{
					//lineNumber++;
					//System.out.println("Line Number : " + lineNumber);
					//System.out.println("Line: " + buffer);
					if (!buffer.isEmpty() && buffer.substring(0, 1).equals("1"))
					{
						//System.out.println(" Dest : " + buffer.substring(82, 92));
						destinationFile = buffer.substring(82, 92);
						//System.out.println("Destination File : " + destinationFile);
						if (!destinationFile.isEmpty() && destinationFile.matches("[0-9]+"))
						{
							if (institutionList.containsKey(destinationFile))
							{
								queue.put(institutionList.get(destinationFile).append(buffer).append("\n"));

							}
							else
							{
								queue.add(new StringBuffer().append(buffer).append("\n"));
								fileCounter++;
								institutionList.put(destinationFile, new StringBuffer().append(buffer).append("\n"));

							}
						}
						else
						{

							final String pageNo = buffer.substring(buffer.length() - 1, buffer.length());
							if (!pageNo.isEmpty() && pageNo.equals("1"))
							{
								institutionIdMissing = institutionIdMissing + 1;
								destinationFile = "Institution_" + institutionIdMissing;
								queue.put(new StringBuffer().append(buffer).append("\n"));
								institutionList.put(destinationFile, new StringBuffer().append(buffer).append("\n"));
								fileCounter++;
							}
							else
							{
								destinationFile = "Institution_" + institutionIdMissing;
								queue.put(institutionList.get(destinationFile).append(buffer).append("\n"));
							}

						}
					}
					else
					{
						//System.out.println("else Queue:: " + queue.toString() + " INSTITUTION ID : "
						//	+ institutionList.get(destinationFile));
						queue.add(institutionList.get(destinationFile).append(buffer).append("\n"));
					}
				}
				//queue.put(e);
			}

			System.out.println("Current Thread Name = " + Thread.currentThread().getName());
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally
		{
			System.out.println("Total Split Files: " + fileCounter);
			//System.out.println("ConcurrentMap Size() " + concurrentHashMap.size() + "splitted file : "
			//		+ concurrentHashMap.get("1999999992"));
			try
			{
				if (br != null) br.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void storeIntoConcurrentHashmap()
	{
		BufferedReader br = null;
		int fileCounter = 0;
		try
		{
			for (int i = 0; i < files.length; i++)
			{
				if (files[i].isFile() && files[i].getName().endsWith(".txt"))
				{
					br = new BufferedReader(new FileReader(files[i]));
					String buffer = null;
					//int lineNumber = 0;
					int institutionIdMissing = 0;
					String destinationFile = "";
					while ((buffer = br.readLine()) != null)
					{
						//lineNumber++;
						//System.out.println("Line Number : " + lineNumber);
						//System.out.println("Line: " + buffer);
						if (!buffer.isEmpty() && buffer.substring(0, 1).equals("1"))
						{
							//System.out.println(" Dest : " + buffer.substring(82, 92));
							destinationFile = buffer.substring(82, 92);
							//System.out.println("Destination File : " + destinationFile);
							if (!destinationFile.isEmpty() && destinationFile.matches("[0-9]+"))
							{
								if (concurrentHashMap.containsKey(destinationFile))
								{
									concurrentHashMap.get(destinationFile).append(buffer).append("\n");

								}
								else
								{
									concurrentHashMap.put(destinationFile,
											new StringBuffer().append(buffer).append("\n"));
									fileCounter++;

								}
							}
							else
							{

								final String pageNo = buffer.substring(buffer.length() - 1, buffer.length());
								if (!pageNo.isEmpty() && pageNo.equals("1"))
								{
									institutionIdMissing = institutionIdMissing + 1;
									destinationFile = "Institution_" + institutionIdMissing;
									concurrentHashMap.put(destinationFile,
											new StringBuffer().append(buffer).append("\n"));
									fileCounter++;
								}
								else
								{
									destinationFile = "Institution_" + institutionIdMissing;
									concurrentHashMap.get(destinationFile).append(buffer).append("\n");
								}

							}
						}
						else
						{
							concurrentHashMap.get(destinationFile).append(buffer).append("\n");
						}
					}
				}
			}
			System.out.println("Current THread Name = " + Thread.currentThread().getName());
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally
		{
			System.out.println("Total Split Files: " + fileCounter);
			//System.out.println("ConcurrentMap Size() " + concurrentHashMap.size() + "splitted file : "
			//		+ concurrentHashMap.get("1999999992"));
			try
			{
				br.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
