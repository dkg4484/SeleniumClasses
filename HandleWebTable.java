package com.java;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/User/Desktop/Tables.html");

		driver.manage().window().maximize();

		System.out.println("Print all headers==========Way 1");

		List<WebElement> headers = driver.findElements(By.xpath("//table"
				+ "[@name='BookTable']//tr/th"));

		for (WebElement head : headers) {

			System.out.println(head.getText());

		}

		System.out.println("Print all headers==========Way 2");

		WebElement table = driver.findElement(By.xpath("//table[@name="
				+ "'BookTable']"));

		List<WebElement> tHeaders = table.findElements(By.tagName("th"));

		Iterator<WebElement> it = tHeaders.iterator();

		while (it.hasNext()) {

			System.out.println(it.next().getText());
		}

	}

}
