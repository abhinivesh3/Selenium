package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.get("");
        WebElement Frome =driver.findElement(By.id(""));
        WebElement To=driver.findElement(By.id(""));

        Actions actions=new Actions(driver);
//        actions.clickAndHold(Frome).moveToElement(To).release(To).build().perform();
        actions.dragAndDrop(Frome,To).build().perform();
    }
}
