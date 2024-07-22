package org.example.Selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class OpenGoogle {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/abhi-21739/Downloads/chromedriver-mac-arm64/chromedriver");
        try{
//            Proxy proxy = new Proxy();
//            proxy.setHttpProxy("127.0.0.1:3128");
//            proxy.setSslProxy("127.0.0.1:3128");

            ChromeOptions options = new ChromeOptions();
//            options.setAcceptInsecureCerts(true); // Accept insecure certificates
//            options.addArguments("--ignore-certificate-errors"); // Ignore certificate errors
//            options.addArguments("--disable-web-security"); // Disable web security
//            options.addArguments("--allow-running-insecure-content");
            options.addArguments("--remote-allow-origins=*");
//            options.addArguments("--proxy-server=http://your-proxy-server:port");
//            options.addArguments("excludeSwitches","enable-logging");
//            options.setProxy(proxy);
            WebDriver driver =new ChromeDriver(options);
            driver.get("https://www.google.com");
//            webdriver.quit();
            LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
            for (LogEntry entry : logEntries) {
                System.out.println(entry.getLevel() + " " + entry.getMessage());
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
