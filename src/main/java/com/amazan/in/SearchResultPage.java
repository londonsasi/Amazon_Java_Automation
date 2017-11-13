package com.amazan.in;

import org.openqa.selenium.By;

public class SearchResultPage  extends DriverManager{
    String firstProductItem = "//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2";
    public boolean searchResultPage()
    {
        boolean element = driver.findElement(By.xpath(firstProductItem)).isDisplayed();
        return element;
    }
    public void selectFirstProduct()
    {
        driver.findElement(By.xpath(firstProductItem)).click();
    }
}
