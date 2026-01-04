package com.Practice_TKA_JBK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_verify_the_page_title {

	/*
	 * -------------------------------------------------- Test Case ID : TC_12 Test
	 * Case Name : Verify LinkedIn Login Page Title Application : LinkedIn Module :
	 * Login Page Test Type : Functional Testing
	 * 
	 * Test Steps: 1. Open Chrome browser 2. Navigate to LinkedIn login page 3. Get
	 * page title 4. Verify title contains "LinkedIn"
	 * 
	 * Expected Result: - Page title should contain "LinkedIn"
	 * --------------------------------------------------
	 */
	public static void main(String[] args) {

		System.out.println("Test case ID : TC_12");
		System.out.println("Test case name : Verify Linkedin  login page title");

		// step 1 : open the chrome browser
		WebDriver driver = new ChromeDriver();

		// step 2 : Navigate to LinkedIn login page

		driver.get("https://www.linkedin.com/login");

		// step 3 : Get a page Title
		String actualTitle = driver.getTitle();

		// step 4 : Verify title contains "LinkedIn"
		if (actualTitle.contains("LinkedIn")) {
			System.out.println("Test Case Passed : Expected result And Actual Result Both are Matched Here ");
		} else {
			System.out.println("Test Case Failed :  Expected Result And Actual Result Both are MisMatched Here ");
		}

		driver.quit();

	}

}
