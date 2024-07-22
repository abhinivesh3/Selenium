package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class DownloadFile {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-xls-download/#google_vignette");

        WebElement downloadLink = driver.findElement(By.linkText("DOWNLOAD SAMPLE XLS FILE"));
       // WebElement downloadLink = driver.findElement(By.xpath("//*[@id='table-files']/tbody/tr[1]/td[5]/a"));
        downloadLink.click();

        Thread.sleep(3000);

        File fileLocation = new File("/Users/abhi-21739/downloads");
        File[] totalFiles = fileLocation.listFiles();

        for(File file:totalFiles){
            if(file.getName().equals("file_example_XLS_10.xls")){
                System.out.println("File is download");
                break;
            }
        }
    }
}
