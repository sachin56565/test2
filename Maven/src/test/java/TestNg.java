
	import java.util.concurrent.TimeUnit;

	import org.testng.annotations.Test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class  TestNg
	{
	WebDriver driver;

	public void applaunch1() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Desktop\\selenium with java\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	    @Test 
	public void Logininto() throws Exception
	{
	   driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	   Thread.sleep(3000);
	  
	   driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	   Thread.sleep(3000);
	 
	   driver.findElement(By.xpath("//input[@name='Submit']")).click();
	Thread.sleep(1000);
	}
	    
	}


