package com.selenium.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsMain {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en.wikipedia.org/wiki/Main_Page");

		driver.manage().window().maximize();

		JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
		
		javaScriptUtil.scrollToParticularObj(By.xpath("//*[@title='Indira Gandhi']/../div"));
		
		javaScriptUtil.drawBorder(By.xpath("//*[@title='Indira Gandhi']/../div"));
//		
//		javaScriptUtil.scrollToBottom();
//
//		javaScriptUtil.scrollByPixel(700);

//		javaScriptUtil.scrollToBottom();
//		
//		javaScriptUtil.scrollToTop();
//		
//		javaScriptUtil.scrollToParticularObj(By.xpath("//*[@title='Indira Gandhi']/../div"));
//		

//		javaScriptUtil.clickByJs(By.xpath("//*[@id='logo']//a"));

//		javaScriptUtil.getElementWithId("input-email", "Oranium");
//		
//		javaScriptUtil.getInnerTextbyJs(By.xpath(""
//				+ "//*[@id='logo']//a"));

//		javaScriptUtil.generateAlert("Do not sleep");
//		
//		driver.switchTo().alert().accept();

//		javaScriptUtil.getTitleByJs();
//		
//		javaScriptUtil.refreshByJs();
//
//		JavaScriptUtil.changeColor(By.id("input-email"));
//
//		JavaScriptUtil.changeColor(By.id("input-password"));
//
//		JavaScriptUtil.changeColor(By.xpath("//*[@value='Login']"));

	}

}
