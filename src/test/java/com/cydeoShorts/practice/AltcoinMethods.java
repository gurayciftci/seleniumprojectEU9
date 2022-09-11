package com.cydeoShorts.practice;

import org.openqa.selenium.WebDriver;

public class AltcoinMethods {

    public static double plus40percent(double price){
        price = price + (price*4/10);
        return price;
    }

    public static double plus100percent(double price){
        price = price *2;
        return price;
    }

    public static double plus300percent(double price){
        price = price *3;
        return price;
    }

    public static double plus1000percent(double price){
        price = price *10;
        return price;
    }

    public static double plus20percent(double price){
        price = price + (price/5);
        return price;
    }

    public static void comparePrice(double alımFiyatı, double anlıkFiyat){
        if (plus20percent(alımFiyatı)<anlıkFiyat){
            System.out.println("Current Price: " + anlıkFiyat + "   Purchase Price: " + alımFiyatı);
            System.out.println("Profit is more than 20%");
        }

    }

    public static String coinAddress(String coinLink, WebDriver driver){
        Altcoin a = new Altcoin(coinLink);
        return "Name: "+ a.getName(driver) + "  Price: "+a.getPrice(driver);
    }
}
