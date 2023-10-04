package seleniummodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingPractice {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
//		WebElement a = driver.findElement(By.xpath("//input[@id='alertbtn']"));
//		a.click();
//		
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		
		WebElement a = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		a.click();
		
		
		 System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().dismiss();
		 
		 // first click on particular element 
		 //then used driver.switchTo().alert().accept();
	}
}
