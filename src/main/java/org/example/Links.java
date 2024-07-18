package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Links {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.navigate().to("");
        WebElement homePageLink = driver.findElement(By.linkText(""));
        homePageLink.click();
        driver.navigate().back();

        WebElement whereToGo = driver.findElement(By.partialLinkText(""));
        String where = whereToGo.getAttribute("href");
        System.out.println("This  link is going to "+where);

        WebElement brokenLink = driver.findElement(By.linkText(""));
        brokenLink.click();;
        String title = driver.getTitle();
        if(title.contains("404")){
            System.out.println("Link is broken");
        }
        driver.navigate().back();

        homePageLink.click();
        driver.navigate().back();
        List<WebElement> totalLinks = driver.findElements(By.tagName(""));
        int linkCount = totalLinks.size();
        System.out.println(linkCount);
    }
}
