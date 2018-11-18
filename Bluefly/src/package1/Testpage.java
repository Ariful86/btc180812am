package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testpage {
	
	ChromeDriver dr;
	
	
	Testpage(ChromeDriver dr){
	
	this.dr=dr;
	}
	void BootsBuy() throws InterruptedException {
		Utility ut=new Utility(dr);
		Thread.sleep(200);
		ut.mousehoverxp("//span[text()='Women']");
		Thread.sleep(200);
		ut.clickxpath("html/body/div[2]/div[2]/div/div[2]/div/nav/ul/li[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/a/span");
		Thread.sleep(200);
		ut.clickby(By.xpath("html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[1]/div/div[1]/a/span/span/img"));
		Thread.sleep(200);
		ut.clickxpath("html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[2]/ul/li[2]");
		Thread.sleep(200);
		String p1=ut.getText("html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[2]/button");
		Thread.sleep(200);
		ut.clickby(By.xpath("html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[1]/div/input"));
		Thread.sleep(200);
		String p2=ut.getText(By.xpath("//div[@class='amount price-container']/span/spa/[text('$549.99']"));
		Thread.sleep(200);
		ut.clickxpath("//button[@id='top-cart-btn-checkout']");
		Thread.sleep(200);
		
		if(p1.equals(p2)) {
			System.out.println("test  case fail");
			
		}
		else {
			System.out.println("test  case pass");
			
			
		}
	}

	
	

}
