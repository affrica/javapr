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

//    @Test
//    public void Case1(){
//        Assert.fail();
//    }

//    @Test
//    public void Case2(){
//     int a=10;
//     int b=5;
//     int expRes = 15;
//     //   Assert.assertEquals("Expected result didn't matched", expRes, a + b);
//     Assert.assertTrue(expRes == (a+b));
//    }

    @Test
    public void Case1(){
        String expRes = "MF5H1jbINbhVt@1a";
        setMaster(d2, "753753");
        setSite(d2, "753@mail.ru");
        Assert.assertEquals("Fail", expRes, gen(d2));
    }

    @Test //200 symbl
    public void Case4(){
        String expRes = "oicbk8Po/8uf+@1a";
        setMaster(d2, "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        setSite(d2, "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        Assert.assertEquals("200 symbl: ", expRes, gen(d2));
        //Assert.assertTrue(expRes == (a+b));
    }
    @Test // Button = Generate
    public void Case5(){
        String expRes = "Generate";
        Assert.assertEquals("Button = Generate: ", expRes, getTitle(d2));
    }

    @Test // Master = Empty
    public void Case6(){
        String expRes = "vHq7i9X9HbVCi@1a";
        setMaster(d2, "");
        setSite(d2, "753@mail.ru");
        Assert.assertEquals("Fail", expRes, gen(d2));
    }

    @Test // Site = Empty
    public void Case7(){
        String expRes = "2lZC8H2FufoUL@1a";
        setMaster(d2, "753753");
        setSite(d2, "");
        Assert.assertEquals("Fail", expRes, gen(d2));
    }

    @Test // clear Master
    public void Case8(){
        setMaster(d2, "753753");
        setSite(d2, "753@mail.ru");
        gen(d2);
        Assert.assertEquals("Fail", false, emptyMaster(d2));
    }

    @Test // clear Site
    public void Case9(){
        setMaster(d2, "753753");
        setSite(d2, "753@mail.ru");
        gen(d2);
        Assert.assertEquals("Fail", false, emptySite(d2));
    }

    public String gen(WebDriver d2) {
        WebElement psite = d2.findElement(By.name("site"));
        psite.sendKeys(Keys.ENTER);
        WebElement res = d2.findElement(By.name("password"));
        return res.getAttribute("value");
    }

    public boolean emptyMaster(WebDriver d2){
        WebElement pmaster = d2.findElement(By.name("master"));
        return pmaster.getAttribute("value").isEmpty();
    }

    public boolean emptySite(WebDriver d2){
        WebElement pmaster = d2.findElement(By.name("site"));
        return pmaster.getAttribute("value").isEmpty();
    }

    public void setMaster(WebDriver d2, String s1){
        WebElement pmaster = d2.findElement(By.name("master"));
        pmaster.sendKeys(s1);
    }

    public void setSite(WebDriver d2, String s2){
        WebElement psite = d2.findElement(By.name("site"));
        psite.sendKeys(s2);
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
        //d2.manage().window().maximize();
        //d2.get("http://angel.net/~nic/passwd.current.html");
        //d2.get("http://oxogamestudio.com/passwd.current2.htm");
        d2.get("http://oxogamestudio.com/passwd.current3.htm");
    }

    @After
    public void clean()
    {d2.quit();
    }
}
