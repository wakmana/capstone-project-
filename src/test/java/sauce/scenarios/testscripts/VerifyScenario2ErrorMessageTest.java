package sauce.scenarios.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauce.scenarios.pages.LoginPageScen2;


public class VerifyScenario2ErrorMessageTest extends BaseTest {
	
	@Test
	public void verifyErrMsg() {
		
		LoginPageScen2 loginPage2=new LoginPageScen2(driver);
		loginPage2.enterUserName("locked_out_user");
		loginPage2.enterPassword("secret_sauce");
		loginPage2.clickLoginBtn();
		String expectedErrMsg="Epic sadface: Sorry, this user has been locked out.";
		String actualErrMsg=loginPage2.getErrorMessage();
		Assert.assertEquals(actualErrMsg,expectedErrMsg);
	}

}
