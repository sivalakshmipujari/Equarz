package com.Equarz.Testcases;
	import java.sql.Driver;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Searchtocart{
	Searchtocart pf1;
		
		public Searchtocart()
		{
				
			super();
		}
		@BeforeMethod
		public void initialize()
		{
			
			Setup();
			pf1=new Searchtocart(Driver);
			
		}
		private void Setup() {
			// TODO Auto-generated method stub
			
		}
		@Test
		public void verifyurl() throws InterruptedException
		{
			 pf1.validateProduct();
			String url=Driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/product/hp-laptop-15-amd-ryzen-3-7320u-156-inch396cm-fhd-micro-edge-laptop8gb-ram512gb-ssdamd-radeon-graphicsdual-speakersalexan", url);
		}
		
		
		@AfterMethod
		public void teardown()
		{
			//driver.close();
		}


	}


