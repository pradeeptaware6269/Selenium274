package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_Landing_page_Validation {
	public static void main(String[] args) {

		// here we need to check the validation of the langing page
		// In that we are check the login url is visible or not

		// first test case login URl
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.in/other/CC/");

		System.out.println("--- Validation of the LOGIN URL ---");
		WebElement loginUrl = driver.findElement(By.linkText("Login"));
		boolean isdisplay = loginUrl.isDisplayed();
		if (isdisplay) {
			System.out.println("Login Url is Displayped ---- 'TEST CASE IS PASSED'----");

		} else {
			System.out.println("Login Url is Not Displayed -----'TEST CASE IS FAILED'----");
		}
		System.out.println("--------------------------------------------------");

		// 2nd Test case register Url
		System.out.println("--- Validation of the REGISTER URL ---");
		WebElement registerUrl = driver.findElement(By.linkText("Register"));
		boolean isDiplay1 = registerUrl.isDisplayed();
		if (isDiplay1) {

			System.out.println("Registration Url is Displayped ---- 'TEST CASE IS PASSED'----");

		} else {
			System.out.println("Registration Url is Not Displayed -----'TEST CASE IS FAILED'----");
		}
		System.out.println("--------------------------------------------------");

		// 3rd test case
		System.out.println("---Valifdation of the Search Text ----");

		WebElement searchTxt = driver.findElement(By.name("search[keywords]"));
		boolean isEnable = searchTxt.isEnabled();
		boolean istrue = false;
		if (isEnable) {
			istrue = true;
			searchTxt.sendKeys("Realme mobile Phone");

			WebElement button = driver
					.findElement(By.xpath("//*[@id=\'top_header\']/div[2]/div[2]/div/div/form/div/div[2]/button"));
			button.click();
			istrue = true;
		} else {
			System.out.println("Search test is Not Enabled-----'TEST CASE IS FAILED'----");
		}
		if (istrue) {
			System.out.println("TEST CASE IS PASSED ");
		} else {
			System.out.println("TEST CASE IS FAILED ");
		}
		driver.quit();
		System.out.println("--------------------------------------------------");

		// 4th test case
		// check whether the advenced search text is clicable or not
		/*
		 * WebElement advacedSearch =
		 * driver.findElement(By.partialLinkText("Advanced Sear"));
		 * advacedSearch.click(); String actualTitle = driver.getTitle(); String
		 * expectedTitle = "Advanced Search"; if (actualTitle.equals(expectedTitle)) {
		 * System.out.println("Advanced Search --- 'TEST CASE IS PASSED' ---");
		 * 
		 * } else {
		 * System.out.println("Advanced Search !! ---- 'TEST CASE IS FAILED' ---"); }
		 */
	}

}
