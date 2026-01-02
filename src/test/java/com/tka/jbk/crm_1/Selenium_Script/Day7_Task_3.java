package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_Task_3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();

        // Click on Check Box menu
        WebElement checkBox = driver.findElement(By.xpath("//*[@id='item-1']/span"));
        checkBox.click();

        // Expand Home
        WebElement homeExpand = driver.findElement(By.xpath("//button[@title='Toggle']"));
        homeExpand.click();

        // Click Home checkbox
        WebElement homeCheckbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        homeCheckbox.click();

        driver.quit();
    }
}
