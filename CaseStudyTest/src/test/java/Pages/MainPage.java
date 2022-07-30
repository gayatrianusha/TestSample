package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBaseFinal;

public class MainPage extends TestBaseFinal {

	@FindBy(id="login2")
	WebElement loginlink;
	
	@FindBy(id="loginusername")
	WebElement username;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginbutton;
	
	@FindBy(className="card-img-top")
	WebElement test;
	
	@FindBy(css="a.btn.btn-success.btn-lg")
	WebElement cart;
	
public MainPage() {
		
		PageFactory.initElements(driver, this);
	}

public void navigateToLogin() 
{
	loginlink.click();
	username.sendKeys("gayatrisajja");
	password.sendKeys("gayatrisajja");
	loginbutton.click();
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOf(test));
	test.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	wait.until(ExpectedConditions.visibilityOf(cart));
	cart.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	
	driver.switchTo().alert().accept();
	
	
}
	
	
}
