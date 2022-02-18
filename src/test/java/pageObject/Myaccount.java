package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Myaccount {
	WebDriver driver;
	public Myaccount(WebDriver driver) {
		this.driver=driver;
	}
	public void signout() {
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).click();
		
	}
	
	public void dresstype_casualdress() {
		WebElement hover= driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"));

        Actions action=new Actions(driver);
        action.clickAndHold(hover).build().perform();
       
         driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
		
	}
	
	public void tshirt() {
		driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")).click();
		
	}
	
	public void cart() {
		WebElement hover1=driver.findElement(By.xpath("//b[contains(text(),'Cart')]"));
		Actions action=new Actions(driver);
		action.clickAndHold(hover1).build().perform();
		
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]/span[1]")).click();
		
		
	}
	
	
	
}
