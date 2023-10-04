package seleniummodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login.salesforce.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("avinash");
	driver.findElement(By.name("pw")).sendKeys("sh99");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}

}
