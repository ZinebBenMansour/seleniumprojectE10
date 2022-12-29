package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_FacebookIncorrectLoginTitleVerification {
    public static void main(String[] args) {
       // TC #2: Facebook incorrect login title verification
       // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2. Go to
        driver.get("https://www.facebook.com");

       // 3. Enter incorrect username
        WebElement userNameInput = driver.findElement(By.id("email"));
        userNameInput.sendKeys("incorrect@gmail.com");

       // 4. Enter incorrect password
        WebElement passwordInput = driver.findElement(By.name("pass"));
        passwordInput.sendKeys("12345"+ Keys.ENTER);

        //5. Verify title changed to:
        //Expected: “Log into Facebook

        String expectedTitelChanged ="Log in to Facebook";
        String actualTitleChanged = driver.getTitle();
        if (actualTitleChanged.equals(expectedTitelChanged)){
            System.out.println("verification of title change PASSED");
        }else{
            System.out.println("verification of title changed FAILED!!!");
        }
    }
}
