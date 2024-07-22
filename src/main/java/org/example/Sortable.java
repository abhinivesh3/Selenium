package org.example;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Sortable {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.navigate().to("");
        List<WebElement> elements=driver.findElements(By.xpath(""));
        WebElement fromElement = elements.get(6);
        WebElement toElement = elements.get(0);

        Actions actions=new Actions(driver);
        actions.clickAndHold(fromElement);
        actions.moveToElement(toElement);
        actions.release(toElement);
        actions.build().perform();
    }
}
