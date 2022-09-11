package com.cydeoLongs.tests.day3_cssSelector_xpath;

// TC #2: NextBaseCRM, locators, getText(), getAttribute() practice


import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3_Task2_getText_getAttribute {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.xpath("//label[@class='login-item-checkbox-label']"));
        String actualRML = rememberMeLabel.getText();
        String expectedRML = "Remember me on this computer";
        if (actualRML.equals(expectedRML)){
            System.out.println("“remember me” label text is as expected");
        }
        else {
            System.out.println("“remember me” label text is as NOT expected");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
        String actualFPL = forgotPasswordLink.getText();
        String expectedFPL = "Forgot your password?";
        if (actualFPL.equalsIgnoreCase(expectedFPL)){
            System.out.println("FPL TEST RESULT: PASS");
        }else{
            System.out.println("FPL TEST RESULT: FAIL");
            System.out.println(expectedFPL);
            System.out.println(actualFPL);
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");
        if (actualInHref.contains(expectedInHref)){
            System.out.println("HREF TEST RESULT: PASS");
        }else{
            System.out.println("HREF TEST RESULT: FAIL");
            System.out.println(actualInHref);
            System.out.println(expectedInHref);
        }

        driver.quit();
    }
}
