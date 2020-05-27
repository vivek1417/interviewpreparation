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
package com.apex.platform.datastructure.leastrecentlyused;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache
{
    static Deque<String> dq;

    static Map<String, String> cacheMap;

    static int cacheSize;

    LRUCache(int n)
    {
        dq = new LinkedList<String>();
        cacheMap = new LinkedHashMap<String, String>();
        cacheSize = n;
    }

    /**
     * Add a cache memory
     */
    public void insertCache(String value)
    {
        if (!cacheMap.containsKey(value))
        {
            if (dq.size() == cacheSize)
            {
                // String lastItem = dq.removeLast();
                cacheMap.remove(dq.removeLast());
            }
        }
        else
        {
            int index = 0, i = 0;
            for (String que : dq)
            {
                if (que.equals(value))
                {
                    index = i;
                    break;
                }
                i++;
            }
            dq.remove(value);

        }
        dq.push(value);
        cacheMap.put(value, value);
    }

    /**
     * Iterate the element from Queue
     */
    public static void display()
    {
        dq.forEach(System.out::println);
    }

    public static void main(String[] args)
    {
        LRUCache lruCache = new LRUCache(5);
        lruCache.insertCache("A");
        lruCache.insertCache("B");
        lruCache.insertCache("C");
        lruCache.insertCache("D");
        lruCache.insertCache("A");
        lruCache.insertCache("E");
        lruCache.insertCache("F");

        display();
    }

}
