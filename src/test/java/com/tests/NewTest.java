package com.tests;


import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;
	
	
  @Test
  public void testEasy() {
	  
	  System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		 
	  driver=new ChromeDriver();
	
	  
	  driver.get("http://10.89.44.105:9001/BankExample/");
	 
	  
		driver.manage().window().maximize();
		WebElement Searchbox = driver.findElement(By.name("uname"));
		WebElement Searchbox1=driver.findElement(By.name("pwd"));
		Searchbox.sendKeys("admin");
		Searchbox1.sendKeys("admin");
		WebElement Searchbox2=driver.findElement(By.name("submit"));
		Searchbox2.submit();
		System.out.println("After Click");
		String title = driver.getTitle();
		driver.getCurrentUrl();
		String expectedTitle = "Frames";
		Assert.assertEquals(expectedTitle, title);
		System.out.println("After Assertion:" + title + " " + expectedTitle + " Matched");
	;
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
 

}
