package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {
       // TC #5: getText() and getAttribute() method practice
       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // 2- Go to: https://practice.cydeo.com/registration_form
        driver.navigate().to(" https://practice.cydeo.com/registration_form");

       // 3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));

       // Expected: (Registration form)
        String expectedHeaderText="Registration form";
        String actualHeaderText= headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("header text verification passed!");
        }else{
            System.out.println("header text verification failed!!!");
        }
       // 4- Locate “First name” input box
        WebElement firstNameInput=driver.findElement(By.name("firstname"));
       // 5- Verify placeholder attribute’s value is as expected:
       // Expected: first name
        String expectedPlaceHolder="first name";
        String actualPlaceHolder=firstNameInput.getAttribute("placeholder");
        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("place holder text verification passed!");
        }else {
            System.out.println("place holder text verification passed!!!");
        }
    }
}
