package maven.selenuem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TESTNGdemo {
	
ChromeDriver driver;
//FirefoxDriver driver ;


	@Test
	public void launLaunchBrowser  ()
	{
		String chrompath = System.getProperty("user.dir")+"\\resources\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", chrompath);
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://play.google.com/");
		driver.manage().window().maximize();
	}
	
//	//@Test
//	//public void SetURL  ()
////	{
//		driver.navigate().to("https://play.google.com/");
//		driver.manage().window().maximize();
//		
//	}
	@BeforeTest
	public void login  ()
	{
		driver.findElement(By.xpath("//*[@id=\'gb_70\']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("abdou.abdou.mohamed92@gmail.com");
		//WebDriverWait wait=new WebDriverWait(driver, 20);  
	driver.findElement(By.id("identifierNext")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
	driver.findElement(By.name("password")).sendKeys("141219921412199214121992",Keys.ENTER);
}
	
@Test
	public void Search ()
	{
	 driver.findElement(By.xpath("//*[@id=\'gbqfq\']")).sendKeys("elmenus",Keys.ENTER);
	 driver.manage().timeouts().implicitlyWait(100 , TimeUnit.SECONDS); 
	// driver.navigate().to(driver.findElement(By.linkText("elmenus.com")).getAttribute("href"));
	 driver.findElement(By.linkText("elmenus.com")).click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	 driver.findElement(By.xpath("//*[@id=\'fcxH9b\']/div[4]/c-wiz/div/div[2]/c-wiz/c-wiz/c-wiz/div/div[2]/div/c-wiz/div/div/div[1]/div/div/a")).click();
	}

@AfterTest
public void logout ()
{
	driver.findElement(By.xpath("//*[@id=\'gb\']/div[1]/div[1]/div/div[3]/div[1]/a/span")).click();
	 driver.findElement(By.id("gb_71")).click(); 
	 driver.quit();
}


}

