package seleniummodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// webdriver -- interface 
		// chromedriver -- class
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.11.0");
		
		driver.manage().window().maximize();
		String a =driver.getCurrentUrl();
		System.out.println(a);
		
		String b = driver.getTitle();
		System.out.println(b);
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("www.google.com");
	}

}
