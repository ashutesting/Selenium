package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Workbook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/AshishSoni/Documents/workspace/TestCAse1/Driver/geckodriver");
		WebDriver driver= new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "/Users/AshishSoni/Documents/chromedriver");
		//ChromeDriver driver= new ChromeDriver();
		driver.get("http://myworkbook.de/#/home");
		WebElement register= driver.findElement(By.cssSelector("a[href='#/register']"));
		register.click();
	}

}
