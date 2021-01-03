package Maven_Selenium_Test.Maven_Selenium_Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit_Test {

	@Test
	public void test(){

		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chrome_driver\\chromedriver.exe");  
          
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
        // Launch Website  
        driver.navigate().to("https://app.nuvepos.com/");  
        driver.findElement(By.id("login-username")) .sendKeys("sam.om@nuvepos.com"); 
        driver.findElement(By.id("login-password")) .sendKeys("password"); 
        //driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();     
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	}
}
