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
import java.util.List;
import java.util.Objects;

public class DistinctAndSortMain
{

    public static void main(String[] args)
    {
        List<String> li = new ArrayList<String>();
        li.add("Vivek");
        li.add("Ram");
        li.add("Vivek");
        li.add("Anbu");
        li.stream().distinct().sorted().forEach(val -> System.out.println(val));

        List<Emp> sara = new ArrayList<DistinctAndSortMain.Emp>();
        sara.add(new Emp("Ram", "45656756"));
        sara.add(new Emp("Arun", "56456547"));
        sara.add(new Emp("Yashwanth", "5675"));
        /*sara.stream().distinct().sorted(Comparator.comparing(DistinctAndSortMain.Emp))
        		.forEach(emp -> System.out.println(emp.getEmpName()));*/

    }

    static class Emp
    {
        private String empName;

        private String empSalary;

        public Emp()
        {

        }

        public Emp(String empName, String empSalary)
        {
            super();
            this.empName = empName;
            this.empSalary = empSalary;
        }

        /**
         * @return the empName
         */
        public String getEmpName()
        {
            return empName;
        }

        /**
         * @param empName the empName to set
         */
        public void setEmpName(String empName)
        {
            this.empName = empName;
        }

        /**
         * @return the empSalary
         */
        public String getEmpSalary()
        {
            return empSalary;
        }

        /**
         * @param empSalary the empSalary to set
         */
        public void setEmpSalary(String empSalary)
        {
            this.empSalary = empSalary;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(empName, empSalary);
        }

        @Override
        public boolean equals(Object obj)
        {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
            Emp other = (Emp) obj;
            return Objects.equals(empName, other.empName) && Objects.equals(empSalary, other.empSalary);
        }

        @Override
        public String toString()
        {
            // TODO Auto-generated method stub
            return super.toString();
        }
    }
}
