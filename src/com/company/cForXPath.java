package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Admin on 20.04.15.
 */
public class cForXPath {

    public WebDriver d2;

    @Test
    public void Case1(){
        String expRes = "MF5H1jbINbhVt@1a";
        cGenPassPage.setMaster(d2, "753753");
        cGenPassPage.setSite(d2, "753@mail.ru");
        Assert.assertEquals("Fail", expRes, cGenPassPage.gen(d2));
    }

    @Test // Title Button = Generate
    public void Case3(){
        String expRes = "Site name";
        Assert.assertEquals("Lable = Site name: ", expRes, cGenPassPage.getSiteLable(d2));
    }

//
//    public String gen(WebDriver d2) {
//        WebElement psite = d2.findElement(By.xpath("//table//td[text()='Site name']/following::input[1]"));
//        psite.sendKeys(Keys.ENTER);
//        WebElement res = d2.findElement(By.xpath("//table//td[text()='Generated password']/following::input[1]"));
//        return res.getAttribute("value");
//    }
//
//    // Enable meth
//    public boolean enableMaster(WebDriver d2){
//        WebElement pmaster = d2.findElement(By.xpath("//table//input[@type='password']"));
//        return pmaster.isEnabled();
//    }
//
//    public boolean enableSite(WebDriver d2){
//        WebElement pmaster = d2.findElement(By.xpath("//table//td[text()='Site name']/following::input[1]"));
//        return pmaster.isEnabled();
//    }
//
//    public boolean enablePwd(WebDriver d2){
//        WebElement ppwd = d2.findElement(By.xpath("//table//td[text()='Generated password']/following::input[1]"));
//        return ppwd.isEnabled();
//    }
//
//    //Empty meth
//    public boolean emptyMaster(WebDriver d2){
//        WebElement pmaster = d2.findElement(By.xpath("//table//input[@type='password']"));
//        return pmaster.getAttribute("value").isEmpty();
//    }
//
//    public boolean emptySite(WebDriver d2){
//        WebElement pmaster = d2.findElement(By.xpath("//table//td[text()='Site name']/following::input[1]"));
//        return pmaster.getAttribute("value").isEmpty();
//    }
//
//    //Set meth
//    public void setMaster(WebDriver d2, String s1){
//        WebElement pmaster = d2.findElement(By.xpath("//table//input[@type='password']"));
//        pmaster.sendKeys(s1);
//    }
//
//    public void setSite(WebDriver d2, String s2){
//        WebElement psite = d2.findElement(By.xpath("//table//td[text()='Site name']/following::input[1]"));
//        psite.sendKeys(s2);
//    }
//
//    public String getTitle(WebDriver d2) {
//        WebElement res = d2.findElement(By.xpath("//input[@type='submit'][1]"));
//        return res.getAttribute("value");
//    }
//
//    public String getSiteLable(WebDriver d2) {
//        WebElement res = d2.findElement(By.xpath("//input[@name='site']/../../td[1]"));
//        return res.getText();
//    }

    @Before
    public void start()
    {   //System.setProperty("webdriver.chrome.driver", "/home/yana/QAFactory/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
        d2 = new ChromeDriver();
        //d2.manage().window().maximize();
        //d2.get("http://angel.net/~nic/passwd.current.html");
        //d2.get("http://oxogamestudio.com/passwd.current2.htm");
        //d2.get("http://oxogamestudio.com/passwd.current5.htm");
        d2.get("http://oxogamestudio.com/passwd.current2.htm");

    }

    @After
    public void clean()
    {d2.quit();
    }
}
