package package1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
ChromeDriver dr;
	
	@Before
	 void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\minto\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https:www.bluefly.com");
		
		
}
	@After
	void close() throws InterruptedException {
		Thread.sleep(300);
		dr.quit();
	}
}
