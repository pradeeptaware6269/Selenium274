package com.Practice_TKA_JBK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_verify_forgot_Password {

    /*
    --------------------------------------------------
    Test Case ID   : TC_11
    Test Case Name : Verify Forgot Password Link
    Application   : LinkedIn
    Module        : Login
    Test Type     : Functional Testing

    Preconditions:
    - Chrome browser installed
    - Internet connection available

    Test Steps:
    1. Open Chrome browser
    2. Navigate to https://www.linkedin.com/login
    3. Click on "Forgot password?" link

    Expected Result:
    - User should be redirected to password recovery page
    --------------------------------------------------
    */

    public static void main(String[] args) {

        System.out.println("Test Case ID : TC_11");
        System.out.println("Test Case Name : Verify Forgot Password Link");

        // Step 1: Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Open LinkedIn Login Page
        driver.get("https://www.linkedin.com/login");

        // Step 3: Click Forgot Password link
        WebElement forgotButton = driver.findElement(By.id("reset-password-button"));
        forgotButton.click();

        // Step 4: Validate navigation using URL
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("request-password-reset")) {
            System.out.println("PASS : Forgot Password page displayed");
        } else {
            System.out.println("FAIL : Forgot Password page not displayed");
        }

        // Step 5: Close browser
        driver.quit();
    }
}
