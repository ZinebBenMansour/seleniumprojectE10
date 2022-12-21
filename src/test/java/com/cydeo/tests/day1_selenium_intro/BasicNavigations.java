package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1 setup the browser driver

        WebDriverManager.chromedriver().setup();

        //2create instance of the selenium web driver
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = "+currentTitle);

        //get the current URL using selenium
        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = "+currentURL);

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate beck
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //use navigate().to():
        driver.navigate().to("https://google.com");
        currentTitle= driver.getTitle();

        //get the title of the page
        driver.getTitle();
        //System.out.println("drive.getTitle() = "+driver.getTitle());

        System.out.println("currentTitle = "+currentTitle);


        //get the current URL using selenium
        currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = "+currentURL);


        //this will close only the currently opened window
        driver.close();


        //this will close all of the opened windows
        driver.quit();


    }
}
