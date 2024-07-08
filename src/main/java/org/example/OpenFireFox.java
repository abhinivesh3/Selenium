package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {
    public static void  main(String[] args){
        System.setProperty("webdriver.gecko.driver","/Users/abhi-21739/Downloads/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com");
        //driver.close();
        driver.quit();
    }
}
