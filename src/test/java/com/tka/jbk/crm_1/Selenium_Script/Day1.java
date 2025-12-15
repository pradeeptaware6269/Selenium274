package com.tka.jbk.crm_1.Selenium_Script;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Day1 {
	public static void main(String[] args) {
		System.out.println("Welcome to selenim module");
		//open chrome browser
		//ChromeDriver driver=new ChromeDriver();
		
		//fire fox browser
		//FirefoxDriver driver=new FirefoxDriver();
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://github.com/pradeeptaware6269/Selenium274/blob/main/src/test/java/com/tka/jbk/crm_1/Selenium_Script/Day1.javal");
	}

}
