package com.practices;
//Test Case 1: Register User
//https://www.automationexercise.com/test_cases#collapse1

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1_Register_User {
    public static void main(String[] args) {
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homeImage = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        System.out.println("homeImage.isDisplayed() = " + homeImage.isDisplayed());

        //4. Click on 'Signup / Login' button
        WebElement loginButton = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]"));
        loginButton.click();

        //5. Verify 'New User Signup!' is visible
        WebElement newUserSignup = driver.findElement(By.xpath("//div[@class='signup-form']//h2"));
        System.out.println("newUserSignup.getText() = " + newUserSignup.getText());
        System.out.println("newUserSignup.isDisplayed() = " + newUserSignup.isDisplayed());

        //6. Enter name and email address
        WebElement signupName = driver.findElement(By.xpath("//input[@type='text']"));
        signupName.sendKeys("ahmet");
        WebElement signupEmail = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        signupEmail.sendKeys("ahmetahmedov@gmail.com");

        //7. Click 'Signup' button
        WebElement signupButton = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        signupButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountText = driver.findElement(By.xpath("//h2[@class='title text-center'][1]"));
        System.out.println("enterAccountText.getText() = " + enterAccountText.getText());
        System.out.println("enterAccountText.isDisplayed() = " + enterAccountText.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth

        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
