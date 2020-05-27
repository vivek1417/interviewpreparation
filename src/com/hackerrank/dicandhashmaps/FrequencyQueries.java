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
package com.hackerrank.dicandhashmaps;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyQueries
{
    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries)
    {
        System.out.println("Array Of object: " + queries.toString());
        for (List<Integer> list : queries)
        {
            System.out.println("list toString() " + list.toString());
        }
        return null;

    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
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

        List<Integer> ans = freqQuery(queries);

        // bufferedWriter.write(ans.stream().map(Object::toString).collect(joining("\n")) + "\n");
        System.out.println(ans.stream().map(Object::toString).collect(joining("\n")) + "\n");

        bufferedReader.close();
        //bufferedWriter.close();
    }

}
