package com.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.manage().window().maximize();

		TakesScreenshot tks = (TakesScreenshot) driver; // Down casting takes screen shot interface to 
											//webdriver object

		File souceLocation = tks.getScreenshotAs(OutputType.FILE); // This method used to take screen shot
															//of web page
																	// --> File

		// The screen shot stored inside the Temp Folder

		File destLocation = new File("./ScreenShot/vino.png"); // We are creating new file

		try {
			FileUtils.copyFile(souceLocation, destLocation);// Inorder to copy temp to some permanent folder.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("============Screenshot has taken======");

	}

}
