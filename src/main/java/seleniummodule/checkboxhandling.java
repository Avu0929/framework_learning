package seleniummodule;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxhandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
//		WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//		
//		a.click();
		
		List<WebElement> a = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
//		for(WebElement b:a) {
//			
//			b.click();
//		}
//		System.out.println(a.size());
	for(int i=0; i<a.size(); i++) {
//			a.get(i).click();
		
		Random rand = new Random();
		
		int n = rand.nextInt(3);
		
		System.out.println(n);
		
		a.get(n).click();
		
		
	}
	driver.quit();
		
		
		
	}

}
