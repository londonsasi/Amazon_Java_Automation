package com.amazan.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage extends DriverManager
{
    public void addToBasket() {
        WebElement popup = (new WebDriverWait(driver, 50))
        .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a-button-close a-declarative")));
        popup.click();
        driver.findElement(By.cssSelector("add-to-cart-button")).click();
    }

    private void until(ExpectedCondition<WebElement> webElementExpectedCondition) {
    }
}

