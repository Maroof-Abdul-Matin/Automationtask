package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {
	WebDriver driver;

	public Payment(WebDriver driver) {
		this.driver = driver;
	}

	public void confirmorder() {
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"))
		.click();

		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"))
				.click();
		
		
		
		driver.findElement(By.xpath("//input[@id='cgv']")).click();

		driver.findElement(
				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"))
				.click();
		driver.findElement(
				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]"))
				.click();
		driver.findElement(
				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();

	}

}
