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
package com.apex.platform.sortingmechanism;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CustomMap
{

    public static void main(String[] args)
    {
        Map<Integer, String> cutomMap = new HashMap<Integer, String>();
        cutomMap.remove(5);
        cutomMap.forEach((id, emp) -> {
            System.out.println("");
        });
        for (Entry<Integer, String> entry : cutomMap.entrySet())
        {

        }
    }

    public static class Employee
    {
        private String name;

        private Integer id;

        private double salary;

        private String designation;

        private String insuranceScheme;

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
         * @return the id
         */
        public Integer getId()
        {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(Integer id)
        {
            this.id = id;
        }

        /**
         * @return the salary
         */
        public double getSalary()
        {
            return salary;
        }

        /**
         * @param salary the salary to set
         */
        public void setSalary(double salary)
        {
            this.salary = salary;
        }

        /**
         * @return the designation
         */
        public String getDesignation()
        {
            return designation;
        }

        /**
         * @param designation the designation to set
         */
        public void setDesignation(String designation)
        {
            this.designation = designation;
        }

        /**
         * @return the insuranceScheme
         */
        public String getInsuranceScheme()
        {
            return insuranceScheme;
        }

        /**
         * @param insuranceScheme the insuranceScheme to set
         */
        public void setInsuranceScheme(String insuranceScheme)
        {
            this.insuranceScheme = insuranceScheme;
        }

        @Override
        public String toString()
        {
            StringBuilder builder = new StringBuilder();
            builder.append("Name: ");
            builder.append(name);
            builder.append(" Id:");
            builder.append(id);
            builder.append(" Salary:");
            builder.append(salary);
            builder.append(" Designation:");
            builder.append(designation);
            builder.append(" InsuranceScheme:");
            builder.append(insuranceScheme);
            builder.append(" ");
            return builder.toString();
        }

    }

}
