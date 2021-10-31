package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.manage().window().maximize();

//		WebElement ele = driver.findElement(By.xpath("//*[@name='login_page']"));

		driver.switchTo().frame(0);

		WebElement customerId = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));

		customerId.sendKeys("69739960");

	}

}
