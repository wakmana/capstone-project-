package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessMessageScen4 {
	
	@FindBy(xpath="//h2[@class='complete-header']")
	private WebElement successMsg;
	
	public SuccessMessageScen4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getSuccessMsg() {
		String message=successMsg.getText();
		return message;
	}

}
