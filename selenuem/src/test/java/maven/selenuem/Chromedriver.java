package maven.selenuem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chromedriver {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", 
			//	"D:\\TES-programe\\Auto-sele\\chromedriver.exe");
		
	
		String chrompath = System.getProperty("user.dir")+"\\resources\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", chrompath);
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://play.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'gb_70\']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("abdou.abdou.mohamed92@gmail.com");
		//WebDriverWait wait=new WebDriverWait(driver, 20);  
	driver.findElement(By.id("identifierNext")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
	driver.findElement(By.name("password")).sendKeys("141219921412199214121992",Keys.ENTER);
		//WebDriverWait wait=new WebDriverWait(driver, 20); 
	 driver.manage().timeouts().implicitlyWait(100 , TimeUnit.SECONDS); 
	
	
	
	
	 driver.findElement(By.xpath("//*[@id=\'gbqfq\']")).sendKeys("elmenus",Keys.ENTER);
	 driver.manage().timeouts().implicitlyWait(100 , TimeUnit.SECONDS); 
	// driver.navigate().to(driver.findElement(By.linkText("elmenus.com")).getAttribute("href"));
	 driver.findElement(By.linkText("elmenus.com")).click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	 driver.findElement(By.xpath("//*[@id=\'fcxH9b\']/div[4]/c-wiz/div/div[2]/c-wiz/c-wiz/c-wiz/div/div[2]/div/c-wiz/div/div/div[1]/div/div/a")).click();
	 
	
	// driver.findElement(By.xpath("//*[@id=\'gb\']/div[1]/div[1]/div/div[3]/div[1]/a/span")).click();
	//*[@id="gb"]/div[1]/div[1]/div/div[3]/div[1]/a/span
	// driver.findElement(By.className("div.gb_ya.gbii")).click();
	// WebDriverWait wait=new WebDriverWait(driver,100);
	driver.findElement(By.cssSelector("button.LkLjZd.ScJHi.HPiPcc.id-track-click ")).click();
	//driver.findElement(By.xpath("/html/body/div[9]/div[1]/div/div/div/div[1]/div/div/div[3]/div/div[2]/div[2]/div[4]/div/div/div[1]/div[3]/button[5]")).click();
	driver.findElement(By.className("write-review-comment-container")).sendKeys("100");
	// driver.findElement(By.xpath("//*[@id=\'gb\']/div[1]/div[1]/div/div[3]/div[1]/a/span")).click();
	// driver.findElement(By.id("gb_71")).click(); 
	


	}

}
