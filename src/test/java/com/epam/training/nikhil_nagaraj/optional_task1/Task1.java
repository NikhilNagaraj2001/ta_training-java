package com.epam.training.nikhil_nagaraj.optional_task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task1 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void Test(){
            WebElement textArea = driver.findElement(By.id("postform-text"));
            textArea.click();
            textArea.sendKeys("Hello from WebDriver");

            WebElement selectDropDown = driver.findElement(By.id("select2-postform-expiration-container"));
            selectDropDown.click();
        WebElement pasteExpiration = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
            pasteExpiration.click();
        WebElement pasteTitle = driver.findElement(By.id("postform-name"));
            pasteTitle.sendKeys("helloweb");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.close();
    }
}