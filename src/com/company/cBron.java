package com.company;

/**
 * Created by Admin on 18.05.15.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cBron {
    public static void EnterFrom(WebDriver d2, String s) {
        WebElement w = d2.findElement(By.xpath("//div[@id='station_from']//div[@title='"+s+"']"));
        w.sendKeys(Keys.ENTER);
    }
    public static void EnterTo(WebDriver d2, String s) {
        WebElement w = d2.findElement(By.xpath("//div[@id='station_till']//div[@title='"+s+"']"));
        w.sendKeys(Keys.ENTER);
    }
    public static void DoSearch(WebDriver d2) {
        WebElement w = d2.findElement(By.xpath("//button[@name='search']"));
        w.sendKeys(Keys.ENTER);
    }
    public static void EnterDate(WebDriver d2) {
        WebElement w = d2.findElement(By.xpath("//table[@class='month']/caption[text()='June 2015']/..//td[text()='27']"));
        w.sendKeys(Keys.ENTER);
    }
    public static String PickResSearch(WebDriver d2) {
        WebElement w = d2.findElement(By.xpath("//tr[@class='vToolsDataTableRow2']//td[@class='num']/a"));
        return w.getText();

    }
}
