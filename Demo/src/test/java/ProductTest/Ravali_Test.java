package ProductTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ravali_Test {

	@Test
	public void Task1()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Reporter.log("Step 1: Browser launched Successfull",true);

		//login to page
		driver.findElement(By.xpath("//input[@id ='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id ='login-button']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Step 2: Login Successfull",true);
		//added first product
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		
		Reporter.log("Step 3: Product added Successfull",true);
		
		Reporter.log("Step 4 : execution completed",true);
		
		driver.close();
	}
}
