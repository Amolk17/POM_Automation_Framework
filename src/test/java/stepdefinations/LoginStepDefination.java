package stepdefinations;

import java.util.List;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefination {

	//private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://spiceclub.spicejet.com/signup");
	}

	@Then("verify page title is {}")
	public void verify_page_title_is(String string) {
		String pageTitle = LoginPage.getPageTitle();
		System.out.println(pageTitle);
	}

	@Then("Verify the page filed are displayed")
	public void verify_the_page_filed_are_displayed(List<String> dataTable) {
		Assert.assertTrue(LoginPage.checkEnrollmentFields(dataTable));
	}
	@Then("select value {} from dropdown")
	public void selectValueFromDropdown(String dropdownValue) {
		LoginPage.selectDropDownValue(dropdownValue);
	}

}
