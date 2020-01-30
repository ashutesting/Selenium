package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.ActiveXObjectImpl;

public class Action_Class 
{
	WebDriver driver;
	@Test
	public void actiontest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/AshishSoni/Documents/Javalocalrepository/TestCAse1/Driver/chromedriver");
		driver=  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
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
		
		// DRAG AND DROP USING ACTION
		
	/*	driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement source= driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement target= driver.findElement(By.id("droppable"));
		Actions ac= new Actions(driver);
		Thread.sleep(5000);
		ac.dragAndDrop(source, target).perform();
		System.out.println("Item Dragged and Dropped to target location successfully");
	*/	
		//DRAG AND DROP USING OFFSET
	/*	driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		int xoffset1= source.getLocation().getX();
		int yoffset1= source.getLocation().getY();
		
		int xoffset2= target.getLocation().getX();
		int yoffset2= target.getLocation().getY();
		
		
		System.out.println("xoffset= " + xoffset2 + "yoffset =  " + yoffset2);
		
		int xoffset= (xoffset2- xoffset1);
		int yoffset= (yoffset2- yoffset1);
		System.out.println(xoffset);
		System.out.println(yoffset);
		
		Actions ac= new Actions(driver);
		ac.dragAndDropBy(source, xoffset, yoffset).perform();
		System.out.println("Dragged and dropped successfully");
	*/
		
		// MOUSE HOVER TEST
	 /*   driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		WebElement tut= driver.findElement(By.xpath("//span[contains(text(),'Tutorial')]"));
	    Actions ac= new Actions(driver);
	    ac.moveToElement(tut).perform();
	    System.out.println("Mouse over on tutotial successfully");
	    WebElement sub= driver.findElement(By.xpath("//nav[@class='navigation']//span[@class='menu-text'][contains(text(),'Web Automation Tools')]"));
	    ac.moveToElement(sub).build().perform();
		WebElement clickableelement= driver.findElement(By.xpath("//nav[@class='navigation']//span[@class='menu-text'][contains(text(),'TestNG Tutorial')]"));
		clickableelement.click();
		System.out.println("Mousehover handeled successfully");
		driver.close();
	*/
		
		// MOUSE HOVER USING OFFSET
		
	/*	driver.get("http://demoqa.com/slider/");
		driver.manage().window().maximize();
		WebElement slider= driver.findElement(By.id("slider"));
		Actions ac= new Actions(driver);
		ac.moveToElement(slider, 100, 0).perform();
		slider.click();
		System.out.println("Mouse hover using offset performed");
	*/
		
		//TOOLTIP in TITLE ATTRIBUTE
		
	/*	driver.get("http://demoqa.com/tooltip/");
		driver.manage().window().maximize();
		WebElement age= driver.findElement(By.id("age"));
		String tooltiptext= age.getAttribute("title");
		System.out.println("Tooltip text is :"+ tooltiptext);
		if(tooltiptext.equalsIgnoreCase("We ask for your age only for statistical purposes."))
		{
			System.out.println("Tooltip Text Matched with expected text");
		}
		else
		{
			System.out.println("Tooltip text not matched with expected text");
		}
	*/	
		
		//TOOLTIP USING ACTION CLASS
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
		WebElement tooltip= driver.findElement(By.id("tooltipDemo"));
		Actions ac= new Actions(driver);		
		ac.moveToElement(tooltip).perform();
		WebElement tiptext= driver.findElement(By.className("tooltiptext"));
		String tooltiptext= tiptext.getText();
		System.out.println(tooltiptext);
		
		if(tooltiptext.equalsIgnoreCase("We ask for your age only for statistical purposes."))
		{
			System.out.println("Text Matched");
		}
		else
		{
			System.out.println("Text not matched");
		}
		driver.close();
	}



	
}
