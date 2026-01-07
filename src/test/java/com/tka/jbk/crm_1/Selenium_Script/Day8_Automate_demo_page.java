package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Automate_demo_page {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		// for first name
		WebElement txtfirstname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		txtfirstname.sendKeys("pradeep");

		// for last name
		WebElement txtlastname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		txtlastname.sendKeys("taware");
		
		// for adderess
		WebElement txtadd=driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea"));
		

	}

}
