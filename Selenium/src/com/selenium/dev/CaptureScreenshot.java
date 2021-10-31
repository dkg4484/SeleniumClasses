package com.selenium.dev;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		Robot robotObject = new Robot();

		Dimension dimension = Toolkit.getDefaultToolkit()
				.getScreenSize();

		Rectangle rectangle = new Rectangle(dimension);

		BufferedImage bufferedImage = robotObject
				.createScreenCapture(rectangle);

		long currentTimeMillis = System.currentTimeMillis();

		File dest = new File("./ScreenShot/facebook" +
		currentTimeMillis + ".png");

		ImageIO.write(bufferedImage, "png", dest);

	}

}
