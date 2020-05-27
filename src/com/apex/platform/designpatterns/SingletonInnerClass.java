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
package com.apex.platform.designpatterns;

/**
 * This is best approach for singleton which can use any where
 * @author E5285484
 *
 */
public class SingletonInnerClass
{
    private SingletonInnerClass()
    {

    }

    private static class SingletonLoadInnerClass
    {
        static final SingletonInnerClass instance = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance()
    {
        return SingletonLoadInnerClass.instance;
    }
}
