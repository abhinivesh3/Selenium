package org.example.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {
    public static  void  main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("");

        WebElement alertBox=driver.findElement(By.xpath(""));
        alertBox.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement confirmButton = driver.findElement(By.xpath(""));
        confirmButton.click();
        Alert confirmAlert = driver.switchTo().alert();
        alert.dismiss();

        WebElement promptBox = driver.findElement(By.xpath(""));
        promptBox.click();
        Alert promptAlert=driver.switchTo().alert();
        alert.sendKeys("Hey!!!");
        alert.accept();
    }
}
