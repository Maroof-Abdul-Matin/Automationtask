package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.baseclass;
import pageObject.Casualdressselection;
import pageObject.Homepage;
import pageObject.LoginRegistration;
import pageObject.Myaccount;
import pageObject.Payment;
import pageObject.Registration;
import pageObject.Tshirt;

public class Registrationtest {
	baseclass base = new baseclass();
	WebDriver driver = base.setDriver();
	Homepage homepage = new Homepage(driver);
	LoginRegistration loginRegistration = new LoginRegistration(driver);
	Registration registration = new Registration(driver);
	Myaccount myaccount = new Myaccount(driver);
	Casualdressselection casualdressselection = new Casualdressselection(driver);
	Tshirt tshirt = new Tshirt(driver);
	Payment payment = new Payment(driver);

	String email1 = "abc12300a@xyz.com";
	String email2 = "xyz12300a@xyz.com";

	@Test(priority = 0)
	public void registrationcomplete() {

		homepage.signinclick();
		loginRegistration.creataccount(email1);
		registration.registration();
		myaccount.signout();
	}

	@Test(priority = 1)
	public void registrationcomplete2() {

		homepage.signinclick();
		loginRegistration.creataccount(email2);
		registration.registration();
		myaccount.signout();
	}

	@Test(priority = 2)
	public void login() {
		homepage.signinclick();
		loginRegistration.signin(email1);
		myaccount.dresstype_casualdress();
		casualdressselection.dressaddtocart();
		myaccount.tshirt();
		tshirt.shirtselect();
		myaccount.cart();
		payment.confirmorder();
		myaccount.signout();

	}

	@Test(priority = 3)
	public void login2() {
		homepage.signinclick();
		loginRegistration.signin(email2);
		myaccount.dresstype_casualdress();
		casualdressselection.dressaddtocart();
		myaccount.tshirt();
		tshirt.shirtselect();
		myaccount.cart();
		payment.confirmorder();
		myaccount.signout();
		

	}
}
