package com.cydeoLongs.tests.day3_cssSelector_xpath;

// Day 3 Task #1: NextBaseCRM, locators and getText() practice**

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3_Task1_locators_getText {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to:(https://login1.nextbasecrm.com/)
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        /*6- Verify error message text is as expected:
        Expected: Incorrect login or password*/

        WebElement actualErrorText = driver.findElement(By.xpath("//div[@class='errortext']"));
        String expectedErrorText = "Incorrect login or password";

        if (expectedErrorText.equals(actualErrorText.getText())){

            System.out.println("Test Passed");
        }else{
            System.out.println("expectedErrorText = " + expectedErrorText);
            System.out.println("actualErrorText.getText() = " + actualErrorText.getText());
            System.out.println("Test Failed");
        }
        driver.quit();


    }
}
