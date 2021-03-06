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
package interviewpreparation.designpatterns.statepattern;

public class StatePattern extends SubState
{

    public static void main(String[] args)
    {
        SubState subState = new StatePattern();
        subState.currentState();

    }

    @Override
    public void currentState()
    {
        System.out.println("State' state pattern");
    }

}
