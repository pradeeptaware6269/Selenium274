package com.Practice_TKA_JBK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
--------------------------------------------------
Test Case ID   : TC_10
Test Case Name : Verify Login with Empty Fields
Application   : LinkedIn
Module        : Login
Test Type     : Negative Testing

Preconditions:
- Chrome browser installed
- Internet connection available

Test Steps:
1. Open Chrome browser
2. Navigate to https://www.linkedin.com/login
3. Do not enter username
4. Do not enter password
5. Click on Sign in button

Expected Result:
- Validation message should be displayed
- Login should not be successful
--------------------------------------------------
*/

public class Task1_verify_Empty_Login_Attempt {

    public static void main(String[] args) {

        System.out.println("Executing Test Case : TC_10");

     
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      
        driver.get("https://www.linkedin.com/login");

        
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();

 
        WebElement errorMessage = driver.findElement(By.id("error-for-username"));

        if (errorMessage.isDisplayed()) {
            System.out.println("PASS : Validation message displayed. Login failed as expected.");
        } else {
            System.out.println("FAIL : Validation message not displayed.");
        }

      
        driver.quit();
    }
}
