package com.hlc.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {
    public static WebDriver getDriver () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa-essential.helicaldash.com/login/user-login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

        driver.findElement(By.name("username")).sendKeys("homeoffice");
        driver.findElement(By.name("password")).sendKeys("aaaaaA");
        Thread.sleep(3000);
        driver.findElement(By.id("btn1")).click();

        return driver;

    }

}