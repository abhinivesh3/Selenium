package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Image {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://serpstat.com/blog/how-to-detect-broken-images-on-the-website/");
//        WebElement firstImage = driver.findElement(By.xpath("//*[@id=\"i6tbv1\"]"));
//        firstImage.click();
//        "naturalWidth" =0 is broken image
        WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\"i3pxg6\"]"));
        if(brokenImage.getAttribute("naturalWidth").equals("0")){
            System.out.println("Image is broken image");
        }
        else{
            System.out.println("Image is not broken image");
        }
    }
}
