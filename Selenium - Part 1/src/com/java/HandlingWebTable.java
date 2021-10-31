package com.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	String str = "Dinesh Kumar ";

	static WebDriver driver;

	public static void getHeaders(List<WebElement> headers) {

		for (WebElement head : headers) {

			System.out.println("TEXT" + head.getText());

		}

	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.datatables.net");

		driver.manage().window().maximize();

		System.out.println("TITLE " + driver.getTitle());

		System.out.println("URL " + driver.getCurrentUrl());

		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));

		getHeaders(headers);

	}

}
