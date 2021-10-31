package com.selenium.dev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		String title = driver.getTitle();

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Title " + title);

		System.out.println("URL " + currentUrl);

		By username = By.id("email");

		WebElement user = driver.findElement(username);

		user.sendKeys("dinadas1993");

		WebElement pwd = driver.findElement(By.id("pass"));

		pwd.sendKeys("Diamond");

		String emailId = user.getAttribute("value");

		String password = pwd.getAttribute("value");

		System.out.println("Credentails " + emailId + " " + password);

		WebElement login = driver.findElement(By.name("login"));

		login.click();

		Thread.sleep(4000);

		if (!title.equals(driver.getTitle()) && !currentUrl.equals(driver.getCurrentUrl())) {

			System.out.println("Landing to right page...");
		}

		else {

			System.out.println("Not landed correctly");
		}

		System.out.println(driver.findElement(By.className("_9axz")).getAttribute("innerText"));

		System.out.println(driver.findElement(By.className("_9axz")).getText());

		driver.quit();

	}

}
