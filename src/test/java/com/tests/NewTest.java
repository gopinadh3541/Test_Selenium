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
	//  driver.manage().window().maximize();
	  //WebElement Searchbox = driver.findElement(By.id("lst-ib"));
	  
	  driver.get("http://10.89.44.105:9001/BankApp1/");
	  //driver.get("https://google.ca");
	  driver.manage().window().maximize();
      driver.getTitle();
	  String title = driver.getCurrentUrl();
		System.out.println("Getting the title:"+title);
		WebElement Searchbox = driver.findElement(By.name("uname"));
		System.out.println("The value is:"+Searchbox);
		//Searchbox.sendKeys("sudhaaug84@gmail.com");
		Searchbox.sendKeys("abc");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		Searchbox.submit();
		System.out.println("after click");
		
	
	//driver.get("Hello World");
	 // Searchbox.click();
	  ;
	 
	  //String title = driver.getTitle();	
	 // Assert.assertEquals(title, "Google");
	  
	//  WebElement Searchbox = driver.findElement(By.id("lst-ib"));
	  //Searchbox.sendKeys("Software Testing Studio");
	//  WebElement search_button = driver.findElement(By.name("btnK"));
	 // String text = search_button.getAttribute("value");
	  //Assert.assertEquals(text, search_text, "Text not found!");
	  
	/* driver.get("http://localhost:8094/spring-mvc-example/");  
		//String title = driver.getTitle();	
		String title = driver.getCurrentUrl();
		System.out.println("Getting the title:"+title);
		WebElement name=driver.findElement(By.id("userName"));
		
		name.sendKeys("sudhas");
        driver.findElement(By.id("u_0_b")).click();
		System.out.println("Getting the title:"+name);
		//Assert.assertTrue(title.contains("google"));
	//	Assert.assertEquals(title, "Home");*/
	  
		
	  
  }
  @BeforeTest
  public void beforeTest() {
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
 

}
