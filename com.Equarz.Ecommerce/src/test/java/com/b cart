package com.Equarz.Testcases;
	import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import com.base.Testbase;

	public class Bannertocart extends Testbase {
		

			Bannertocart pf1;
			private Bannertocart pf;
			
				
				 Bannertocart()
				{
						
					super();
				}
				
				@BeforeMethod
				public void initialize()
				{
					
					Setup();
					pf=new Bannertocart(Driver);					
				}
				@Test
				public void verifyurl() throws InterruptedException
				{
				 pf1.validateProduct14();
					String url=driver.getCurrentUrl();
					AssertJUnit.assertEquals("http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX", url);
				}
				
				
					
				
				@AfterMethod
				public void teardown()
				{
					//driver.close();
				}
			}






