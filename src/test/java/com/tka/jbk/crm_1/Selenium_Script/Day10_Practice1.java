package com.tka.jbk.crm_1.Selenium_Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_Practice1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		List<WebElement> text = driver.findElements(By.xpath("//input[@type='text']"));
		for (WebElement txt : text) {
			txt.sendKeys("Pradeep");

		}

		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement txt : check) {
			txt.click();
		}

		List<WebElement> password = driver.findElements(By.xpath("//input[@type='password']"));
		for (WebElement pass : password) {
			pass.sendKeys("Pass@2231");
		}

		driver.quit();
	}
}
