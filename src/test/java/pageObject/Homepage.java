package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	public void signinclick() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
	}
	
	
}
