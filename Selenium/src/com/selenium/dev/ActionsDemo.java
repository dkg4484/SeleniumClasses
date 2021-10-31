package com.selenium.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		actions.sendKeys(driver.findElement(By.name("email")), 
				"oranium").perform();

		actions.sendKeys(driver.findElement(By.name("password")), 
				"oranium").perform();

		actions.click(driver.findElement(By.xpath("//*[@value='Login']"
				+ ""))).perform();

	}

}
