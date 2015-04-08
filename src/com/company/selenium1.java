package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.List;

/**
 * Created by Admin on 30.03.15.
 */

public class selenium1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/yana/QAFactory/chromedriver");

        WebDriver MyD = new ChromeDriver();
        MyD.manage().window().maximize();
        MyD.get("http://google.com");

        System.out.println(MyD.getTitle());
        WebElement search = MyD.findElement(By.name("q"));
        search.sendKeys("Selenium");
        search.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement res = MyD.findElement(By.id("rso"));
        WebElement first = res.findElement(By.tagName("a"));

        System.out.println(first.getText());

        List<WebElement> as = res.findElements(By.tagName("a"));

       // for (int i=0; i<as.size(); i++){ System.out.println(as.get(i));}

/*
        int j = 0;
        int els = as.size();
        while (j<els) {
            System.out.println(as.get(j).getText());
            System.out.println(as.get(j).getAttribute("href"));
            j++;
        }
*/


        search.clear();
        search.sendKeys("webdriver");


        MyD.quit();
    }

}
