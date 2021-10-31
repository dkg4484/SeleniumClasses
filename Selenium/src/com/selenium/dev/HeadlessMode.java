package com.selenium.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class HeadlessMode {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		actions.sendKeys(driver.findElement(By.name("email")), "oranium").perform();

		System.out.println("==============");

		actions.sendKeys(driver.findElement(By.name("password")), "oranium").perform();

		System.out.println("===============");

		actions.click(driver.findElement(By.xpath("//*[@value='Login']" + ""))).perform();

		System.out.println("================");

	}

}
