package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class WindowsHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("");

        String oldWindow = driver.getWindowHandle();
        WebElement firstButton =driver.findElement(By.id(""));
        firstButton.click();

        Set<String> handles = driver.getWindowHandles();
        for (String newWindow : handles){
            driver.switchTo().window(newWindow);
        }

        WebElement editbox=driver.findElement(By.xpath(""));
        editbox.click();
        driver.close();

        driver.switchTo().window(oldWindow);

        WebElement openMultiple =  driver.findElement(By.xpath(""));
        openMultiple.click();
        Thread.sleep(3000);

        int numberOfWindows = driver.getWindowHandles().size();
        System.out.println("Number of windows opened : "+numberOfWindows);

        WebElement dontCloseMe = driver.findElement(By.id(""));
        dontCloseMe.click();

        Set<String> newWindowHandles = driver.getWindowHandles();
        for(String allWindows :  newWindowHandles){
            if(!allWindows.equals(oldWindow)){
                driver.switchTo().window(allWindows);
                driver.close();
            }
        }
    }
}
