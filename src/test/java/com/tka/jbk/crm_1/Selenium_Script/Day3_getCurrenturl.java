package com.tka.jbk.crm_1.Selenium_Script;

//Here we are exploring the --getCurrentUrl()--- method 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_getCurrenturl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		//maximize the page 
		driver.manage().window().maximize();
		
		//Here we are printing the current url of the page
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
}
