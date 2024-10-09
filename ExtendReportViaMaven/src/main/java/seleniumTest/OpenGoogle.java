package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpenGoogle {

	public static void main(String[] args) {
		ExtentHtmlReporter report=new  ExtentHtmlReporter("report.html");
		ExtentReports exreport =new ExtentReports();
		exreport.attachReporter(report);
		ExtentTest test=exreport.createTest("WhatsupDuck");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		checkbox.click();
		driver.quit();
		exreport.flush();
		 
	}

}
