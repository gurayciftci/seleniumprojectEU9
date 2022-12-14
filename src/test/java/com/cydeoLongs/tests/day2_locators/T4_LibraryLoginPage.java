package com.cydeoLongs.tests.day2_locators;

/*TC #4: Library verifications
1. Open Chrome browser
2. Go to http://library2.cybertekschool.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS: Locate username input box using “className” locator
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator
  */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //2. Go to http://library2.cydeo.com/login.html
        driver.get(" http://library2.cydeo.com/login.html");

        //3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.id("inputEmail"));
        //WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorr@gmail.com");

        //4. Enter password: “incorrect password”
        WebElement usernamePassword = driver.findElement(By.id("inputPassword"));
        usernamePassword.sendKeys("incorPass");

        //Click sign In
        driver.findElement(By.tagName("button")).click();




















    }
}
