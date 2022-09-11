package com.cydeoLongs.tests.day2_locators;

//- [ ]  **TC #2: Zero Bank header verification**


import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day2_HW2_zeroBank_header_verification {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to (http://zero.webappsecurity.com/login.html)
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        WebElement pageHeader = driver.findElement(By.xpath("//div[@class='page-header']"));
        String actualText = pageHeader.getText();
        String expectadText = "Log in to ZeroBank";

        if(actualText.equals(expectadText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectadText = " + expectadText);
            System.out.println("actualText = " + actualText);
        }
        driver.quit();
    }
}
