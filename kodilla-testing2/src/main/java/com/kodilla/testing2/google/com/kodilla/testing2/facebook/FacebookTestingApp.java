package com.kodilla.testing2.google.com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    private static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    private static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    private static final String FACEBOOK_URL= "https://www.facebook.com/";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(FACEBOOK_URL);

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoardDay = new Select(selectDay);
        selectBoardDay.selectByIndex(9);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoardMonth = new Select(selectMonth);
        selectBoardMonth.selectByIndex(6);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoardYear = new Select(selectYear);
        selectBoardYear.selectByIndex(18);
    }
}
