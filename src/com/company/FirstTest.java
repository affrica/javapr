package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Admin on 08.04.15.
 */
@RunWith(JUnit4.class)
public class FirstTest {

    public WebDriver d2;

    @Test
    public void Case1(){
        Assert.fail();
    }

    @Test
    public void Case2(){
     int a=10;
     int b=5;
     int expRes = 15;
     //   Assert.assertEquals("Expected result didn't matched", expRes, a + b);
     Assert.assertTrue(expRes == (a+b));
    }

    @Test
    public void Case3(){
        String expRes = "MF5H1jbINbhVt@1a";
        Assert.assertEquals("As expected: ", expRes, gen(d2, "753753", "753@mail.ru"));
        //Assert.assertTrue(expRes == (a+b));
    }

    @Test //200 symbl
    public void Case4(){
        String expRes = "oicbk8Po/8uf+@1a";
        Assert.assertEquals("200 symbl: ", expRes, gen(d2, "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"));
        //Assert.assertTrue(expRes == (a+b));
    }
    @Test // Button = Generate
    public void Case5(){
        String expRes = "Generate";
        Assert.assertEquals("Button = Generate: ", expRes, getTitle(d2));
        //Assert.assertTrue(expRes == (a+b));
    }

    @Test // Master = Empty
    public void Case6(){
        String expRes = "Generate";
        Assert.assertEquals("Button = Generate: ", expRes, getTitle(d2));
        //Assert.assertTrue(expRes == (a+b));
    }

    @Test // Site = Empty
    public void Case7(){
        String expRes = "Generate";
        Assert.assertEquals("Button = Generate: ", expRes, getTitle(d2));
        //Assert.assertTrue(expRes == (a+b));
    }

    public String gen(WebDriver d2, String s1, String s2) {
        WebElement pmaster = d2.findElement(By.name("master"));
        pmaster.sendKeys(s1);
        WebElement psite = d2.findElement(By.name("site"));
        psite.sendKeys(s2);
        psite.sendKeys(Keys.ENTER);
        WebElement res = d2.findElement(By.name("password"));
        return res.getAttribute("value");
    }

    public String getTitle(WebDriver d2) {
        List<WebElement> inputList = d2.findElements(By.tagName("input"));
        WebElement res = inputList.get(2);
        return res.getAttribute("value");
    }

    @Before
    public void start()
    {   System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        d2 = new ChromeDriver();
        d2.manage().window().maximize();
        d2.get("http://angel.net/~nic/passwd.current.html");
    }

    @After
    public void clean()
    {d2.quit();
    }
}
