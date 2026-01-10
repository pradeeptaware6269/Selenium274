package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_css_Selector {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        // Using attribute CSS selector
        driver.findElement(
                By.cssSelector("input[placeholder='First Name']"))
                .sendKeys("Pradeep");

        // Using attribute CSS selector
        driver.findElement(
                By.cssSelector("input[placeholder='Last Name']"))
                .sendKeys("Taware");

        // # only for ID
        driver.findElement(By.cssSelector("#firstpassword")).sendKeys("123456");

        // . only for class (example: confirm password field)
        driver.findElement(By.cssSelector("#secondpassword")).sendKeys("123456");
    }
}
