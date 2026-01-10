package com.tka.jbk.crm_1.Selenium_Script;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_Practice_flipkart {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		List<WebElement> links = driver.findElements(By.xpath("//div[@class='x3q9HG']//a"));

		for (WebElement link : links) {

			String linkText = link.getText();
			System.out.println(linkText);

			if (linkText.equals("Myntra")) {
				link.click();
				break;
			}
		}
		driver.quit();
	}
}
