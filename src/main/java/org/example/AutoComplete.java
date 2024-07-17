package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");

        //WebElement input =driver.findElement(By.id("cars"));
//        WebElement input = driver.findElement(By.xpath("//*[@id='cars']/option"));
//        Thread.sleep(3000);
//        input.sendKeys("A");

        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='cars']")).click();
        List<WebElement> optionsList=driver.findElements(By.xpath("//*[@id='cars']/option"));
        System.out.println(optionsList.size());
        Thread.sleep(3000);
        for(WebElement webElement:optionsList){
            if(webElement.getText().equals("Audi")){
                webElement.click();
                System.out.println("selecting "+webElement.getText());
                break;
            }
        }
    }
}
