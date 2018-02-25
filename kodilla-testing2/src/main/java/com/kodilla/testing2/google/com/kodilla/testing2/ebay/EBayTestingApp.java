package com.kodilla.testing2.google.com.kodilla.testing2.ebay;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    private static final String EBAY_ADDRESS = "https://www.ebay.com/";
    private static final String SEARCHING_WORD = "Laptop";
    private static final String SEARCHFIELD  = "gh-ac";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(EBAY_ADDRESS);

        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys(SEARCHING_WORD);
        searchField.submit();
    }
}
