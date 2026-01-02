package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_Task_1 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.in/");

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("student");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("password");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\'form\']/div[3]/button"));
		submit.click();

		String expected_URl = "https://javabykiran.com/jbkcrm/admin/login";
		String actual_Url = driver.getCurrentUrl();

		if (expected_URl.equals(actual_Url)) {
			System.out.println("Login Successful - Test Cases Are passed  ");
		} else {
			System.out.println("Login Failed - Test Cases Are Failed  ");
		}
		driver.quit();

	}
}
