package testnglearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuiteExampleManual {
//Aim:open chrome and go to
	// 1.google.co.in
	// 2.bing.com
	// 3.yahoo.com and then close the browser
	@Test
	public void OpenGoogle() {
		long currntTime = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
		long endTime = System.currentTimeMillis();
		long totalTime=endTime-currntTime;
		System.out.println("Total Time Taken" + totalTime);
	
	}
	@Test
	public void OpenYoutube() {
		long currntTime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.quit();
		
		long endTime = System.currentTimeMillis();
		long totalTime=endTime-currntTime;
		System.out.println("Total Time Taken" + totalTime);
	
	}
	@Test
	public void OpenInstagram() {
		long currntTime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
		
		long endTime = System.currentTimeMillis();
		long totalTime=endTime-currntTime;
	
		System.out.println("Total Time Taken" + totalTime);
	}

}
