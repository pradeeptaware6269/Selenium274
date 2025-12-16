package com.tka.jbk.crm_1.Selenium_Script;

// Here we are exploring the --- getTitle() ----  method 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_getTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		//maximize the web application page
		driver.manage().window().maximize();
		
		String titleName=driver.getTitle();
		System.out.println("The Title name of the Current page is :"+titleName);
	}
}