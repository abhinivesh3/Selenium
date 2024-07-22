package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolTip {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_tooltip");

        WebElement name=driver.findElement(By.xpath("/html/body/div"));
        Thread.sleep(3000);
        String toolTripText = name.getAttribute("tooltiptext");
        System.out.println(toolTripText);

    }
}
