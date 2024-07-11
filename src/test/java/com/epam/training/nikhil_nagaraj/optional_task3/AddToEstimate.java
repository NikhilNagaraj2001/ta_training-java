package com.epam.training.nikhil_nagaraj.optional_task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToEstimate {
    WebDriver driver;
    WebElement addToEstimate;
    public AddToEstimate(WebDriver driver){
        this.driver=  driver;
    }
    public void clickAddToElement(){
        addToEstimate= driver.findElement(By.className("UywwFc-vQzf8d"));
        addToEstimate.click();
    }
}
