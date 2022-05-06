package org.mainclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.Keys;
import org.pojoclass.GmailRegisters;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmailRegist extends BaseClass {
	GmailRegisters s1;

@Given("The user should be in google page")
public void the_user_should_be_in_google_page() {
	chromeLounch();
    urlLounch("https://www.google.com/");
    implicitwait();
}

@When("The user has to click searchbar and enter gmail")
public void the_user_has_to_click_searchbar_and_enter_gmail() {
	 s1 = new GmailRegisters();
	 sendkeysValue(s1.getSearch(), "gmail", Keys.ENTER);

}

@When("The user has to click gmail first link")
public void the_user_has_to_click_gmail_first_link() {
    click(s1.getClickGmailFirstLink());

}

@Then("The user has to click create an account button")
public void the_user_has_to_click_create_an_account_button() {
	   click(s1.getClickCreateAccountButton());

}





}
