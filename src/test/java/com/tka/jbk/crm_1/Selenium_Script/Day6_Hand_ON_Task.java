package com.tka.jbk.crm_1.Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_Hand_ON_Task {
	public static void main(String[] args) {
		// Validation of the Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// 1. When we move the cursor over the ‘Gmail’ word, the link becomes visible
		// and
		// navigates to the landing section.

		WebElement gmailtext = driver.findElement(By.linkText("Gmail"));
		boolean isstatus = gmailtext.isDisplayed();
		if (isstatus) {
			System.out.println("Gmail Link is Displayed in the landing section ' Pass '");
		} else {
			System.out.println("Gmail Link is Not Displayed in the landing section ' Fail '");
		}

		// 2. When we move the cursor over the ‘image’ word, the link becomes visible
		// and
		// navigates to the landing section.

		WebElement imageText = driver.findElement(By.linkText("Images"));
		boolean isDisplay = imageText.isDisplayed();
		if (isDisplay) {
			System.out.println("Images Link is Displayed in the landing section ' Pass '");
		} else {
			System.out.println("Images Link is Not Displayed in the landing section ' Fail '");
		}

		// 3. check the Google Text area
		/*
		 * WebElement textArea = driver.findElement(By.name("q"));
		 * textArea.sendKeys("https://www.youtube.com"); textArea.sendKeys(Keys.ENTER);
		 * 
		 * 
		 * String actualUrl=driver.getTitle(); String expecteUrl=
		 * "https://www.google.com/sorry/index?continue=https://www.google.com/search%3Fq%3Dhttps%253A%252F%252Fwww.youtube.com%26sca_esv%3Dcedc331ac025ea34%26source%3Dhp%26ei%3Dyd5CaaKkKKqMseMPmqnT6Ao%26iflsig%3DAOw8s4IAAAAAaULs2Y0j4vVThK4tFK5cViamjn-IZLoM%26ved%3D0ahUKEwjirOLficWRAxUqRmwGHZrUFK0Q4dUDCBU%26uact%3D5%26oq%3Dhttps%253A%252F%252Fwww.youtube.com%26gs_lp%3DEgdnd3Mtd2l6IhdodHRwczovL3d3dy55b3V0dWJlLmNvbUg0UABYH3AAeACQAQCYAQCgAQCqAQC4AQPIAQD4AQGYAgCgAgCYAwCSBwCgBwCyBwC4BwDCBwDIBwCACAA%26sclient%3Dgws-wiz%26sei%3DzN5CadDHDMbi2roP9bbYwA0&q=EhAkAUkArTnKHqBCE3zRTg7qGMy9i8oGIjAHLe02NhVN8G4aNutyOD91_KvWzSvt04S5jeL1gb7xCgD3vPDLpa3o3niJ5ovroOIyAVJaAUM";
		 * if(actualUrl.equals(expecteUrl)) { WebElement
		 * click=driver.findElement(By.xpath("//*[@id=\'recaptcha-anchor\']/div[1]"));
		 * click.click(); click.sendKeys(Keys.ENTER); } else {
		 * 
		 * }
		 * 
		 * //4. Validation of the i am filling lucky button
		 * 
		 * WebElement btn1=driver.findElement(By.xpath(
		 * "/html/body/div[2]/div[4]/form/div[1]/div[1]/div[3]/center/input[2]"));
		 * btn1.click(); WebElement btn2=driver.findElement(By.xpath(
		 * "//*[@id=\'section-4\']/div/div/div/div/form/button/svg/use")); btn2.click();
		 *
		 * 
		 */

		// 5. When we move the cursor over the ‘Abut’ word, the link becomes visible and
		// navigates to the landing section.

		WebElement abouttext = driver.findElement(By.linkText("About"));
		boolean isDis1 = abouttext.isDisplayed();
		if (isDis1) {
			System.out.println("About Link is Displayed in the landing section ' Pass '");
		} else {
			System.out.println("About Link is Not Displayed in the landing section ' Fail '");
		}

		// 6. When we move the cursor over the ‘Store’ word, the link becomes visible
		// and
		// navigates to the landing section.

		WebElement storeText = driver.findElement(By.linkText("Images"));
		boolean isDis2 = imageText.isDisplayed();
		if (isDis2) {
			System.out.println("Store Link is Displayed in the landing section ' Pass '");
		} else {
			System.out.println("Store Link is Not Displayed in the landing section ' Fail '");
		}

		// 7. Sign up

		WebElement signup = driver.findElement(By.cssSelector("#gb > div.gb_z > a"));
		signup.click();

		WebElement username = driver.findElement(By.xpath("//*[@id=\'identifierId\']"));
		username.sendKeys("Pradeeptaware3656@gmail.com");
		WebElement btn3 = driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button"));
		btn3.click();
		String aUrl = driver.getCurrentUrl();
		String eUrl = "https://accounts.google.com/v3/signin/rejected?continue=https%3A%2F%2Fwww.google.com%2F&dsh=S252946494%3A1765991432090301&ec=futura_exp_og_so_72776762_e&epd=AVjW12QR0q5IYv2F_MLVqskEzhc-qjjWS83XvYhT-LpmVWCsjaDRbbqbFQ&flowEntry=ServiceLogin&flowName=GlifWebSignIn&hl=en&idnf=pradeeptaware3656%40gmail.com&ifkv=Ac2yZaXv1e41i2MS32YDY3vkVbE5o-bNp895uXeJJLn9h6Gf1U-rbx-7kRa_AKJxo32sJVmOqxIT&rhlk=le&rrk=46";
		if (aUrl.equals(eUrl)) {
			System.out.println("Test Case Pass 'With passing invalide data '");
		} else {
			System.out.println("Test Case Fail 'With Passing inValide Data");
		}
	}

}
