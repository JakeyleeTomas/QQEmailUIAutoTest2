package com.qqemail.uitest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author guji
 * @description
 * @date 2021/4/9 22:07
 */
public class BasePage {
    public static WebDriver driver;

    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public List<WebElement> finElements(By by){
        return driver.findElements(by);
    }

    public void click(By by){
        findElement(by).click();
    }

    public void sendKeys(By by,String context){
        findElement(by).sendKeys(context);
    }

    public String getText(By by){
        return findElement(by).getText();
    }
}
