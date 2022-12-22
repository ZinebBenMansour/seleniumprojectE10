package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_FacebookVerification {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
       // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // 2. Go to https://www.facebook.com
        driver.navigate().to("https://www.facebook.com");
       // 3. Verify title:
       // Expected: “Facebook - Log In or Sign Up
        String expectedTitle= "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("title verification PASSED!");
        }else{
            System.out.println("title verification FAILED!!!");
        }
    }
}
