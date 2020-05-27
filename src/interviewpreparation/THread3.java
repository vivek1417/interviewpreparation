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
package interviewpreparation;

public class THread3 implements Runnable
{

    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        System.out.println("Running");

    }

    public static void main(String[] args)
    {
        Thread t = new Thread(new THread3());
        t.run();
        t.run();
        t.start();

        int[] x[] =
        {
                {
                        1, 2
                },
                {
                        3, 4, 5
                },
                {
                        6, 7, 8, 9
                }
        };
        int[][] y = x;
        System.out.println(y[2][1]);

        String s = "4.5x4.a.3";
        String[] tokens = s.split("\\s");
        for (String o : tokens)
            System.out.print(o + "");
        System.out.print(" ");
        tokens = s.split("\\..");
        for (String o : tokens)
            System.out.print(o + " ");
    }

}
