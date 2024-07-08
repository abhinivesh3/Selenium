package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=AdF4I76HC-RFS8HOa0B-2jSPU4oSN1DfV7k5SLB0A25wF_irEHGC0LK4jQ4jvTWt--4cTbN2HzorNw&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1291854884%3A1720442265993621&ddm=0");

//        enter value :

//        driver.findElement(By.id("identifierId")).sendKeys("abhinivesh382002@gmail.com");
        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        emailBox.sendKeys("abhinivesh382002");
//        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abhinivesh382002@gmail.com");
        /*
        if we using // start in xpath is relative path
        if we using / start in xpath is actual path
         */

//         append text :

//        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("@gamil.com");
        WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        appendBox.sendKeys("@gmail.com");

//        get value :

//        String value = driver.findElement(By.id("identifierId")).getAttribute("value");
        WebElement getTextBox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        String value =getTextBox.getAttribute("value");
        System.out.println(value);

        Thread.sleep(3000);

        //delete text from text field :

//        driver.findElement(By.id("identifierId")).clear();
        WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        clearBox.clear();

        WebElement disableBox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        boolean enabled=disableBox.isEnabled();
        System.out.println(enabled);
    }
}
