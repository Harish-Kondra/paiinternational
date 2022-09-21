package paiInternational_Test.com;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import pageLibrary.Paiinternationalpage;

public class Test_CheckOut extends BaseClass {
	Paiinternationalpage pp;

	@Test(priority = 1)
	public void Login() throws IOException {
		pp = new Paiinternationalpage(driver);
		pp.getClickLogin().click();
		pp.getUsername().sendKeys("kondraharish25@gmail.com");
		pp.getPassword().sendKeys("9848404246");
		pp.getClickSignin().click();

	}

	@Test(priority = 2)
	public void ProductCheckout() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		pp.getSearchproduct().sendKeys("oppo", Keys.ENTER);
		// Thread.sleep(3000);
		js.executeScript("arguments[0].click()", pp.getClickProduct());
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", pp.getAddproductIntocart());
		pp.getCartIcon().click();
		pp.getCheckout().click();

	}

}
