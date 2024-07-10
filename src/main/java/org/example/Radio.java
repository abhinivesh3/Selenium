package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radio {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://designsystem.digital.gov/components/radio-buttons/");

        WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"radio-buttons-preview-content\"]/fieldset/div[2]/label"));
        WebElement checked = driver.findElement(By.xpath("//*[@id=\"radio-buttons-preview-content\"]/fieldset/div[1]/label"));
        Boolean status1=unchecked.isSelected();
        Boolean status2=checked.isSelected();
        System.out.println(status1 +"    "+status2);

        WebElement clickit = driver.findElement(By.name("historical-figures"));
        clickit.click();
    }
}
