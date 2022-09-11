package com.cydeoShorts.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Altcoin {

    public Altcoin(String address) {
        this.address = address;
    }

    public String name;
    public String address;
    public double price;


    public String getName(WebDriver driver) {
        driver.get(address);
        name = driver.findElement(By.className("priceHeading")).getText();
        name = getFirstWord(name);
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice(WebDriver driver) {
        driver.get(address);
        String priceText = driver.findElement(By.className("priceValue")).getText();
        price = removeDollarAndMakeItDouble(priceText);
        return price;
    }

    public static double removeDollarAndMakeItDouble(String a){
        a = a.replace("$", "");
        a = a.replace(",", "");
        double b = Double.parseDouble(a);
        return b;
    }

    private String getFirstWord(String text) {
        int index = text.indexOf(' ');
        if (index > -1) {
            return text.substring(0, index).trim();
        } else {
            return text;
        }
    }




}
