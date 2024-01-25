package sauce.scenarios.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauce.scenarios.pages.CheckOutOverViewScen5;
import sauce.scenarios.pages.CustomerInfoScen5;
import sauce.scenarios.pages.LoginPageScen5;
import sauce.scenarios.pages.ProductsScen5;
import sauce.scenarios.pages.ShoppingCartScen5;
import sauce.scenarios.pages.SuccessMessageScen5;
import sauce.scenarios.pages.YourCartScen5;
public class VerificationScenario5Test extends BaseTest{
	
	@Test(priority=1)
	public void verifyText() {
		
		LoginPageScen5 loginPage5=new LoginPageScen5(driver);
		loginPage5.enterUserName("standard_user");
		loginPage5.enterPassword("secret_sauce");
		loginPage5.clickLoginBtn();
		
	    ProductsScen5 product5=new ProductsScen5(driver);
		product5.addToCartFirstItem();
		product5.addToCartThirdItem();
		product5.removeFirstItemFromCart();
		product5.clickCartIcon();
		
		YourCartScen5 yourCart5=new YourCartScen5(driver);
		String expectedText="Your Cart";
		String actualText=yourCart5.getTextYourCart();
		Assert.assertEquals(actualText, expectedText);
	}
	@Test(priority=2)
	public void verifyNumberOfItems() {
		YourCartScen5 yourCart5=new YourCartScen5(driver);
		yourCart5.clickContinueShoppingBtn();
		
		 ProductsScen5 product5=new ProductsScen5(driver);
		 product5.clickSortBtn();
		 product5.addToCartExpensiveItem();
		 product5.clickCartIcon();
		
		ShoppingCartScen5 shopping5=new ShoppingCartScen5(driver);
		int expectedItemCount=2;
		int actualItemCount=shopping5.getCartItemCount();
       Assert.assertEquals(actualItemCount,  expectedItemCount);
        
	}
		@Test(priority=3)
		public void verifySuccessMsg() {
			YourCartScen5 yourCart5=new YourCartScen5(driver);
			yourCart5.clickCheckOutbtn();
			
			CustomerInfoScen5 customerInfo5=new CustomerInfoScen5(driver);
			customerInfo5.enterFirstName("ali");
			customerInfo5.enterLastName("hussaini");
			customerInfo5.enterZipCode("44111");
			customerInfo5.clickContinueBtn();
			
			CheckOutOverViewScen5 finish5=new CheckOutOverViewScen5(driver);
			finish5.clickFinishBtn();
			
			SuccessMessageScen5 successMsg5=new SuccessMessageScen5(driver);
			String expectedSuccessMsg="Thank you for your order!";
			String actualSuccessMsg=successMsg5.getSuccessMsg();
			Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
		
	}
	
}
		
	