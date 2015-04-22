package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Admin on 22.04.15.
 */
public class cGenPassPage {

    public static String gen(WebDriver d2) {
        WebElement psite = d2.findElement(By.xpath("//table//td[text()='Site name']/following::input[1]"));
        psite.sendKeys(Keys.ENTER);
        WebElement res = d2.findElement(By.xpath("//table//td[text()='Generated password']/following::input[1]"));
        return res.getAttribute("value");
    }

    // Enable meth
    public static boolean enableMaster(WebDriver d2){
        WebElement pmaster = d2.findElement(By.xpath("//table//input[@type='password']"));
        return pmaster.isEnabled();
    }

    public static boolean enableSite(WebDriver d2){
        WebElement pmaster = d2.findElement(By.xpath("//table//td[text()='Site name']/following::input[1]"));
        return pmaster.isEnabled();
    }

    public static boolean enablePwd(WebDriver d2){
        WebElement ppwd = d2.findElement(By.xpath("//table//td[text()='Generated password']/following::input[1]"));
        return ppwd.isEnabled();
    }

    //Empty meth
    public static boolean emptyMaster(WebDriver d2){
        WebElement pmaster = d2.findElement(By.xpath("//table//input[@type='password']"));
        return pmaster.getAttribute("value").isEmpty();
    }

    public static boolean emptySite(WebDriver d2){
        WebElement pmaster = d2.findElement(By.xpath("//table//td[text()='Site name']/following::input[1]"));
        return pmaster.getAttribute("value").isEmpty();
    }

    //Set meth
    public static void setMaster(WebDriver d2, String s1){
        WebElement pmaster = d2.findElement(By.xpath("//table//input[@type='password']"));
        pmaster.sendKeys(s1);
    }

    public static void setSite(WebDriver d2, String s2){
        WebElement psite = d2.findElement(By.xpath("//table//td[text()='Site name']/following::input[1]"));
        psite.sendKeys(s2);
    }

    public static String getTitle(WebDriver d2) {
        WebElement res = d2.findElement(By.xpath("//input[@type='submit'][1]"));
        return res.getAttribute("value");
    }

    public static String getSiteLable(WebDriver d2) {
        WebElement res = d2.findElement(By.xpath("//input[@name='site']/../../td[1]"));
        return res.getText();
    }

}
