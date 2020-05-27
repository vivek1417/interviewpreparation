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
package interviewpreparation;

import java.util.Optional;

public class IntegerVal
{

    public static void main(String[] args)
    {
        Integer i = 420;
        Integer i2;
        Integer i3;
        i2 = i.intValue();
        i3 = i.valueOf(420);
        System.out.println((i == i2) + " " + (i == i3));

        Optional<String> name = Optional.of("Student");
        name = Optional.ofNullable(null);
        System.out.println(name.isPresent());
        System.out.println(name.orElseGet(() -> "none"));
        System.out.println(name.map(x -> "Hello" + x + "!").orElse("Stranger"));

    }

}
