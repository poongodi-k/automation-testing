package com.poongodi.seleniumlearning;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pinterest.com/amcoley75/butterflies/");
		Takeshot.takeShot(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
