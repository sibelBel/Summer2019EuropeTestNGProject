package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotChanged {

    /**
     *
     * Verify URL not changed
     * open chrome
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * click on Retrieve password
     * verify that url did not change
     */

    public static void main(String[] args) {

        //open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save url to String variable
        String ExpectedUrl=driver.getCurrentUrl();


        //click on Retrieve password
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualUrl=driver.getCurrentUrl();

        if (ExpectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        } else System.out.println("Fail");

        //close browser
        driver.quit();

    }
}
