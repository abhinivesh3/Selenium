package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

    WebDriver driver;
    long startTime, endTime;

    @BeforeSuite
    public void launchBrowser(){
        startTime = System.currentTimeMillis();

        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Test
    public void openGoogle(){
        driver.get("https://www.google.com");
    }

    @Test
    public void openBing(){
        driver.get("https://www.bing.com");
    }

    @Test
    public void openYahoo(){
        driver.get("https://www.yahoo.com");
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();
        endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println("Total time taken "+totalTime);
    }
}
