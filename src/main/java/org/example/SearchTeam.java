package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTeam {
    public static void  main(String[] args){
        System.setProperty("webdriver.gecko.driver","/Users/abhi-21739/Downloads/geckodriver");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Photos"+ Keys.ENTER);
    }
}
