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
package interviewpreparation.externalscript;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class LoadJavascript
{

    public static void main(String[] args) throws ScriptException, IOException, NoSuchMethodException
    {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        //read script file
        engine.eval(Files.newBufferedReader(Paths.get(
                "D:\\Apex\\workspace_new\\interviewpreparation\\src\\interviewpreparation\\externalscript\\index.js"),
                StandardCharsets.UTF_8));
        Invocable inv = (Invocable) engine;
        System.out.println(inv.invokeFunction("loadData", 24));
        Person obj = (Person) inv.invokeFunction("getEmployee", new Person());
        System.out.println(obj.getAge());

    }

    static class Person
    {
        private String firstName;

        private String lastName;

        private int age;

        private String eyeColor;

        /**
         * @return the firstName
         */
        public String getFirstName()
        {
            return firstName;
        }

        /**
         * @param firstName the firstName to set
         */
        public void setFirstName(String firstName)
        {
            this.firstName = firstName;
        }

        /**
         * @return the lastName
         */
        public String getLastName()
        {
            return lastName;
        }

        /**
         * @param lastName the lastName to set
         */
        public void setLastName(String lastName)
        {
            this.lastName = lastName;
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

        /**
         * @return the eyeColor
         */
        public String getEyeColor()
        {
            return eyeColor;
        }

        /**
         * @param eyeColor the eyeColor to set
         */
        public void setEyeColor(String eyeColor)
        {
            this.eyeColor = eyeColor;
        }

    }
}
