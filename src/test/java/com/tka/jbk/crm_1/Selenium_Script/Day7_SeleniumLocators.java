package com.tka.jbk.crm_1.Selenium_Script;
/*
Pre-Condition:
- Login page URL is running and accessible.

Test Case Description:
1. Validate that the login page accepts only valid credentials.

Test Data:
- Username: student
- Password: Password123

Test Steps:
1. Open the Chrome browser.
2. Enter the application URL.
3. Enter a valid username in the username field.
4. Enter a valid password in the password field.
5. Click on the Submit button.

Expected Result:
- User should log in successfully.
- Title of the web page should be displayed correctly.
- URL of the web page should be correct.
- Welcome message should be displayed on the web page.

Actual Result:
- Login is working as expected.

Status:
- PASS
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_SeleniumLocators {

    public static void main(String[] pradeep) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        // Enter valid username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("student");

        // Enter valid password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Password123");

        // Click submit button
        WebElement button = driver.findElement(By.id("submit"));
        button.click();

       
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl();
        
        
        String actualTitle=driver.getTitle();
        String expecTitle="Welcome";

        
        if (expectedUrl.equals(actualUrl) && expecTitle.endsWith(actualTitle)) {
            System.out.println(" Login Successful - Test PASSED");
        } else {
            System.out.println(" Login Failed - Test FAILED");
        }
        
        driver.quit();
       
    }
}
