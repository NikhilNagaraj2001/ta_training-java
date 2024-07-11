package com.epam.training.nikhil_nagaraj.optional_task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task3 {
    @Test
    public void testTask3(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cloud.google.com/products/calculator");

        driver.findElement(By.className("UywwFc-vQzf8d")).click();

        driver.findElement(By.xpath("//h2[text()='Compute Engine'][contains(@class,'honxjf')]")).click();

    }
}
