package com.rupak.docker;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by rupak on 11/24/18.
 */

/**
 * unit test for simple app
 */
public class AppTest  extends TestCase{


    /**
     * create the test case
     * @param testName testName name of the test case
     */
    public AppTest(String testName){
        super(testName);
    }

    /**
     * @return the suite of tests being tested.
     */
    public static Test suite(){
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        assertTrue(true);
    }
}
