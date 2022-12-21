package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerificatoin {
    public static void main(String[] args) {
        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

       // 2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");//or we can use .navigate to()

       // 3. Verify URL contains
        //Expected: cydeo
        String expectedURL="cydeo";
        String actualURL= driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL VERIFICATION PASSED!");
        }else {
            System.out.println("URL VERIFICATION FAILED!");
        }
       // 4. Verify title:
        //Expected: Practic
        String expectedTitle="practic";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title passed");
        }else{
            System.out.println("Title failed");
        }
        driver.close();
    }
}
