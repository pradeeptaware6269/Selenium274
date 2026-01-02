package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_Task_2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        
        driver.manage().window().maximize();

        // Click on Text Box
        WebElement textBox = driver.findElement(By.xpath("//*[@id='item-0']/span"));
        textBox.click();

        // Enter Name
        WebElement name = driver.findElement(By.id("userName"));
        name.sendKeys("Taware Pradeep Ramesh");

        // Enter Email
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("pradeeptaware655@gmail.com");

        // Enter Current Address
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("Baramati 413116");

        // Enter Permanent Address
        WebElement pAdd = driver.findElement(By.id("permanentAddress"));
        pAdd.sendKeys("Baramati Pune 413116");

        // Click Submit
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        driver.quit();
    }
}
