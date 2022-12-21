package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

       //TC #1: Yahoo Title Verification
        //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        // 1.Open Chrome browser
        WebDriver driver=new ChromeDriver();

        //make our page fullscreen
        driver.manage().window().maximize();

       // 2.Go to
        driver.get("https://www.amazon.com");

        //3.Verify title:
       // Expected: Yahoo mail,weather,search,politics,news,finance,sports&videos
        String expectedTitle="Amazon.com. Spend less. Smile more.";

        //actual title comes from the browser
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected.Verification Passed");
        }else{
            System.out.println("title is not as expected.verification failed");
        }

    }
}
