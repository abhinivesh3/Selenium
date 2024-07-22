package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.Key;

public class Link {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
//        driver.get("https://www.google.com");
//        driver.findElement(By.name("q")).sendKeys("wallpaper hd 4k"+ Keys.ENTER);
//        driver.findElement(By.linkText("UWckNb")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[text()='Free 4k Wallpaper Photos']")).click();
        driver.get("https://www.leafground.com/pages/Link.html");
//        driver.findElement(By.linkText("Go to Home Page")).click();
        driver.findElement(By.partialLinkText("Home Page")).click();
    }
}
