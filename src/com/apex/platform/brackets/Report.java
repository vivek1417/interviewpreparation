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
package com.apex.platform.brackets;

public class Report
{
    public static void main(String[] args)
    {
        System.out.println(ReportFrequency.valueOf("MLY").getFreq());
        System.out.println(ReportFrequency.valueOf("MQLY").getFreq());
        System.out.println(ReportFrequency.MQLY.getFreq());
        System.out.println(ReportFrequency.getFrequency("YLYY"));
    }

}

enum ReportFrequency
{
    MLY("M"),

    DLY("D"),

    YLY("Y"),

    WLY("W"),

    QLY("Q"),

    MQLY("M");

    private final String freq;

    ReportFrequency(String freq)
    {
        this.freq = freq;
    }

    public String getFreq()
    {
        return freq;
    }

    public static String getFrequency(String key)
    {
        // String reportFreq = null;

        /*  if ()
          {
              return ReportFrequency.valueOf(key).getFreq();
          }
          else
          9
          {
              return ReportFrequency.DLY.getFreq();
          }*/

        /* return ReportFrequency.valueOf(key) != null ? ReportFrequency.valueOf(key).getFreq()
                : ReportFrequency.DLY.getFreq();*/
        return ReportFrequency.DLY.getFreq();
    }
}
