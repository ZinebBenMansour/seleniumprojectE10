package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {

       // 1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
       // 2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate “CYDEO” link, verify it is displayed.WITH NUMBER 5
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        //  4- Refresh the page.
        driver.navigate().refresh();

        //We are refreshing the web element reference by re-assignin(re-locating)the web element
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        // 5- Verify it is displayed, again
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

    }
}