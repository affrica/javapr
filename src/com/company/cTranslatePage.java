package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Admin on 29.04.15.
 */
public class cTranslatePage {

    public static void DoTranslate(WebDriver d2) {
        WebElement trslt = d2.findElement(By.xpath("//input[@type='submit']"));
        trslt.sendKeys(Keys.ENTER);
    }
    public static String GetResult(WebDriver d2) {
        WebElement res = d2.findElement(By.xpath("//span[@id='result_box']"));
        return res.getText();
    }
}
