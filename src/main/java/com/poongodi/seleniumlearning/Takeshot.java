package com.poongodi.seleniumlearning;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takeshot {
	public static void takeShot(WebDriver driver) {
		TakesScreenshot s = (TakesScreenshot) driver;
		File file = s.getScreenshotAs(OutputType.FILE);
		String myPath = "D:\\screenshots";
		try {
			Files.copy(file.toPath(),Path.of(myPath,"butterfly.jpg"),StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
