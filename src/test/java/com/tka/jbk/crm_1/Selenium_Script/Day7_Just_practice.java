package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_Just_practice {

	public static void main(String[] args) {

		// Step 1: Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Step 2: Open LinkedIn Login Page
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();

		// Step 3: Locate Username field using ID
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("testemail@gmail.com");

		// Step 4: Locate Password field using ID
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("testpassword");

		// Step 5: Locate Login Button using Class Name
		WebElement loginButton = driver.findElement(By.className("login__form_action_container"));
		loginButton.click();

		// Step 6: Simple validation (page title check)
		String title = driver.getTitle();
		if (title.contains("LinkedIn")) {
			System.out.println("LinkedIn Login Page Functionality Checked");
		} else {
			System.out.println("Login Page Not Working Properly");
		}

		// Step 7: Close Browser
		driver.quit();
	}
}
