package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Admin on 06.04.15.
 */
public class Selenium2 {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

        WebDriver d2 = new ChromeDriver();
        d2.manage().window().maximize();
        d2.get("http://angel.net/~nic/passwd.current.html");

        System.out.println( "from method  " + (showPwd(d2, "753753", "753@mail.ru")));
        d2.quit();
    }




public static String showPwd(WebDriver d2, String s1, String s2) {
            WebElement pmaster = d2.findElement(By.name("master"));
            pmaster.sendKeys(s1);
            WebElement psite = d2.findElement(By.name("site"));
            psite.sendKeys(s2);
            psite.sendKeys(Keys.ENTER);
            WebElement res = d2.findElement(By.name("password"));
            return res.getAttribute("value");
}

}
