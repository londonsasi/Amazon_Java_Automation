package com.amazan.in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Homepage extends DriverManager {
    public void searchForProduct() {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java programming");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
    }
}