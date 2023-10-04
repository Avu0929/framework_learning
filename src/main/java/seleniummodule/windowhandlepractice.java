package seleniummodule;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlepractice {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		Set<String> obj = driver.getWindowHandles();
		
		Iterator<String> itr = obj.iterator();
		
		
		
		String parentwindow =itr.next();
		String childwindow =itr.next();
		
		
		
		driver.switchTo().window(childwindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Access all our Courses']")).click();
		Thread.sleep(1000);
		driver.switchTo().window(parentwindow);
		//a[@id='opentab']
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		// window handle 
		
		//click on particular element 
		//then used Set<String> obj = driver.getwindowhandles();
		//then we have to used iterator class
		//Iterator<String> itr = obj.iterator();
		// then create String parentwindow = itr.next();
		// then create String childwindow = itr.next();
		//used driver.switchTo().window(childwindow);
	}

}
