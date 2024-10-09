package testnglearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExampleAutomate {

	WebDriver driver;
	long currentTime;
	long endTime;
	@BeforeSuite
	public void OpenBrowser() {
		currentTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");
		driver = new ChromeDriver();

	}

	@Test
	public void OpenGoogle() {

		driver.get("https://www.google.com/");

	}

	@Test
	public void OpenYoutube() {

		driver.get("https://www.youtube.com/");

	}

	@Test
	public void OpenInstagram() {
		driver.get("https://www.instagram.com/");

	}
	@AfterSuite
	public void closeBrowser() {
		endTime = System.currentTimeMillis();
		long totalTime = endTime - currentTime;
		System.out.println("Total Time Taken" + totalTime);
		driver.quit();
	}
}
