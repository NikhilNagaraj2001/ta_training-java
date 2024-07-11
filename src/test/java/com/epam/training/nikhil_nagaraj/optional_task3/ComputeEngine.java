package com.epam.training.nikhil_nagaraj.optional_task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComputeEngine {
    private  WebDriver driver;
    private  WebElement computeEngine;

    public ComputeEngine(WebDriver driver ){
        this.driver = driver;
    }

    public void clickComputeEngine(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Compute Engine'][contains(@class,'honxjf')]")));
        computeEngine = driver.findElement(By.xpath("//h2[text()='Compute Engine'][contains(@class,'honxjf')]"));

        computeEngine.click();
    }


}
