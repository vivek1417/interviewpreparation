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
package com.apex.platform.designpatterns.proxypattern;

public class RealInternetAccess implements OfficeInternetAccess
{
    private String employeeName;

    public RealInternetAccess()
    {

    }

    RealInternetAccess(String empName)
    {
        this.employeeName = empName;
    }

    @Override
    public void grantInternetAccess()
    {
        System.out.println(String.format("Internet Access granted for %s employee", employeeName));
    }

}
