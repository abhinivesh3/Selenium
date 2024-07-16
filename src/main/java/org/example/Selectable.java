package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Selectable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.get("https://html.com/attributes/select-multiple/#:~:text=Multiple%20List%20Selections,to%20add%20some%20explanatory%20text.");
        Thread.sleep(1000);
        List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select/option"));
        Thread.sleep(1000);
        int listSize =  selectable.size();
        System.out.println(listSize);

        Thread.sleep(1000);
        Actions actions = new Actions(driver);
//        actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
        actions.clickAndHold(selectable.get(0));
        actions.clickAndHold(selectable.get(1));
        actions.clickAndHold(selectable.get(2));
        actions.build().perform();
    }
}
