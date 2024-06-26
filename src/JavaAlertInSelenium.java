import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaAlertInSelenium {

	@Test
	public static void handleAlerts() throws InterruptedException {
		
		String text = "Shyam";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
//		driver.findElement(By.id("name")).sendKeys("Shyam");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("Shyam Gupta");

		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		Thread.sleep(10000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

	}

}
