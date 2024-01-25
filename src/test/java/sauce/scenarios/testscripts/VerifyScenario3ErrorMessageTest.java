package sauce.scenarios.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauce.scenarios.pages.ErrorMessageScen3;
import sauce.scenarios.pages.LoginPageScen3;
import sauce.scenarios.pages.PersonalInfoScen3;
import sauce.scenarios.pages.ProductsScen3;
import sauce.scenarios.pages.YourCartScen3;

public class VerifyScenario3ErrorMessageTest extends BaseTest {
	
	@Test
	public void verifyErrMsg() {
		
		LoginPageScen3 loginPage3=new LoginPageScen3(driver);
		loginPage3.enterUserName("problem_user");
		loginPage3.enterPassword("secret_sauce");
		loginPage3.clickLoginBtn();
		
		ProductsScen3 product3=new ProductsScen3(driver);
		product3.clickAddToCart();
		product3.clickCartIconButn();
		
		YourCartScen3 cart3=new YourCartScen3(driver);
		cart3.clickCheckOutBtn();
		
		PersonalInfoScen3 personalInfo3=new PersonalInfoScen3(driver);
		personalInfo3.enterFirstName("Ferduas");
		personalInfo3.enterLastname("wakman");
		personalInfo3.enterZipCode("44111");
		personalInfo3.clickContinueBtn();
		
		ErrorMessageScen3 errorMessage3=new ErrorMessageScen3(driver);
		
		String expectedErrMsg="Error: Last Name is required";
		String actualErrMsg=errorMessage3.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}

}
