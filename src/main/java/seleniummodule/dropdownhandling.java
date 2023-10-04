package seleniummodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownhandling {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	 //driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	WebElement a =driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
	a.click();
	//WebElement b = driver.findElement(By.xpath(""
	}

}
