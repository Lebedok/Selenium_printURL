package Selenium.Locators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintURL {

    @Test

    public void PrintURL(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");

        WebElement searchJavaBook = driver.findElement(By.id("global-enhancements-search-query"));
        searchJavaBook.sendKeys("Java book" + Keys.ENTER);

        String url = driver.getCurrentUrl();
        System.out.println("Current URL is: "+ url);
    }

}
