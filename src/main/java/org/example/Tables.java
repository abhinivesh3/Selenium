package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tables {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.navigate().to("");
        List<WebElement> columns = driver.findElements(By.tagName("th"));
        int columnCount =  columns.size();
        System.out.println("Number of the columns : "+columnCount);

        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        int rowCount = rows.size();
        System.out.println("Number of the rows : "+rowCount);

        WebElement getPercent = driver.findElement(By.xpath("//td"));
        String percent = getPercent.getText();
        System.out.println("Percentage is "+percent);

        List<WebElement> allProgress = (List<WebElement>) driver.findElement(By.xpath("//td[2]"));
        List<Integer> numberList = new ArrayList<>();
        for(WebElement webElement:allProgress){
            String individualValue = webElement.getText().replace("%","");
            numberList.add(Integer.parseInt(individualValue));
        }
        System.out.println("Final list "+numberList);

        int smallValue = Collections.min(numberList);
        System.out.println(smallValue);

        String smallValueString = Integer.toString(smallValue)+"%";
        String finalPath= "td(normalize-space()="+"\""+smallValueString+"\""+"]"+"//following::td[1])";
        System.out.println(finalPath);

    }
}
