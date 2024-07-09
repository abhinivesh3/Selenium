package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://semantic-ui.com/modules/dropdown.html#:~:text=A%20dropdown%20can%20be%20used,HTML%20and%20a%20hidden%20input%20.");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[5]/div")).click();
        WebElement dropDown1 = driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[5]/div/div[2]"));
        Select select = new Select(dropDown1);
        select.selectByIndex(2);
        select.selectByValue("2");
        select.selectByVisibleText("Elliot Fu");

        Thread.sleep(3000);
        List<WebElement> listOfOptions = select.getOptions();
        int size=listOfOptions.size();
        System.out.println("Number of elements : "+size);

        Thread.sleep(3000);
        dropDown1.sendKeys("Elliot Fu");

        Thread.sleep(3000);
        WebElement multiSelect = driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[5]/div/div[2]"));
        Select multiSelectedBox = new Select(multiSelect);
        multiSelectedBox.selectByIndex(1);
        multiSelectedBox.selectByIndex(2);
        multiSelectedBox.selectByIndex(3);
    }
}
