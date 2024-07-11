package com.epam.training.nikhil_nagaraj.optional_task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 {
    private static WebElement textArea;
    private static WebElement syntaxHighlitingDropDown;
    private static WebElement selectElement;
    private static WebElement title;
    private static WebElement pageExpirationDropDown;
    private static WebElement pageExpiration;
    private static WebDriver driver;
    @Test
    public void test(){
        driver=new EdgeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();


        textArea = driver.findElement(By.id("postform-text"));
        textArea.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force\n");


        syntaxHighlitingDropDown = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[3]/div/span/span[1]/span/span[2]"));
        syntaxHighlitingDropDown.click();


        selectElement = driver.findElement(By.xpath("//li[text()='Bash']"));
        selectElement.click();


        pageExpirationDropDown = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]"));
        pageExpirationDropDown.click();


        pageExpiration = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
        pageExpiration.click();


        title = driver.findElement(By.id("postform-name"));
        title.sendKeys(" how to gain dominance among developers");

    }

    @Test
    public void testTitle(){
        String actualTitle = title.getAttribute("value");

        String expectedTitle =" how to gain dominance among developers";
        Assert.assertEquals(actualTitle,expectedTitle,"The actual title is "+actualTitle+"\n Expected title is ' how to gain dominance among developers'");
    }

    @Test
    public void testSyntax(){
        String actual = driver.findElement(By.xpath("//*[@id=\"select2-postform-format-container\"]")).getText();
        String expected = "Bash";
        Assert.assertEquals(actual, expected, "The selected syntax is " + actual + "\n Expected syntax is '" + expected + "'");
    }

    @Test
    public void testParagraph(){
        String actual = driver.findElement(By.xpath("//*[@id=\"postform-text\"]")).getAttribute("value");
        String expected = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force\n";
        Assert.assertEquals(actual,expected, "Actual paragraph doesn't matches with the expected paragraph");
    }


}
