package gridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void Gtest() throws MalformedURLException {
		DesiredCapabilities  db = new DesiredCapabilities();
		db.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.162.135:4444"),db);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		System.out.println("TITLE2: "+driver.getTitle());
		driver.quit();
		
	}

}
