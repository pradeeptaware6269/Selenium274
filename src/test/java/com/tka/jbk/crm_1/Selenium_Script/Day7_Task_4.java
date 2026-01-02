package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_Task_4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();

		WebElement web_buttton = driver.findElement(By.xpath("//*[@id=\'item-3\']/span"));
		web_buttton.click();

		WebElement add = driver.findElement(By.id("addNewRecordButton"));
		add.click();

		WebElement first_name = driver.findElement(By.id("firstName"));
		first_name.sendKeys("pradeep");

		WebElement last_name = driver.findElement(By.id("lastName"));
		last_name.sendKeys("taware");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("pradeeptaware65@gmail.com");

		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("21");

		WebElement salary = driver.findElement(By.id("salary"));
		salary.sendKeys("23000");

		WebElement dep = driver.findElement(By.id("department"));
		dep.sendKeys("Computer");

		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();

		driver.quit();
	}
}
