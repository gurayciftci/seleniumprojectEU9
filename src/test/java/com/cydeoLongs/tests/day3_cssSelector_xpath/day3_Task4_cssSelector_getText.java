package com.cydeoLongs.tests.day3_cssSelector_xpath;

//TC #4: NextBaseCRM, locators, getText(), getAttribute() practice

import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3_Task4_cssSelector_getText {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement loginButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        //WebElement loginButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        System.out.println("loginButton.getText() = " + loginButton.getText());

        String actualLoginButtonText = loginButton.getText();
        String expectedLoginButtonText = "Reset password";

        compareText(expectedLoginButtonText, actualLoginButtonText);

    }
    public static void compareText(String expected, String actual){
        if (expected.equals(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Expected: "+expected);
            System.out.println("Actual: "+actual);
        }
    }

}
