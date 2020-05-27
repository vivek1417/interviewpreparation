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
package interviewpreparation.java8.streams;

public class PredicteExample
{

    public static void main(String[] args)
    {

    }

    static class Sample
    {
        private String name;

        private int age;

        /**
         * @param name
         * @param age
         */
        public Sample(String name, int age)
        {
            super();
            this.name = name;
            this.age = age;
        }

        /**
         * @return the name
         */
        public String getName()
        {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name)
        {
            this.name = name;
        }

        /**
         * @return the age
         */
        public int getAge()
        {
            return age;
        }

        /**
         * @param age the age to set
         */
        public void setAge(int age)
        {
            this.age = age;
        }

    }
}
