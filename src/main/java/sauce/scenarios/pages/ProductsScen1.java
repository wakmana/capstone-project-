package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsScen1 {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart1;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement addToCart2;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	public ProductsScen1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickAddToCartBtn1() {
	 addToCart1.click();
	}
	public void clickAddToCart2() {
		addToCart2.click();
	}
	public void clickCartIcon() {
		cartIcon.click();
	}
	
	
}
