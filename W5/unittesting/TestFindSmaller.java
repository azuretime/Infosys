package com.example;

/**
 * Created by jit_biswas on 10/8/2017.
 */
import junit.framework.*;
import junit.framework.Test;

import org.junit.*;

public class TestFindSmaller extends TestCase {

    // constructor
    public TestFindSmaller (String name) {
        super(name);
    }

    @org.junit.Test
    public void testFindingSmaller () {
         // Insert your code here
        FindSmaller f = new FindSmaller();
        int[] a = {1,2,7,6,2};
        assertEquals("Failed Assertion for FindSmaller", 3, f.findSmaller(4,a));
        assertEquals("Failed Assertion for FindSmaller", 5, f.findSmaller(8,a));
        assertEquals("Failed Assertion for FindSmaller", 0, f.findSmaller(-1,a));
/*If there is an error, something like the following will appear
        junit.framework.AssertionFailedError: Failed Assertion for FindSmaller
        Expected :3
        Actual   :4*/
    }

    // method create a test suite
    public static Test suite() {
        return new TestSuite(TestFindSmaller.class);
    }

    // the main method
    public static void main(String args[]) {
        junit.textui.TestRunner.run(suite());
    }
}

