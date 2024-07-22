package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

        WebElement yellow=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[2]"));
        yellow.click();

        WebElement selected= driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[1]"));
        boolean selectedvalue=selected.isSelected();
        System.out.println(selectedvalue);

        WebElement selected1= driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[1]"));
        if(selected1.isSelected()){
            selected1.click();
        }
    }
}
