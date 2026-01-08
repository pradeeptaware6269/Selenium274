package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_practice {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		// First Name
		driver.findElement(By.id("firstName")).sendKeys("Pradeep");

		// Last Name
		driver.findElement(By.id("lastName")).sendKeys("Taware");

		// Email
		driver.findElement(By.id("userEmail"))
		      .sendKeys("pradeeptaware0223@gmail.com");

		// Gender
		driver.findElement(By.xpath("//label[text()='Male']")).click();

		// Mobile Number
		driver.findElement(By.id("userNumber")).sendKeys("8421563585");

		// Date of Birth
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		dob.sendKeys(Keys.CONTROL + "a");
		dob.sendKeys(Keys.DELETE);
		dob.sendKeys("15 Aug 2000");
		dob.sendKeys(Keys.ENTER);   

		// Subjects
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		subject.sendKeys("Physics");
		subject.sendKeys(Keys.ENTER);  

		// Hobbies
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
	}
}
