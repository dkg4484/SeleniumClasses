package com.selenium.dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericClass {

	public static WebDriver driver;

	public static WebDriver browserFactory(String browserName) {

		switch (browserName.toUpperCase()) {

		case "CHROME":

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			return driver = new ChromeDriver();

		case "FF":
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

			return driver = new FirefoxDriver();

		case "IE":
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");

			return driver = new InternetExplorerDriver();

		default:

			System.out.println("Please pass the right browser name");

			return null;
		}

	}

	public static void launchUrl(String browserName, String url) {

		driver = browserFactory(browserName);
		driver.get(url);
		
		driver.manage().window().maximize(); // Method chaining or Builder pattern
		// to maximize the window
		
//		driver.manage().window().minimize();
		
//		Options manage = driver.manage();
//		Window window = manage.window();
//		window.maximize();
		System.out.println("Title of the given url " + driver.getTitle());
		System.out.println("Url of the given  app " + driver.getCurrentUrl());

	}

}
