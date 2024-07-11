package com.epam.training.nikhil_nagaraj.optional_task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputeEngineFields {
    WebDriver driver;
    WebElement noOfInstances;
    public  ComputeEngineFields(WebDriver driver){
        this.driver=driver;
    }

    public  void noOfInstances(String instances){
        noOfInstances = driver.findElement(By.xpath("//*[@id=\"c14\"]"));
        noOfInstances.sendKeys(instances);
    }

}
