package com.company;

/**
 * Created by Admin on 18.05.15.
 */
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
@RunWith(JUnit4.class)
public class cTestBron {

    public WebDriver d2;
    @Test
    public void ResurveTicket() {
        cBron.EnterFrom(d2, "Kyiv");
        cBron.EnterTo(d2, "Ivano-Frankivsk");
        cBron.EnterDate(d2);
        cBron.DoSearch(d2);
//        ViewResSearch(d2);
        cBron.PickResSearch(d2);
//        PlaceIsFree(d2);
//        TankNumberIs(d2);
//        PickPlace(d2);
//        CheckPrice(d2);
        String expRes = "043 К";
        Assert.assertEquals("Fail", expRes, cBron.PickResSearch(d2));
    }

    @Before
    public void start()
    {   //System.setProperty("webdriver.chrome.driver", "/home/yana/QAFactory/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        d2 = new ChromeDriver();
        d2.manage().window().maximize();
        d2.get("http://booking.uz.gov.ua/");
    }

    @After
    public void clean()
    {d2.quit();
    }
}
