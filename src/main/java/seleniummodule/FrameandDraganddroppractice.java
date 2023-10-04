package seleniummodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameandDraganddroppractice {
	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement a =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(a);
		
		WebElement source =driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(1000);
		
		WebElement b =driver.findElement(By.xpath("//a[text()='Demos']"));
		
		b.click();
		
		//find element where frame is located webElement a 
		//used driver.switchTo().frame(a);
		//now our control is at inside frame
		//go back to parent frame we have to used driver.switchTo().parentFrame();	
		
		//Actions class 
		//Actions a = new Actions(driver);
		//suppose we have to do right click so we have find webElement for same webElement b
		//a.contextTo(b).build().perform();
	}

}
