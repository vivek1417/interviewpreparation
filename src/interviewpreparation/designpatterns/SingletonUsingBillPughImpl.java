/*
 * ==============================================================================
 * (c) 2019, 2020
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
package interviewpreparation.designpatterns;

/**
 * Create a single instance using Bill Pugh implementation
 * @author E5285484
 *
 */
public class SingletonUsingBillPughImpl
{
    private SingletonUsingBillPughImpl()
    {

    }

    /**
     * static inner class will be invoking while calling getInstance()
     *
     * If use this inner class, no need to use synchronized
     *
     * looks like eager instantiation but loads as lazy
     *
     */
    private static class SingletonHelper
    {
        private static final SingletonUsingBillPughImpl SINGLETON_USING_BILL_PUGH_IMPL = new SingletonUsingBillPughImpl();
    }

    public static SingletonUsingBillPughImpl getInstance()
    {
        return SingletonHelper.SINGLETON_USING_BILL_PUGH_IMPL;
    }

    public static void main(String[] ars)
    {
        System.out.println("Singleton hashcode: " + SingletonUsingBillPughImpl.getInstance().hashCode());
    }

}
