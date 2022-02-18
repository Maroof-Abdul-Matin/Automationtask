package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	WebDriver driver;

	public Registration(WebDriver driver) {
		this.driver = driver;
	}

	public void registration()
	{
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Maroof");
		
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Matin");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456abc");
		driver.findElement(By.xpath("//select[@id='days']")).click();
		
		Select title= new Select(driver.findElement(By.xpath("//select[@id='days']")));
		title.selectByValue("15");
		
		
		driver.findElement(By.xpath("//select[@id='months']")).click();
		Select title1=new Select(driver.findElement(By.xpath("//select[@id='months']")));
		title1.selectByValue("3");
		
		driver.findElement(By.xpath("//select[@id='years']")).click();
		Select title2=new Select(driver.findElement(By.xpath("//select[@id='years']")));
		title2.selectByValue("1980");
		
		
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("maroof");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("matin");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("m123456");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("abcgroup");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("1/2,dhaka,bangladesh");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("123Flat");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Dhaka");
		
		driver.findElement(By.xpath("//select[@id='id_state']")).click();
		
		Select title3=new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		title3.selectByValue("32");
		
		
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("92085");
		
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("AAABBBCCC");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("+1(213) 555-389)");
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("+1(213) 555-389)");
		
		
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Dhaka,Mirpur");
		
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		
		
	}
	

}
