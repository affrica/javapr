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

//    @Test
//    public void RightTranslate(){
//        cTranslatePage.InputText(d2, "tool");
//        cTranslatePage.DoTranslate(d2);
//        String expRes = "инструмент";
//        Assert.assertEquals("Fail", expRes, cTranslatePage.GetResult(d2));
//    }
//
//    @Test
//    public void AutoRightTranslate(){
//       // d2.get("https://translate.google.com/#en/ru");
//        cTranslatePage.InputText(d2, "country");
//        //cTranslatePage.DoTranslate(d2);
//        String expRes = "страна";
//        Assert.assertEquals("Fail", expRes, cTranslatePage.GetResult(d2));
//    }

// //div[contains(@class, 'jfk-button')]



    @Before
    public void start()
    {   //System.setProperty("webdriver.chrome.driver", "/home/yana/QAFactory/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        d2 = new ChromeDriver();
        d2.get("https://translate.google.com/#en/ru");
    }

    @After
    public void clean()
    {d2.quit();
    }
    //run test
    //java -classpath ";C:/Automation/selenium-2.44.0/*;C:/Automation/selenium-2.44.0/libs/*;C:/Automation/javapr/out/production/Code;" org.junit.runner.JUnitCore com.company.cTestTranslatePage
   //make build
   //javac -classpath ";C:/Automation/selenium-2.44.0/*;C:/Automation/selenium-2.44.0/libs/*;C:/Automation/javapr/out/production/Code;" -encoding utf8 -d "C:/Automation/javapr/out/production/Code" C:/Automation/javapr/src/com/company/*.java
}
