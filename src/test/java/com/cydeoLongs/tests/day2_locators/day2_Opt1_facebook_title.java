package com.cydeoLongs.tests.day2_locators;
//- [ ]  **TC #1: Facebook title verification**

import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class day2_Opt1_facebook_title {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to (https://www.facebook.com/)
        driver.get("https://www.facebook.com");

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        String expectedTitle = "Facebook - Log In or Sign Up";
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
