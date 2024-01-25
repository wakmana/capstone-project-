package sauce.scenarios.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauce.scenarios.pages.CheckOutOverViewScen4;
import sauce.scenarios.pages.LoginPageScen4;
import sauce.scenarios.pages.PersonalInfoScen4;
import sauce.scenarios.pages.ProductsScen4;
import sauce.scenarios.pages.SuccessMessageScen4;
import sauce.scenarios.pages.YourCartScen4;

public class VerificationScenario4Test extends BaseTest {
	
	@Test
	public void VerifySuccessMessage() {
		
		LoginPageScen4 loginPage4=new LoginPageScen4(driver);
		loginPage4.enterUserName("standard_user");
		loginPage4.enterPassword("secret_sauce");
		loginPage4.clickLoginBtn();
		
		ProductsScen4 product4=new ProductsScen4(driver);
		product4.clickSortBtn();
		product4.clickAddToCartBtn();
		product4.clickCartIcon();
		
		WebElement selectedItem=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		Assert.assertTrue(selectedItem.isDisplayed());
		
		YourCartScen4 cart4=new YourCartScen4(driver);
		cart4.clickCheckOutBtn();
		
		PersonalInfoScen4 personalInfo4=new PersonalInfoScen4(driver);
		personalInfo4.enterFirstNameTextBox("barakat");
		personalInfo4.enterLastNameTextBox("wakman");
		personalInfo4.enterZipCode("44111");
		personalInfo4.clickContinueBtn();
		
		CheckOutOverViewScen4 finish4=new CheckOutOverViewScen4(driver);
		finish4.clickFinishBtn();
		
		SuccessMessageScen4 successMessage4=new SuccessMessageScen4(driver);
		
		String expectedSuccessMsg="Thank you for your order!";
		String actualSuccessMsg=successMessage4.getSuccessMsg();
		Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
		
	
		
		
	}

}
