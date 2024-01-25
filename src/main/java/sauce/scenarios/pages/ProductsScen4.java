package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsScen4 {
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement sortBtn;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	public ProductsScen4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickSortBtn() {
		Select slctLowToHighPrice=new Select(sortBtn);
		slctLowToHighPrice.selectByIndex(2);
	}
	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}
	public void clickCartIcon() {
		cartIcon.click();
	}
}
