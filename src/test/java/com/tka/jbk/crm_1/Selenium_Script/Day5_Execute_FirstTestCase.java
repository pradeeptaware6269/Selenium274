package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Test Scenario :
1) to validate that login page should be accept only valid inputs

Pre-condition :
  user is in the login page

Test data:
  1)username: pradeeptaware6269@gmail.com
  2)password: Pass@123 

Test Steps:

  1) Open the Chrome browser  
  2) Open the URL 
  3) Enter valid username 
  4) enter valid password 
  5) click on login button  

Expected result: 
   user should redirect to the dashboard page and validate title, validate URL, and text should be "Welcome to the Instagram"
*/
public class Day5_Execute_FirstTestCase {
	public static void main(String[] args) {
		// Here we are using dynamic dispatch process for avoid some restrictions
		WebDriver driver = new ChromeDriver();
		// step no :1 & step no :2 open web application on the browser
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		// step no :3 Enter the valide username
		WebElement userName = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[1]/div[1]/div/label/input"));
		userName.sendKeys("pradeeptaware6269@gmail.com");

		// step no :4 Enter the valide password
		WebElement password = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[1]/div[2]/div/label/input"));
		password.sendKeys("Pass@123");

		// step no :5 click on login page
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[1]/div[3]"));
		loginButton.click();
		
		//quit from the website
		
		//Here we are checking the validation 
		//validate of the title
		String expectedTitle="Welcome to the Instagram";
		String actualTitla=driver.getTitle();
		
		if(expectedTitle.equals(actualTitla))
		{
			System.out.println("Test Case PASS ");
			
			//validation of the url
			String expectedurl="https://www.instagram.com/accounts/login/?hl=en";
			
			String actualurl=driver.getCurrentUrl();
			
			if(actualTitla.equals(expectedurl))
			{
				System.out.println("Test Case Pass");
			}
			else
			{
				System.out.println("Test Case Fail");
			}
		}
		else
		{
			System.out.println("Test Case FAIL");
		}
		driver.quit();
	}

}
