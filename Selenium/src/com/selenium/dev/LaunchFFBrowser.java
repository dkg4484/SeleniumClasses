package com.selenium.dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFFBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				"./driver/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.gmail.com");

		String s = driver.getTitle() + " " + 
		driver.getCurrentUrl();
		
		System.out.println(s);

	}

}
