package com.cydeoShorts.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class P02_Hard_Soft_Assertions {

/*HARD Assertion: If any line has fail, hard assertion will stop.

SOFT Assertion: Even if any line has faiş, soft assertion will continue to execute.*/


    @Test
    public void hardAssertion(){
        Assert.assertEquals("apple", "app"); //--> fail, next line "won't" be executed
        System.out.println("hard assertion test");
        assertTrue("orange".equals("oranger"));
        System.out.println("hard assertion test 2");
    }


    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple", "app");//--> fail, next line "will" be executed
        System.out.println("soft assertion test");
        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("soft assertion test 2");
    }


}
