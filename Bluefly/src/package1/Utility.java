package package1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Utility {
	
	ChromeDriver dr;
	
	Utility(ChromeDriver dr){
		this.dr=dr;
	}
	void clickid(String value) {
		dr.findElement(By.id(value)).click();
	}
    void clickxpath(String value) {
    	dr.findElement(By.xpath(value)).click();
    }
    void clickby(By by) {
    	dr.findElement(by).click();
    }
    void mousehover(String value) {
    	Actions object=new Actions(dr);
    	object.moveToElement(dr.findElement(By.id(value))).perform();
    }
    void mousehoverxp(String value) {
    	Actions object=new Actions(dr);
    	object.moveToElement(dr.findElement(By.xpath(value))).perform();
    }
    String getText (By locator) {
    	String s= dr.findElement(locator).getText();
    	System.out.println(s);
    	return s;
    }
	public String getText(String e) {
		return e ;
		// TODO Auto-generated method stub
		
	}
	
}
