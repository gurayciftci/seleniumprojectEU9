package com.cydeoLongs.tests.day2_locators;

import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//- [ ]  **TC #4: Practice Cydeo – Class locator practice**
//PS: Locate “Home” link using “className” locator
public class day2_HW4_class_locator {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to:(https://practice.cydeo.com/inputs)
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        //4- Verify title is as expected:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("TITLE VERIFIED");
        }else {
            System.out.println("TITLE VERIFICATION FAILED");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("\n");
        }
        driver.quit();
    }
}
