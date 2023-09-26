package com.Equarz.Testcases;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import com.base.Testbase;

	public class Bannertocart extends Testbase {
		

			Bannertocart pf1;
			
				
				 Bannertocart()
				{
						
					super();
				}
				@BeforeMethod
				public void initialize()
				{
					
					Setup();
					pf1=new Bannertocart ();
					
				}
				@Test
				public void verifyurl() throws InterruptedException
				{
					((Object) pf1).validateProduct14();
					String url=driver.getCurrentUrl();
					Assert.assertEquals("http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX", url);
				}
				
				
				@AfterMethod
				public void teardown()
				{
					//driver.close();
				}
			}






