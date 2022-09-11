package com.cydeoShorts.testNG;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class P01_TestNG_Intro {

    @Test (priority = 2) // Priority "2", less priority than priority "1".
    public void testOnePlusFive(){
        assertEquals(1+5,6);
        System.out.println("        testOnePlusFive is running");
    }

    @Test (priority = 1) // Higher priority
    public void testTenMinusFour(){
        assertEquals(10-4, 6);
        System.out.println("        testTenMinusFour is running");
    }

    @BeforeClass
    public void setup(){
        System.out.println("-------> BeforeClass is running\n");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("-------> AfterClass is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--->Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---After Method is running\n");
    }
}
