package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_Xpath_Axes_method {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Name
        WebElement firstname = driver.findElement(By.xpath("//input[@id='name']"));
        firstname.sendKeys("Pradeep");

        // Email
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("pradeeptaware@gmail.com");

        // Phone
        WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
        phone.sendKeys("9876543210");

        // Address
        WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));
        address.sendKeys("Baramati");
    }
}
