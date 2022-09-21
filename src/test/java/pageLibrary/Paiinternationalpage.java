package pageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.BaseClass;

public class Paiinternationalpage extends BaseClass {
	public Paiinternationalpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class=\"fas fa-sign-in-alt mr-1\"]")
	private WebElement ClickLogin;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement Username;

	@FindBy(xpath = "//input[@id='login_password']")
	private WebElement Password;

	@FindBy(xpath = "//button[@id='login_submit']")
	private WebElement ClickSignin;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement Searchproduct;

	@FindBy(xpath = "//h3/a[1]")
	private WebElement ClickProduct;

	@FindBy(xpath = "//button[@id='addToCartButton']")
	private WebElement AddproductIntocart;

	@FindBy(xpath = "//img[@alt=\"pai-cart\"]")
	private WebElement CartIcon;

	@FindBy(xpath = "//button[text()=\"Proceed to Checkout\"]")
	private WebElement checkout;

	public WebElement getClickLogin() {
		return ClickLogin;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getClickSignin() {
		return ClickSignin;
	}

	public WebElement getSearchproduct() {
		return Searchproduct;
	}

	public WebElement getClickProduct() {
		return ClickProduct;
	}

	public WebElement getAddproductIntocart() {
		return AddproductIntocart;
	}

	public WebElement getCartIcon() {
		return CartIcon;
	}

	public WebElement getCheckout() {
		return checkout;
	}

}
