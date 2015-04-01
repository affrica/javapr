package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 30.03.15.
 */

public class silenium1 {

    public static void main(String[] args) {

  //System.setProperty("webdriver.chrome.driver", "/home/yana/QAFactory/chromedriver.exe");

        WebDriver MyD = new ChromeDriver();
        MyD.manage().window().maximize();
        MyD.get("http://newshub.org");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyD.quit();
    }

}
