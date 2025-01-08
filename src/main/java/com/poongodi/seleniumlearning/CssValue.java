package com.poongodi.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {
	
	public static void findElementProperties(WebDriver driver,WebElement element) {
		String[] cssProperties = {"background-color","border-color","border-radius","border-width","font-weight","height","max-width","padding-left"};
		for(String property : cssProperties) {
			System.out.println(property+" : "+element.getCssValue(property));
		}
		
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://oceanacademy.co.in/");
		driver.manage().window().maximize();
		WebElement contact = driver.findElement(By.linkText("Contact Us"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contact.click();
		WebElement enquiry = driver.findElement(By.name("enquiryFor"));
		WebElement fullName = driver.findElement(By.name("fullName"));
		findElementProperties(driver,enquiry);
		System.out.println("-----------------------------------------");
		System.out.println("Properties of Name:");
		findElementProperties(driver, fullName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
