package elm.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class elm {
	ChromeDriver driver;

	@BeforeTest
	public void launLaunchBrowser() {
		String chrompath = System.getProperty("user.dir") + "\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrompath);
		driver = new ChromeDriver();
		driver.navigate().to("https://play.google.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void login()

	{
		driver.findElement(By.xpath("//*[@id=\'gb_70\']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
		// WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("pass", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void Search() {
		driver.findElement(By.xpath("//*[@id=\'gbqfq\']")).sendKeys("elmenus", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.linkText("elmenus.com")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//*[@id=\'fcxH9b\']/div[4]/c-wiz/div/div[2]/c-wiz/c-wiz/c-wiz/div/div[2]/div/c-wiz/div/div/div[1]/div/div/a"))
				.click();
	}

	@Test(priority = 3)

	public void REVIEW() throws InterruptedException {
		driver.findElement(By.cssSelector("button.LkLjZd.ScJHi.HPiPcc.id-track-click ")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement guru99seleniumlink;
		guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//textarea[@class=\'review-input-text-box.write-review-comment\']")));
		guru99seleniumlink.sendKeys("1000");

	}

	@Test(priority = 2)
	public void logout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'gb\']/div[1]/div[1]/div/div[3]/div[1]/a/span")).click();
		driver.findElement(By.id("gb_71")).click();
	}
}
