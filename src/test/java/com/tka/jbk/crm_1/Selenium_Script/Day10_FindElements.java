package com.tka.jbk.crm_1.Selenium_Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_FindElements {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// here we are Navigating the FindElements
		List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox']/parent::div"));

		// here we are using foreach loop for the iteration
		for (WebElement Day : days) {
			Day.click();

		}

	}
}