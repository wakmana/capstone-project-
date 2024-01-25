package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartScen3 {
	
	@FindBy(id="checkout")
	private WebElement checkOutBtn;
	
	public YourCartScen3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickCheckOutBtn() {
		checkOutBtn.click();
	}

}
