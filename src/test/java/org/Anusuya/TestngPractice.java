package org.Anusuya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngPractice {
	@Test
	private void sampleTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				driver.get("https://mvnrepository.com/");



	}

}
