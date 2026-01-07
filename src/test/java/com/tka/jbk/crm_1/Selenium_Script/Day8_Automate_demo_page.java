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
		WebElement txtadd = driver
				.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea"));
		txtadd.sendKeys("sangvi Baramati 413115");

		// for email
		WebElement txtEmail = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		txtEmail.sendKeys("pradeep@gmail.com");

		// for Mobile Number
		WebElement txtNumber = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		txtNumber.sendKeys("1234569875");

		// for Redio Button
		WebElement txtRedio_button = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		txtRedio_button.click();

		// for checkbox
		WebElement txtCheckBox = driver.findElement(By.id("checkbox1"));
		txtCheckBox.click();

		// for checkbox
		WebElement txtCheckBox1 = driver.findElement(By.id("checkbox2"));
		txtCheckBox1.click();

		// for checkBox
		WebElement txtCheckBox2 = driver.findElement(By.id("checkbox3"));
		txtCheckBox2.click();

		// for home page
		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();

		WebElement enter_btn = driver.findElement(By.id("enterimg"));
		enter_btn.click();

		driver.quit();

	}

}
