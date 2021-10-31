package com.selenium.dev;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions {

	public static void main(String[] args) throws Exception {

		// https://swisnl.github.io/jQuery-contextMenu/demo.html

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		WebElement rightClick = driver.findElement(By.xpath("//*[text()='right click me']"));

		Actions actions = new Actions(driver);

		actions.contextClick(rightClick).perform();

		Robot robotObject = new Robot();

		for (int i = 0; i < 3; i++) {

			Thread.sleep(2000);

			robotObject.keyPress(KeyEvent.VK_DOWN);

			robotObject.keyRelease(KeyEvent.VK_DOWN);

		}

		actions.sendKeys(Keys.ENTER).perform();

	}

}
