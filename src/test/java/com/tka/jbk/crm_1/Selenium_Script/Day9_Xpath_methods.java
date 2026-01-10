package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_Xpath_methods {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Relative XPath
		WebElement firstname = driver.findElement(By.xpath("//input[@id='name']"));
		firstname.sendKeys("Pradeep");

		// using contains()
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		email.sendKeys("pradeep@gmail.com");

		// using * instead of tagname
		WebElement phone = driver.findElement(By.xpath("//*[@id='phone']"));
		phone.sendKeys("8454216562");

		// using starts-with()
		WebElement address = driver.findElement(By.xpath("//textarea[starts-with(@id,'textarea')]"));
		address.sendKeys("Baramati Pune");

		// ends-with() is NOT supported in Selenium XPath 1.0

		// using the text method
		System.out.println(driver.findElement(By.xpath("//a[text()='Youtube']")).getText());

		// using multiple attributes with AND
		WebElement search = driver.findElement(
				By.xpath("//input[@class='wikipedia-search-input' and @id='Wikipedia1_wikipedia-search-input']"));
		search.sendKeys("Selenium");

		// using multiple attributes with OR (CORRECTED)
		WebElement searchButton = driver
				.findElement(By.xpath("//input[@class='wikipedia-search-button' or @type='submit']"));
		searchButton.click();

		// Using the xpath parent child
		WebElement youtubeLink = driver.findElement(By.xpath("//div[@class='widget-content']/a"));

		String text = youtubeLink.getText();
		System.out.println(text);

		// Using the xpath child Parent
		WebElement parentDiv = driver.findElement(By.xpath("//a[text()='Youtube']/parent::div"));

		System.out.println(parentDiv.getAttribute("class"));

		driver.quit();

	}
}
