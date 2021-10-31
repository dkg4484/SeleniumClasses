package com.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Alert.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@onclick='confirmPrompt()']")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("TestLeaf");

		System.out.println(alert.getText());

		alert.accept();

		if (driver.findElement(By.id("result1")).getText().contains("should have enjoyed")) {

			System.out.println("Test Leaf=====");
		}

		else {

			System.out.println("Others==========");
		}
	}

}
