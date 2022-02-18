package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRegistration {
	WebDriver driver;

	public LoginRegistration(WebDriver driver) {
		this.driver = driver;
	}

	public void creataccount(String email) {
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);

		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

	}

	public void signin(String email) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);

		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456abc");

		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}

}
