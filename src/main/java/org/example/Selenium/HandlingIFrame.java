package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HandlingIFrame {
    public static  void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.get("https://www.w3schools.com/html/html_iframe.asp");

        Thread.sleep(3000);
        driver.switchTo().frame(0);
        WebElement button1 = driver.findElement(By.id("google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//main_leaderboard_0"));
        button1.click();

        String text=driver.findElement(By.id("google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//main_leaderboard_0")).getText();
        System.out.println(text);

        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");

        WebElement button2=driver.findElement(By.xpath("//*[@id='main']/div[3]/iframe"));
        button2.click();

        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));
        int size= totalFrame.size();
        System.out.println(size);
    }
}
