package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Admin on 08.04.15.
 */
@RunWith(JUnit4.class)
public class FirstTest {

    @Test
    public void Case1(){
        Assert.fail();
    }

    @Test
    public void Case2(){
     int a=10;
     int b=5;
     int expRes = 15;
        Assert.assertEquals(expRes, a+b);
    }

}
