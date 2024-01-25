package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorMessageScen3 {
	
	@FindBy(xpath="//div[@class='error-message-container error']")
	private WebElement errorMsg;
	
	public ErrorMessageScen3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public String getErrMsg() {
		String message=errorMsg.getText();
		return message;
	}

}
