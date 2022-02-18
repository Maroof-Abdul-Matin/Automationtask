package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Casualdressselection {
	WebDriver driver;

	public Casualdressselection(WebDriver driver) {
		this.driver = driver;
	}

	public void dressaddtocart() {

		WebElement hover = driver.findElement(By.xpath(
				"//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		Actions action = new Actions(driver);
		action.clickAndHold(hover).build().perform();
	
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")).click();
	}

}
