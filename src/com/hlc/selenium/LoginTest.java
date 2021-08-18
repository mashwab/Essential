package com.hlc.selenium;

import org.openqa.selenium.WebDriver;


public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Util.getDriver();
        driver.navigate().back();

    }


}
