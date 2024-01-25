package sauce.scenarios.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauce.scenarios.pages.LoginPageScen1;
import sauce.scenarios.pages.OverViewScen1;
import sauce.scenarios.pages.PersonalInfoScen1;
import sauce.scenarios.pages.ProductsScen1;
import sauce.scenarios.pages.VerifySuccessMessageScen1;
import sauce.scenarios.pages.YourCartScen1;

public class VerifyScenario1SuccessMessageTest extends BaseTest {
	LoginPageScen1 login1;
	ProductsScen1 product1;
	
	@Test
	public void VerifyMsg() {
		login1=new LoginPageScen1(driver);
		login1.enterUserName("standard_user");
		login1.enterPassword("secret_sauce");
		login1.clickLoginBtn();
		
		product1=new ProductsScen1(driver);
		product1.clickAddToCartBtn1();
		product1.clickAddToCart2();
		product1.clickCartIcon();
		
		YourCartScen1 cart1=new YourCartScen1(driver);
		cart1.clickCheckOutBtn();
		
		PersonalInfoScen1 personalInfo1=new PersonalInfoScen1(driver);
		personalInfo1.enterFirstName("Hekmat");
		personalInfo1.enterLastname("Wakman");
		personalInfo1.enterZipCode("44111");
		personalInfo1.clickContinueBtn();
		
		OverViewScen1 overView1=new OverViewScen1(driver);
		overView1.clickFinishBtn();
		
		VerifySuccessMessageScen1 verifyMsg1=new VerifySuccessMessageScen1(driver);
		
		String expectedMsg="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualMsg=verifyMsg1.getSuccessMsg();
		Assert.assertEquals(actualMsg, expectedMsg);
		
	}

}
