package seleniummodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class DataProviderPractice {
	
	
	@Test(dataProvider="testdata")
	public void login(String un, String pw) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		WebElement ab=driver.findElement(By.xpath("(//div[@class='loginError'])[2]"));
		
		String ActualText= ab.getText();
		
		System.out.println(ActualText);
		String ExpectedText="Please check your username. If you still can't log in, contact your Salesforce administrator.";
		
		SoftAssert a = new SoftAssert();
		
		a.assertTrue(ActualText.contains(ExpectedText),"msg is not displayed" );
		//a.assertEquals("ActualText","ExpectedText" ,"msg is not displayed");
		a.assertAll();
	}
	
	
	@DataProvider
	public Object[][] testdata(){
		
		Object[][] data = new Object[2][2];
		data[0][0]="Avinash123";
		data[0][1]="Jagtap123";
		data[1][0]="Kalpesh7";
		data[1][1]="patil0";
		return data;
		
	}

}
