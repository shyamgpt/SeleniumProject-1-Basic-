package MiscellaneousTopicsInSelenium;

import org.openqa.selenium.Proxy;

//import java.lang.reflect.Proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SettingProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		Proxy proxy1 = new Proxy();
		proxy1.setHttpProxy("ipaddress:444");
		//Ip addrees will provide by the support team Like -- Khalid Imam in Geekyants
		
		options.setCapability("proxy", proxy1);
		
		
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");

	}

}
