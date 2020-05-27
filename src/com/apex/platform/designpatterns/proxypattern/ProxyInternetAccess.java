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

public class ProxyInternetAccess implements OfficeInternetAccess
{
    private String employeeName;

    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess()
    {

    }

    public ProxyInternetAccess(String employeeName)
    {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess()
    {

        if (getRole(employeeName) > 4)
        {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }
        else
        {
            System.out.println("No Internet Access granted. You Job level is below 5");
        }

    }

    private int getRole(String employeeName)
    {
        int role;
        switch (employeeName)
        {
            case "Vithya":
                role = 1;
                break;
            case "Niranjan":
                role = 9;
                break;
            case "Vaishnavi":
                role = 10;
            default:
                role = 1;
                break;
        }
        return role;
    }
}
