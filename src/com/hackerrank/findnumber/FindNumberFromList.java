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
package com.hackerrank.findnumber;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.IntStream;

class Result
{

    /*
     * Complete the 'findNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */

    public static String findNumber(List<Integer> arr, int k)
    {
        // Write your code here
        System.out.println("list of Values: " + arr.toString());
        String out = "NO";
        for (Integer integer : arr)
        {
            System.out.println(" i=" + integer.intValue() + " cond: " + (integer.intValue() == k));
            if (integer.intValue() == k)
            {
                out = "YES";
            }
            //return (integer.intValue() == k) ? "YES" : "NO";
        }
        return out;
    }

}

public class FindNumberFromList
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(new OutputStream()
        {

            @Override
            public void write(int b) throws IOException
            {
                // TODO Auto-generated method stub

            }
        }));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try
            {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            }
            catch (IOException ex)
            {
                throw new RuntimeException(ex);
            }
        }).map(String::trim).map(Integer::parseInt).collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.findNumber(arr, k);
        System.out.println("Result: " + result);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
