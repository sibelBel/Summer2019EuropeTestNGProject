package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Verify URL changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */

        //open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


        //sendKeys()--> send keyboard actions to web element/enters given text
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("email@gmail.com");


        //click on Retrieve password
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="http://practice.cybertekschool.com/email_sent";

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Actual result: "+actualUrl);
            System.out.println("Expected results: "+expectedUrl);
        }

        Thread.sleep(5000);
        //close browser
        driver.quit();
    }
}
