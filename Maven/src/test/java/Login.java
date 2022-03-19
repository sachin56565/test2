import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 
public class Login {
 WebDriver driver ;
  @BeforeTest
 public void Orangehrmlogin() throws Exception
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Desktop\\selenium with java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); 
 }
@Test(priority=1)
 public void Addcredentials() throws Exception
 {
	 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	   Thread.sleep(3000);
	  
	   driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	   Thread.sleep(3000);
	 
	   driver.findElement(By.xpath("//input[@name='Submit']")).click();
	 Thread.sleep(3000);
	
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	Thread.sleep(3000);
}
@Test(priority=2)
public void Adminuser() throws Exception
{
driver.findElement(By.id("menu_admin_UserManagement")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
Thread.sleep(3000);
}
public void Admindetails() throws Exception
{
	driver.findElement(By.xpath("//input[@name='systemUser[userType]'")).click();
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//select[@name='systemUser[userType]'"));
	
}
}







