////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2003
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.uncommentedmain;

class oneMoreClass {
    
    public static void anyWrongMethodName(String[] args)
    {
        System.identityHashCode("InputUncommentedMain.main()");
    }
}