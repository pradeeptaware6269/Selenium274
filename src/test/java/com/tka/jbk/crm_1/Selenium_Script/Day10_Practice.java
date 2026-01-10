package com.tka.jbk.crm_1.Selenium_Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_Practice {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Get all checkbox inputs
		List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox']"));

		// Iterate and click only Sunday and Monday
		for (WebElement day : days) {
			String value = day.getAttribute("value"); // Sunday, Monday, etc.

			if ((value.equalsIgnoreCase("Sunday") || value.equalsIgnoreCase("Monday"))) {
				continue;
			}
			day.click();
		}
	}
}
