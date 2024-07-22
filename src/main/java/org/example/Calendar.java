package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.navigate().to("https://www.calendar-365.com/calendar/2024/July.html");

        WebElement calendar = driver.findElement(By.id(""));
        calendar.sendKeys("01/07/2024"+ Keys.ENTER);

        WebElement nextButton = driver.findElement(By.xpath(""));
        nextButton.click();

        WebElement deleteToBeGiven = driver.findElement(By.xpath(""));
        deleteToBeGiven.click();
    }
}
