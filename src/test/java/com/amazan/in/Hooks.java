package com.amazan.in;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

   DriverManager driverManager = new DriverManager();
   @Before
   public void setUP() throws IOException
   {
                   driverManager.openBrowser();
             }
    @After
    public void tearDown ()
        {
                        driverManager.closeBrowser();

                  }
    }

