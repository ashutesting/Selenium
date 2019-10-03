package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonException;

public class ScrollPage 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/AshishSoni/Documents/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement element= driver.findElement(By.xpath("//strong[contains(text(),'Scenario 1: To scroll down the web page by pixel.')]"));
		//element.click();
		
		//Here scrollIntoView() javascript method is used to scroll page until web element not found
	    //js.executeScript("arguments[0].scrollIntoView();", element);
		
		//scrollBy() JSMethod is used to scroll the page
		//js.executeScript("window.scrollBy(0,1000)");
		
		
		//Method scrollTo() used to scroll till the end of the page
		//document.body.scrollHeight" returns the complete height of the body i.e web page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight");
		//driver.close();
		
	}

}
