package com.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCherCher {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames");

		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.
				xpath("//*[text()='Not a Friendly Topic']"));

		String text = ele.getText();

		driver.switchTo().frame("iamframe");

		WebElement ele2 = driver.findElement(By.
				xpath("//input[@type='text']"));

		ele2.sendKeys(text);

		driver.switchTo().frame("frame3");

		WebElement checkBox = driver.findElement(By.id("a"));

		checkBox.click();
		
//		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.id("frame2"));
		
		driver.switchTo().frame(frame2);

		WebElement ddn = driver.findElement(By.id("animals"));

		ddn.click();

		List<WebElement> options = driver.findElements(
				By.xpath("//*[@id='animals']/option"));

		for (int i = 0; i < options.size(); i++) {

			System.out.println(options.get(i).getText());

		}

	}

}
