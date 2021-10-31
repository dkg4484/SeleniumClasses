package com.selenium.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtil {

	WebDriver driver;

	public JavaScriptUtil(WebDriver driver) {

		this.driver = driver;
	}

	public void flash(String color, By locator) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].style.backgroundColor='" + color + "'", driver.findElement(locator));

	}

	public void changeColor(By locator) throws InterruptedException {

		for (int i = 0; i < 3; i++) {

			flash(driver.findElement(locator).getCssValue("backgroundColor"), locator);

			flash("rgb(0,200,0)", locator);

		}

	}

	public void getTitleByJs() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		System.out.println(jse.executeScript("return document.title;").toString());

	}

	public void refreshByJs() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("location.reload();");

	}

	public void generateAlert(String message) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("alert('" + message + "')");

	}

	public void getInnerTextbyJs(By locator) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String string = jse.executeScript("return document." + "documentElement.innerText", driver.findElement(locator))
				.toString();

		System.out.println(string.replaceAll(" © 2021", ""));

	}

	public void clickByJs(By locator) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].click();", driver.findElement(locator));

	}

	public void getElementWithId(String id, String value) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("document.getElementById('" + id + "')." + "value='" + value + "'");

	}

	public void scrollToBottom() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void scrollToTop() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

	//// *[@title='Indira Gandhi']/../div

	public void scrollToParticularObj(By locator) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
	}

	public void scrollByPixel(int height) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollTo(0," + height + ")");
	}

	public void drawBorder(By locator) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].style.border='3px solid green'", driver.findElement(locator));

	}

}
