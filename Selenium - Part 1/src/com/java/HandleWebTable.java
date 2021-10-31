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

		List<WebElement> headers = driver.findElements(By.xpath("//table" + "[@name='BookTable']//tr/th"));

		for (WebElement head : headers) {

			System.out.println(head.getText());

		}

		System.out.println("Print all headers==========Way 2");

		WebElement table = driver.findElement(By.xpath("//table[@name=" + "'BookTable']"));

		List<WebElement> tHeaders = table.findElements(By.tagName("th"));

		Iterator<WebElement> it = tHeaders.iterator();

		while (it.hasNext()) {

			System.out.println(it.next().getText());
		}

		System.out.println("Retrive and Print no of rows=========");

		List<WebElement> tRows = table.findElements(By.tagName("tr"));

		System.out.println("Size " + tRows.size());

		System.out.println("Size " + driver.findElements(By.xpath("//*[@name='BookTable']//tr")).size());

		List<WebElement> tableheaders = tRows.get(0).findElements(By.tagName("th"));

		System.out.println("Number of headers in  0  row " + tableheaders.size());

		for (int i = 1; i < tRows.size(); i++) {

			List<WebElement> datas = tRows.get(i).findElements(By.tagName("td"));

			System.out.println("Number of columns in " + i + " row " + datas.size());

		}

		System.out.println("Find Book whose author is Mukesh============Way 1");

		for (int i = 1; i < tRows.size(); i++) {

			List<WebElement> datas = tRows.get(i).findElements(By.tagName("td"));

			if (datas.get(1).getText().equals("Amit")) {

				System.out.println(datas.get(0).getText());

			}
		}

		System.out.println("Find Book whose author is Mukesh============Way 2");

		for (int i = 1; i < tRows.size(); i++) {

			WebElement author = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + (i + 1) + "]/td[2]"));

			if (author.getText().equals("Amit")) {

				System.out.println(
						driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + (i + 1) + "]/td[1]")).getText());

			}

		}

		System.out.println("Find Book whose author is Mukesh============Way 3");

		List<WebElement> conditions = driver
				.findElements(By.xpath("//*[@name='BookTable']//tr/td[text()='Amod']/preceding-sibling::td"));

		conditions.forEach(o -> System.out.println(o.getText()));

		System.out.println("List books if cost is >= 1000");

		for (int i = 1; i < tRows.size(); i++) {

			WebElement price = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + (i + 1) + "]/td[last()]"));

			if (Integer.parseInt(price.getText()) >= 1000) {

				System.out.println(
						driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + (i + 1) + "]/td[2]")).getText());

			}

		}

		System.out.println("List books if cost is >= 1000 way 2");

		for (int i = 1; i < tRows.size(); i++) {

			List<WebElement> datas = tRows.get(i).findElements(By.tagName("td"));

			if (Integer.parseInt(datas.get(3).getText()) >= 1000) {

				System.out.println(datas.get(1).getText());

			}
		}

		System.out.println("Last row....");

		driver.findElements(By.xpath("//*[@name='BookTable']//tr[last()]/td"))
				.forEach((x) -> System.out.println(x.getText()));

		System.out.println("sum up========");

		List<WebElement> cost = driver.findElements(By.xpath("//*[@name='BookTable']//tr/td[last()]"));

		int sum = 0;

		for (int i = 0; i < cost.size(); i++) {

			sum = sum + Integer.parseInt(cost.get(i).getText());

		}

		System.out.println(sum);

		System.out.println(driver.findElement(By.xpath("//*[@name='BookTable']//tr[4]/td[3]")).getText());

	}

}
