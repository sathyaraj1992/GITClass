package org.Anusuya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteExamble {
	WebDriver driver;
	long starttime;
	long endtime;

	@BeforeSuite
	private void launchBrowser() {
		starttime = System.currentTimeMillis();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	private void openGoogle() {
		driver.get("https://www.google.com/");
	}

	@Test
	private void openBing() {
		driver.get("https://www.bing.com/");
	}

	@Test
	private void openYahoo() {
		driver.get("https://in.search.yahoo.com/");
	}

	@AfterSuite
	private void quitBrowser() {
		//driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println(totaltime);

	}

}
