package seleniummodule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//input[@id='autosuggest']"));
		
		a.sendKeys("ind");
		
		Thread.sleep(1000);
		
		List<WebElement> b =driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement k:b) {
			if(k.getText().equalsIgnoreCase("india")) {
				k.click();
            break;
			}
		}
	}

}
