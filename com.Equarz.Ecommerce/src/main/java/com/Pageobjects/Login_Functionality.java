package com.Pageobjects;



	import javax.swing.JOptionPane;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.Homepage;
	import com.base.Testbase;

	public class Login_Functionality extends Testbase {
		@FindBy(id="si-email")
		WebElement user;
		@FindBy(id="si-password")
		WebElement pass;
		//String str=JOptionPane.showInputDialog("Enter captcha");
		//@FindBy(xpath="//input[@name='default_captcha_value']")
		//WebElement element;
		@FindBy(xpath="//button[text()='Sign in']")
		WebElement signinbtn;
		public Login_Functionality(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public Homepage validateLogin() throws InterruptedException
		{
			user.sendKeys(props.getProperty("username"));
			pass.sendKeys(props.getProperty("password"));
			Thread.sleep(10000);
			
			//element.sendKeys(str);
			signinbtn.click();
			
			return new Homepage();
			
		}
		
		
		
		
		
		

		

		
	}


