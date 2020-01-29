package ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class 
{
	WebDriver driver;
	@Test
	public void actiontest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/AshishSoni/Documents/Javalocalrepository/TestCAse1/Driver/chromedriver");
		driver=  new ChromeDriver();
		// RIGHT CLICK ACTION
		/*driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		Actions ac= new Actions(driver);
		WebElement rightclick= driver.findElement(By.xpath("//a[@id='international-mtchs-tab']"));
		ac.contextClick(rightclick).perform();
		System.out.println("Right click Performed");
		*/
		
		//DOUBLE CLICK 
	/*	driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
		Actions ac= new Actions(driver);
		WebElement doubleclick= driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(doubleclick).perform();
		System.out.println("Double Click Action Performed");
		driver.switchTo().alert().accept();
		System.out.println("Alert Handled successfully");
		driver.close();
	*/	
		
		// DRAG AND DROP ACTION
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement source= driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement target= driver.findElement(By.id("droppable"));
		Actions ac= new Actions(driver);
		Thread.sleep(5000);
		ac.dragAndDrop(source, target).perform();
		System.out.println("Item Dragged and Dropped to target location successfully");
		
	}



	
}
