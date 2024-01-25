package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewScen5 {
	
	@FindBy(id="finish")
	private WebElement finishBtn;
	
	public CheckOutOverViewScen5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickFinishBtn() {
		finishBtn.click();
	}

}
