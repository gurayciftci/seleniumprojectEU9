package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice8_binance_btc_price_checker {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.binance.com/tr/trade/BTC_BUSD?theme=dark&type=spot");

        WebElement btcUsd = driver.findElement(By.className("showPrice"));
        String btcUsdText = btcUsd.getText();
        System.out.print("BTC/USDT = $" + btcUsdText + "     ");

        WebElement btcTry = driver.findElement(By.className("subPrice"));
        String btcTryText = btcTry.getText();
        System.out.println("BTC/TRY = " + btcTryText);
        WebElement cop = driver.findElement(By.className("css-4rbxuz"));
        cop.click();

        /*Thread.sleep(2000);



         driver.get("https://www.binance.com/tr/trade/ETH_BUSD?theme=dark&type=spot");

       WebElement ethUsd = driver.findElement(By.className("showPrice"));
        String ethUsdText = ethUsd.getText();
        System.out.print("ETH/USDT = $" + ethUsdText + "     ");

        WebElement ethTry = driver.findElement(By.className("subPrice"));
        String ethTryText = ethTry.getText();
        System.out.println("ETH/TRY = " + ethTryText);*/

        //ethPrice();

    }
    public static void ethPrice(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.binance.com/tr/trade/ETH_BUSD?theme=dark&type=spot");

        WebElement ethUsd = driver.findElement(By.className("showPrice"));
        String ethUsdText = ethUsd.getText();
        driver.quit();

        System.out.println("ETH/USDT = $" + ethUsdText);
            }
}
