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
package com.apex.platform.datastructure.dictionary;

import static java.util.stream.Collectors.joining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        //List<List<Integer>> queries = new ArrayList<>();
        int[][] queries = new int[q][2];

        /* IntStream.range(0, q).forEach(i -> {
            try
            {
                queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt).collect(toList()));
            }
            catch (IOException ex)
            {
                throw new RuntimeException(ex);
            }
        });
        */
        for (int i = 0; i < q; i++)
        {
            String[] query = bufferedReader.readLine().split(" ");
            queries[i][0] = Integer.parseInt(query[0]);
            queries[i][1] = Integer.parseInt(query[1]);
        }
        List<Integer> ans = freqQuery(queries);
        if (ans != null) System.out.println(ans.stream().map(Object::toString).collect(joining("\n")) + "\n");
        /*bufferedWriter.write(ans.stream().map(Object::toString).collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
        */
    }

    private static List<Integer> freqQuery(int[][] queries)
    {
        final Map<Integer, Integer> valueToFreq = new HashMap<Integer, Integer>();
        final Map<Integer, Integer> freqToOccurence = new HashMap<Integer, Integer>();
        final List<Integer> frequencies = new ArrayList<Integer>();
        System.out.println("Queries: " + Arrays.toString(queries));
        int key;
        int value;
        Integer oldFreq = null;
        Integer newFreq;
        Integer oldOccur = null;
        Integer newOccur;
        for (int[] query : queries)
        {
            key = query[0];
            value = query[1];
            if (key == 3)
            {
                if (value == 0)
                {
                    frequencies.add(1);
                }
                frequencies.add(freqToOccurence.get(value) == null ? 0 : 1);
            }
            else
            {
                oldFreq = valueToFreq.get(value);
                oldFreq = oldFreq == null ? 0 : oldFreq;
                oldOccur = freqToOccurence.get(oldFreq);
                oldOccur = oldOccur == null ? 0 : oldOccur;
            }
            if (key == 1)
            {
                newFreq = oldFreq + 1;
            }
            else
            {
                newFreq = oldFreq - 1;
            }
            newOccur = freqToOccurence.get(newFreq);
            newOccur = newOccur == null ? 0 : newOccur;
            if (newFreq < 1)
            {
                valueToFreq.remove(value);
            }
            else
            {
                valueToFreq.put(value, newFreq);
            }
            if ((oldOccur - 1) < 1)
            {
                freqToOccurence.remove(oldFreq);
            }
            else
            {
                freqToOccurence.put(oldFreq, oldOccur - 1);
            }
            freqToOccurence.put(newFreq, newOccur + 1);
        }

        return frequencies;
    }

}
