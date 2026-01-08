package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Relative_Xpath {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// open the url on the chrome broweser
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		// Here we are just using the Relative Xpath

		// Using the Relative xpath we can find the username field
		WebElement username = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		username.sendKeys("pradeeptaware0232");

		// Using the Relative xpath we can find the password field
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("Pass@123");

		// Using the Relative xpath we can find the Submit button
		WebElement submit_button = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		submit_button.click();

		driver.quit();
	}

}
