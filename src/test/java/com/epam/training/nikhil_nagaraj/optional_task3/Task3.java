package com.epam.training.nikhil_nagaraj.optional_task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task3 {

    private static WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cloud.google.com/products/calculator");
    }

    @Test(priority=1)
    public void clickOnAddToEstimate(){
        AddToEstimate addToEstimate = new AddToEstimate(driver);
        addToEstimate.clickAddToElement();
    }

    @Test(priority = 2)
    public void clickOnComputeEngine(){
        ComputeEngine computeEngine=new ComputeEngine(driver);
        computeEngine.clickComputeEngine();
    }

    @Test(priority = 3)
    public void computeEngineFields(){
        ComputeEngineFields computeEngineFields=new ComputeEngineFields(driver);
        computeEngineFields.noOfInstances(""+4);
    }
}
