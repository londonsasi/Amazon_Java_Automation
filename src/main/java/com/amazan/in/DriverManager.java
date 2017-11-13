package com.amazan.in;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class DriverManager {

            public static WebDriver driver;

                public void openBrowser() throws IOException
        {
                   ChromeDriverManager.getInstance().setup();
                        driver= new ChromeDriver();
                  driver.get("https://www.amazon.co.uk");
                         driver.manage().window().maximize();
                 }
            public void closeBrowser()
        {
                      driver.quit();
                  }
}
