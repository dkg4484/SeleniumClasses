package com.selenium.dev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		driver.manage().window().maximize();

		WebElement mouse = driver.findElement(By.xpath("//*[@class=" + "'menulink']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(mouse).perform();

		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='submenu']/li/a"));

		for (int i = 0; i < elements.size(); i++) {

			System.out.println(elements.get(i).getAttribute("innerText"));

		}

		// http://mrbool.com/

		//// *[@class='menulink']
	}

}
