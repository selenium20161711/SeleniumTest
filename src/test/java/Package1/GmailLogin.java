package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailLogin {
	public static WebDriver driver;
	@Test
	public void f1() throws InterruptedException {
		// login to Gmail
	 String URL="https://www.google.com/gmail/about/for-work/";
	 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\geckodriver.exe");
	 driver= new FirefoxDriver();
	 driver.get(URL);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("harsh198805");
	 
	
	 Thread.sleep(5000);
	 driver.close();
		}
	}
