package Auto2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/AshishSoni/Documents/Javalocalrepository/TestCAse1/Driver/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		//driver.close();
		Alert alert1= driver.switchTo().alert();
		//Print Alert Message
		System.out.println(alert1.getText());
		//accept() method used for accepting "OK" from alert
		//alert1.accept();
		
		//dismiss() method used for canceling alert message
		alert1.dismiss();
		
	}

}
