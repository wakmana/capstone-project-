package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifySuccessMessageScen1 {
	
	@FindBy(xpath="//div[@class='complete-text']")
	private WebElement successMsg;
	
	public VerifySuccessMessageScen1(WebDriver driver) {
		PageFactory.initElements(driver, this);
  }
	public String getSuccessMsg() {
		String message=successMsg.getText();
		return message;
	}
	
}
