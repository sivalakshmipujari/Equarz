package com.Equarz.Testcases;


	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.Pageobjects.Login_Functionality;
import com.Pageobjects.wishlist;
import com.base.Testbase;

	public class wishlisttest extends Testbase {
			
			wishlist wl;
			Login_Functionality lg;
			
			public wishlisttest() {
				super();
			}
			
			@BeforeMethod
			public void initialize() throws Throwable {
				
				Setup();
				lg= new Login_Functionality(driver);
				lg.Verifylogin();
				//lg.validateLogin(props.getProperty("username"),props.getProperty("password"));
				 wl = new wishlist(driver);
			}
			@Test
			public void categorywishlist() 
			{
				wl.categorylist();
			}
			@Test
			public void bannerwishlist() 
			{
				wl.bannerlist();
			}
			@Test
			public void searchwishlist() 
			{
				wl.searchlist();
			}
			@Test
			public void homewishlist()
			{
				wl.homelist();
			}

	}



