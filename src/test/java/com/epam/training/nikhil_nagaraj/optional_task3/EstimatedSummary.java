package com.epam.training.nikhil_nagaraj.optional_task3;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public class EstimatedSummary extends BasePage {
    protected EstimatedSummary(WebDriver driver) {
        super(driver);
    }

    public Fields getSummaryText() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Fields fields = new Fields(driver);
        fields.setNoOfInstances();
        fields.setOsSelection();
        fields.setProvisionalModel();
        fields.setMachineType();
        fields.setGPUType();
        fields.setNoOfGPUs();
        fields.setLocalSSD();
        fields.setRegion();
        fields.setDiscount();
        return fields;
    }
}
