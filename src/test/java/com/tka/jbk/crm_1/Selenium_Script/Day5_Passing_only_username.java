package com.tka.jbk.crm_1.Selenium_Script;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_Passing_only_username {
	
		// Here we are Passing the Passing username only & Empty Password
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();

			WebElement userName = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[1]/div[1]/div/label/input"));
			userName.sendKeys("pradeeptaware6258");
			WebElement password = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[1]/div[2]/div/label/input"));
			password.sendKeys("");

			WebElement loginButton = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[1]/div[3]"));
			loginButton.click();

			String expectedTitle = "Welcome to the Instagram";
			String actualTitla = driver.getTitle();

			if (expectedTitle.equals(actualTitla)) {
				System.out.println("Test Case PASS ");

				String expectedurl = "https://www.instagram.com/accounts/login/?hl=en";

				String actualurl = driver.getCurrentUrl();

				if (!actualTitla.equals(expectedurl)) {
					System.out.println("Test Case Pass");
				} else {
					System.out.println("Test Case Fail");
				}
			} else {
				System.out.println("Test Case FAIL");
			}
			driver.quit();
		}
	}
