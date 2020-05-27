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
package interviewpreparation.immutable;

public final class EmployeeImmutable
{
    /**
     * No arguments Constructor
     */

    public EmployeeImmutable()
    {

    }

    /**
     * Parameterized constructor
     * @param empId
     * @param age
     * @param empName
     */
    public EmployeeImmutable(String empId, String age, String empName)
    {

    }

    public Employee getEmployeeDetails()
    {
        return null;

    }

    static class Employee
    {
        private String empId;

        private String empName;

        private int age;

        public Employee()
        {

        }

        public Employee(String empId, String emName, int age)
        {
            this.age = age;
            this.empId = empId;
            this.empName = emName;
        }

        /**
         * @return the empId
         */
        public String getEmpId()
        {
            return empId;
        }

        /**
         * @return the empName
         */
        public String getEmpName()
        {
            return empName;
        }

        /**
         * @return the age
         */
        public int getAge()
        {
            return age;
        }

    }
}
