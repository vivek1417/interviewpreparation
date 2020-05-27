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
package interviewpreparation.designpatterns;

/**
 *
 * @author E5285484
 *
 */
public class Singleton
{
    /**
     * Variable will be providing an access of lazy loading which can able created an object while invoking {@code getInstance()}}
     */
    private static volatile Singleton instance;

    private Singleton()
    {

    }

    /**
     * Global Access point for this instance
     * @return
     */
    public static Singleton getInstance()
    {
        synchronized (Singleton.class)
        {
            if (instance == null)
            {
                instance = new Singleton();
            }
        }

        return instance;

    }

    public void doSomething()
    {
        System.out.println("this instance has accessed within an application!");
    }

    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();
    }

}
