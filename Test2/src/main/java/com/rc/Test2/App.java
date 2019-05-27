package com.rc.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class App 
{
    
    	@Test
    	public void Hello() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    	}
}
