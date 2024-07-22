package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Buttons {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=AdF4I76HC-RFS8HOa0B-2jSPU4oSN1DfV7k5SLB0A25wF_irEHGC0LK4jQ4jvTWt--4cTbN2HzorNw&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1291854884%3A1720442265993621&ddm=0");

        WebElement text=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        text.sendKeys("abhinivesh382002@gmail.com");

//        Get the xy position
        WebElement getPositionButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
        Point xypoint = getPositionButton.getLocation();
        int xValue = xypoint.getX();
        int yValue = xypoint.getY();
        System.out.println("X position : "+xValue+"  Y position : "+yValue);

//        Find the color
        WebElement colorButton =driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
        String color =colorButton.getCssValue("background-color");
        System.out.println("The color of button : "+color);

//        Find the size
        WebElement sizeButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
        int height =sizeButton.getSize().getHeight();
        int width = sizeButton.getSize().getWidth();
        System.out.println("Button height : "+height+" and width : "+width);

//        go to next
        WebElement homeButton =driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
        homeButton.click();
    }
}
