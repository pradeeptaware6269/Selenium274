package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Here we are exploring --findElement()-- method

public class Day4_findElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		// USERNAME
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("pradeeptaware6269@gmail.com");
		
		//PASSWORD
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Pass@123");
		
		driver.close();
		
		
	}

}
