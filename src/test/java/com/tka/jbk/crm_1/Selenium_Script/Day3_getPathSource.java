package com.tka.jbk.crm_1.Selenium_Script;

// Here we are exploring the --getPathSource() -- method

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_getPathSource {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		String source_code=driver.getPageSource();	
		System.out.println(source_code);
	}
}
