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
package com.apex.platform.lamdaexpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMerge
{

    public static void main(String[] args)
    {
        Map<String, List<Report>> mergedMAp = new HashMap<String, List<Report>>();
        Map<String, List<Report>> reportsMap = new HashMap<String, List<Report>>();
        Report report = new Report("456456", "Acquirer 4354 report");
        List<Report> reportList1 = new ArrayList<Report>();
        reportList1.add(report);
        reportsMap.put("apex_institution", reportList1);
        mergedMAp = mergeMap(reportsMap);
        Map<String, List<Report>> reportsMap1 = new HashMap<String, List<Report>>();
        Report report1 = new Report("des", "Acquirer Daily report");
        List<Report> reportList2 = new ArrayList<Report>();
        reportList2.add(report1);
        reportsMap1.put("apex_institution", reportList2);
        mergedMAp = mergeMap(reportsMap1);
        //Map<String, List<Report>> reportMapAll = mergeMap(reportsMap1)
        System.out.println("Size: " + mergedMAp.size());
        mergedMAp.forEach((k, v) -> {
            System.out.println("Key:: " + k + "     Value:: " + v.toString());
        });
    }

    private static Map<String, List<Report>> mergeMap(Map<String, List<Report>> reportsMap)
    {
        Map<String, List<Report>> reportsMapTwo = new HashMap<String, List<Report>>();
        String commonService = reportsMap.keySet().stream().findFirst().orElse(null);
        System.out.println("Common Service: " + commonService);
        if (reportsMapTwo.get(commonService) == null)
        {
            reportsMapTwo.put(commonService, reportsMap.get(commonService));
        }
        else
        {
            //Stream.concat(reportsMapTwo.get(commonService), reportsMap.get(commonService)).collect(Collectors.toList());
            reportsMapTwo.merge(commonService, reportsMap.get(commonService), (reportList1, reportList2) -> {
                return Stream.of(reportList1, reportList2).flatMap(x -> x.stream()).collect(Collectors.toList());

            });
        }
        return reportsMapTwo;
    }

}

class Report
{
    private String id;

    private String reportName;

    Report()
    {

    }

    /**
     * @param id
     * @param reportName
     */
    public Report(String id, String reportName)
    {
        super();
        this.id = id;
        this.reportName = reportName;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return the reportName
     */
    public String getReportName()
    {
        return reportName;
    }

    /**
     * @param reportName the reportName to set
     */
    public void setReportName(String reportName)
    {
        this.reportName = reportName;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, reportName);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Report other = (Report) obj;
        return Objects.equals(id, other.id) && Objects.equals(reportName, other.reportName);
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Report [id=");
        builder.append(id);
        builder.append(", reportName=");
        builder.append(reportName);
        builder.append("]");
        return builder.toString();
    }

}
