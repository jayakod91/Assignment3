package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");	
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("leaf@123");
	     driver.findElement(By.xpath("//button[@type='login']")).click();
	     Thread.sleep(1000);
	     String PageTitle = driver.getTitle();
	     driver.findElement(By.linkText("Log Out")).click();
	     Thread.sleep(1000);
	     driver.quit();
	 }
	     
	     
	     
}