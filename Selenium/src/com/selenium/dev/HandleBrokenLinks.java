package com.selenium.dev;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		List<String> list_Url = new ArrayList<>();

		System.out.println("Number of Links ----> " + links.size());

		for (int i = 0; i < links.size(); i++) {

			String url = links.get(i).getAttribute("href");

			list_Url.add(url);

		}

		Long startTime = System.currentTimeMillis();

		list_Url.stream().forEach((x) -> {
			try {
				checkBrokenUrl(x);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		Long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);
	}

	public static void checkBrokenUrl(String link) throws IOException {

		try {
			
			URL url = new URL(link);

			HttpURLConnection httpUrlConnection = (HttpURLConnection) 
					(url.openConnection());

			httpUrlConnection.setConnectTimeout(5000);

			httpUrlConnection.connect();

			if (httpUrlConnection.getResponseCode() >= 400) {

				System.out.println("The given link " + 
				httpUrlConnection.getResponseMessage() + " is broken");
			}

			else {

				System.out.println("The given link " + 
				httpUrlConnection.getResponseMessage() + " "
						+ "is not broken");
			}

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}

	}

}
