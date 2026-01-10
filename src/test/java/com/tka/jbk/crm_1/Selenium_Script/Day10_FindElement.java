package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_FindElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//here we are Navigating the FindElement
		
		//first name
		WebElement firstname=driver.findElement(By.xpath("//input[@id='name']"));
		firstname.sendKeys("Pradeep");
		
		//Email
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("pradeeptaware@gmail.com");
		
		//phone
		WebElement phone=driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("8421452455");
		
		
		
		
		
	}

}
