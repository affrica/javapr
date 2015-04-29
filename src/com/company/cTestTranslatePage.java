package com.company;

/**
 * Created by Admin on 29.04.15.
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class cTestTranslatePage {

    public WebDriver d2;

    @Test
    public void EmptyFields(){
        cTranslatePage.DoTranslate(d2);
        String expRes = "";
        Assert.assertEquals("Fail", expRes, cTranslatePage.GetResult(d2));
    }

    public void RightTranslate(){
        cTranslatePage.InputText(String it);
        cTranslatePage.DoTranslate(d2);
        String expRes = "tool";
        Assert.assertEquals("Fail", expRes, cTranslatePage.GetResult(d2));
    }
    @Before
    public void start()
    {   //System.setProperty("webdriver.chrome.driver", "/home/yana/QAFactory/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
        d2 = new ChromeDriver();
        d2.get("https://translate.google.com");
    }

    @After
    public void clean()
    {d2.quit();
    }
}
