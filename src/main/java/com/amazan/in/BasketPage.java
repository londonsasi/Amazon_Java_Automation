package com.amazan.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.amazan.in.DriverManager.driver;

public class BasketPage {
    String BasketCount="";
    public void goToBasket()
    {
        driver.findElement(By.cssSelector(BasketCount)).click();

    }
    public String getBasketItems()
    {
        WebElement basketItem=(new WebDriverWait(driver,30))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(BasketCount)));
        String basketCount=basketItem.getText();
        return basketCount;
    }
}
