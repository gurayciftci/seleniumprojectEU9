package com.cydeoLongs.tests.day3_cssSelector_xpath;

import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3_Task3_getAttribute_cssSelector {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //cssSelector Syntax: tagname[attribute='value']
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //loginButton.click();

        String expectedButtonText = "Log In";
        String actualButtonText = loginButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);
        System.out.println("expectedButtonText = " + expectedButtonText);

        driver.quit();

    }
}
