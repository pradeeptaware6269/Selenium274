package com.tka.jbk.crm_1.Selenium_Script;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

    public static void main(String[] args) {

        // Launch Chrome Browser
        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Apply implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open URL
        driver.get("https://github.com/pradeeptaware6269/Selenium274/blob/main/src/test/java/com/tka/jbk/crm_1/Selenium_Script/Day1.java");

        // Get and print page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Get and print current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Simple validation
        if (title.contains("GitHub")) {
            System.out.println("Test Passed: GitHub page opened successfully");
        } else {
            System.out.println("Test Failed: Incorrect page opened");
        }

        // Close browser
        driver.quit();
    }
}
