package com.selenium.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		// To set the driver path

		WebDriver driver = new ChromeDriver();
		
		// To launch the chrome browser with blank URL
		
		driver.get("https://www.flipkart.com");
		
		System.out.println("URL of the webpage "+ driver.getCurrentUrl());
		
		System.out.println("Title of the webpage "+ driver.getTitle());
		
		// RemoteWebDriver --> 
		
		//txtUsername
		
		By username = By.id("txtUsername");
		
		driver.findElement(username);
		
		
		
		

	}

}
