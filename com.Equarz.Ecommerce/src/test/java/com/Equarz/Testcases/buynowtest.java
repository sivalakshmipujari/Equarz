package com.Equarz.Testcases;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import com.Pageobjects.Login_Functionality;
import com.Pageobjects.buynow_functionality;
import com.base.Testbase;

	public class buynowtest  extends Testbase {
		buynow_functionality bf;
		Login_Functionality lg;
	    
		public buynowtest() {
			super();
		}
		@BeforeMethod
		public void initialize() throws Throwable {
			
			
			Setup();
			lg= new Login_Functionality(driver);
			lg.Verifylogin();
			bf = new buynow_functionality(driver);
		}
		@Test
		public void Buynow() throws Throwable
		{
			 bf.cartBuynow ();
		}
		@Test
		public void Buynow1() throws Throwable
		{
			 bf.Directbuynow ();
		}
		@Test
		public void Buynow2() throws Throwable
		{
			 bf.Homecartbuynow ();
		
		}




}


