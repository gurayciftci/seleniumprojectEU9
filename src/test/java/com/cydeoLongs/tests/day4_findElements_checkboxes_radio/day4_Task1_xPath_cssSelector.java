package com.cydeoLongs.tests.day4_findElements_checkboxes_radio;

import com.cydeoShorts.utilities.WebDriverFactory;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//- [ ]  **TC #1: XPATH and cssSelector Practices**
public class day4_Task1_xPath_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to(https://practice.cydeo.com/forgot_password)
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        //a. “Home” link (xPath)
        WebElement homelink_xPath = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //a. “Home” link (cssSelector)
        WebElement homelink_cssSelector = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //b. “Forgot password” header (xPath)
        WebElement forgotPassword_xPath = driver.findElement(By.xpath("//div[@class='example']//h2"));
        System.out.println("forgotPassword_xPath.getText() = " + forgotPassword_xPath.getText());

        //b. “Forgot password” header (cssSelector)
        WebElement forgotPassword_cssSelector = driver.findElement(By.cssSelector("div.example > h2"));
        System.out.println("forgotPassword_cssSelector.getText() = " + forgotPassword_cssSelector.getText());

        //c. “E-mail” text (xPath)
        WebElement email_xPath = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println("email_xPath.getText() = " + email_xPath.getText());
        //c. “E-mail” text (cssSelector)
        WebElement email_cssSelector = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("email_cssSelector.getText() = " + email_cssSelector.getText());

        //d. E-mail input box (xPath)
        WebElement inputBox_xPath = driver.findElement(By.xpath("//input[@name='email']"));
        inputBox_xPath.sendKeys("xPath@gmail.com");

        //d. E-mail input box (cssSelector)
        WebElement inputBox_cssSelector = driver.findElement(By.cssSelector("input[name='email']"));
        inputBox_cssSelector.sendKeys("deneme cssSelector");


        //e. “Retrieve password” button (xPath)
        WebElement retrievePasswButton_xPath = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //e. “Retrieve password” button (cssSelector)
        WebElement retrievePasswButton_cssSelector = driver.findElement(By.cssSelector("button[id='form_submit']"));


        //f. “Powered by Cydeo text (xPath)
        WebElement cydeoText_xPath = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println("cydeoText_xPath.getText() = " + cydeoText_xPath.getText());
        //f. “Powered by Cydeo text (cssSelector)
        WebElement cydeoText_cssSelector = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("cydeoText_cssSelector.getText() = " + cydeoText_cssSelector.getText()+"\n\n\n");
        //4. Verify all web elements are displayed.
        System.out.println("homelink_xPath.isDisplayed() = " + homelink_xPath.isDisplayed());
        System.out.println("forgotPassword_cssSelector.isDisplayed() = " + forgotPassword_cssSelector.isDisplayed());
        System.out.println("email_cssSelector.isDisplayed() = " + email_cssSelector.isDisplayed());
        System.out.println("inputBox_cssSelector.isDisplayed() = " + inputBox_cssSelector.isDisplayed());
        System.out.println("retrievePasswButton_cssSelector.isDisplayed() = " + retrievePasswButton_cssSelector.isDisplayed());
        System.out.println("cydeoText_cssSelector.isDisplayed() = " + cydeoText_cssSelector.isDisplayed());

        driver.quit();
    }

    public static void compareText(@NotNull String expected, String actual){
        if (expected.equals(actual)){
            System.out.println("VERIFICATION PASS");
        }else {
            System.out.println("VERIFICATION FAIL");
            System.out.println("Expected: "+expected);
            System.out.println("Actual: "+actual);
        }
    }
}
