package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.cydeoShorts.practice.AltcoinMethods.coinAddress;

public class AltcoinMain {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Altcoin btc = new Altcoin("https://coinmarketcap.com/currencies/bitcoin/");
        //System.out.println("Name: "+ btc.getName(driver) + "\nPrice: "+btc.getPrice(driver));

        System.out.println(coinAddress("https://coinmarketcap.com/currencies/cardano/",driver));

        driver.quit();

    }








}
