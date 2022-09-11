package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class altcoinSepetim {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        getList(driver);
        icp(driver);
        driver.quit();

            }

    public static double removeDollarAndMakeItDouble(String a){
        a = a.replace("$", "");
        a = a.replace(",", "");
        double b = Double.parseDouble(a);
        return b;
    }

    public static boolean line(double sınır, double suAnkiFiyat){
        if (sınır>=suAnkiFiyat){
            return true;
        }else {return false;}
    }

    public static void getList(WebDriver driver){

        //BTC
        driver.get("https://coinmarketcap.com/currencies/bitcoin/");
        String btc = driver.findElement(By.className("priceValue")).getText();
        System.out.println("BTC: Aldığım Fiyat: $21,971        Anlık Durum: "+btc);

        //MANA
        driver.get("https://coinmarketcap.com/currencies/decentraland/");
        String mana = driver.findElement(By.className("priceValue")).getText();
        System.out.println("MANA: Aldığım Fiyat: $0,86         Anlık Durum: "+mana);

        //SAND
        driver.get("https://coinmarketcap.com/currencies/the-sandbox/");
        String sand = driver.findElement(By.className("priceValue")).getText();
        System.out.println("SAND: Aldığım Fiyat: $1,07          Anlık Durum: "+sand);

        //ICP
        driver.get("https://coinmarketcap.com/currencies/internet-computer/");
        String icp = driver.findElement(By.className("priceValue")).getText();
        System.out.println("ICP: Aldığım Fiyat: Yok            Anlık Durum: "+icp);

        //XEC
        driver.get("https://coinmarketcap.com/currencies/ecash/");
        String xec = driver.findElement(By.className("priceValue")).getText();
        System.out.println("XEC: Aldığım Fiyat: $0.000039      Anlık Durum: "+xec);

        //MASK
        driver.get("https://coinmarketcap.com/currencies/mask-network/");
        String mask = driver.findElement(By.className("priceValue")).getText();
        System.out.println("MASK: Aldığım Fiyat: $1,346        Anlık Durum: "+mask);

        //SPELL
        driver.get("https://coinmarketcap.com/currencies/spell-token/");
        String spell = driver.findElement(By.className("priceValue")).getText();
        System.out.println("SPELL: Aldığım Fiyat: Yok          Anlık Durum: "+spell);

        //FLOW
        driver.get("https://coinmarketcap.com/currencies/flow/");
        String flow = driver.findElement(By.className("priceValue")).getText();
        System.out.println("FLOW: Aldığım Fiyat: Yok           Anlık Durum: "+flow);

        //QI
        driver.get("https://coinmarketcap.com/currencies/benqi/");
        String qi = driver.findElement(By.className("priceValue")).getText();
        System.out.println("QI: Aldığım Fiyat: $0.014          Anlık Durum: "+qi);

        //MBOX
        driver.get("https://coinmarketcap.com/currencies/mobox/");
        String mbox = driver.findElement(By.className("priceValue")).getText();
        System.out.println("MBOX: Aldığım Fiyat: $0,628        Anlık Durum: "+mbox);

        //GLMR
        driver.get("https://coinmarketcap.com/currencies/moonbeam/");
        String glmr = driver.findElement(By.className("priceValue")).getText();
        System.out.println("GLMR: Aldığım Fiyat: $0,61         Anlık Durum: "+glmr);

        //DAR
        driver.get("https://coinmarketcap.com/currencies/mines-of-dalarnia/");
        String dar = driver.findElement(By.className("priceValue")).getText();
        System.out.println("DAR: Aldığım Fiyat: $0,264         Anlık Durum: "+dar);

        //PEOPLE
        driver.get("https://coinmarketcap.com/currencies/constitutiondao/");
        String people = driver.findElement(By.className("priceValue")).getText();
        System.out.println("PEOPLE: Aldığım Fiyat: $0.022      Anlık Durum: "+people);

        //OOKI
        driver.get("https://coinmarketcap.com/currencies/ooki-protocol/");
        String ooki = driver.findElement(By.className("priceValue")).getText();
        System.out.println("OOKI: Aldığım Fiyat: $0,0066       Anlık Durum: "+ooki);

        //MINA
        driver.get("https://coinmarketcap.com/currencies/mina/");
        String mina = driver.findElement(By.className("priceValue")).getText();
        System.out.println("MINA: Aldığım Fiyat: Yok           Anlık Durum: "+mina);

        //OP
        driver.get("https://coinmarketcap.com/currencies/optimism-ethereum/");
        String op = driver.findElement(By.className("priceValue")).getText();
        System.out.println("OP: Aldığım Fiyat: Yok             Anlık Durum: "+op);

        //DYDX
        driver.get("https://coinmarketcap.com/currencies/dydx/");
        String dydx = driver.findElement(By.className("priceValue")).getText();
        System.out.println("DYDX: Aldığım Fiyat: Yok          Anlık Durum: "+dydx);

        //TLM
        driver.get("https://coinmarketcap.com/currencies/alien-worlds/");
        String tlm = driver.findElement(By.className("priceValue")).getText();
        System.out.println("TLM: Aldığım Fiyat: $0,02587      Anlık Durum: "+tlm);

        //SLP
        driver.get("https://coinmarketcap.com/currencies/smooth-love-potion/");
        String slp = driver.findElement(By.className("priceValue")).getText();
        System.out.println("SLP: Aldığım Fiyat: $0,00428     Anlık Durum: "+slp);

        //CVX
        driver.get("https://coinmarketcap.com/currencies/convex-finance/");
        String cvx = driver.findElement(By.className("priceValue")).getText();
        System.out.println("CVX: Aldığım Fiyat: Yok          Anlık Durum: "+cvx);

        //FIL
        driver.get("https://coinmarketcap.com/currencies/filecoin/");
        String fil = driver.findElement(By.className("priceValue")).getText();
        System.out.println("FIL: Aldığım Fiyat: Yok          Anlık Durum: "+fil);

    }

    public static void icp(WebDriver driver){

        driver.get("https://coinmarketcap.com/currencies/internet-computer/");
        String icp = driver.findElement(By.className("priceValue")).getText();
        //System.out.println("ICP: Aldığım Fiyat: Yok          Anlık Durum: "+icp);

        double price = removeDollarAndMakeItDouble(icp);
        System.out.println("\n-----ICP ANALİZİ-----");
        if(line(6,price)){
            System.out.println("Sınır: $6, şu anki fiyat: $"+price+ " ICP ALINABİLİR");
        }else {
            System.out.println("Sınır: $6, şu anki fiyat: $"+price+ " ICP ALMA");
        }
    }



}

