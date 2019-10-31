package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationDemo {
    public static void main(String[] args) throws InterruptedException {
        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //import class CMD+ENTER or ALT+enter or CONTROL+SPACE
        //selenium object
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        //another way tof opening site
        driver.navigate().to("https://www.facebook.com"); //s yerine url de yazabiliyor

        //goes back to provious ebpage
        driver.navigate().back();

        Thread.sleep(3000);//this is not selenium method, it is java method.

        //goes forward to
        driver.navigate().forward();

        //refresh the page
        driver.navigate().refresh();

    }
}
