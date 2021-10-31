package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Functions {

	public static String readPropertyFile(String key) {

		File fileLoc = new File("./config/objectRepo.properties");

		FileReader reader = null;

		try {
			reader = new FileReader(fileLoc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties property = new Properties();

		try {
			property.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String value = property.getProperty(key);

		return value;

	}

	WebDriver driver;

	public void launchUrl(String browserName, String url) {

		if (browserName.equalsIgnoreCase("CHROME")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");

			driver = new InternetExplorerDriver();

		}

		else {

			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.get(url);

		driver.manage().window().maximize();

		System.out.println("TITLE " + driver.getTitle() + "\n" + "URL " + driver.getCurrentUrl());

	}

}
