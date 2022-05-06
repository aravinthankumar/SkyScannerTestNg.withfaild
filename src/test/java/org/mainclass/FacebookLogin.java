package org.mainclass;

import org.baseclass.BaseClass;
import org.pojoclass.FacebookRegister;
import org.pojoclass.facebookLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin extends BaseClass {
	
	facebookLogin f;
	FacebookRegister cn;
	
	
	@When("The user has to enter {string} and {string}")
	public void the_user_has_to_enter_and(String user, String pass) {
		chromeLounch();
		implicitwait();
		urlLounch("https://www.facebook.com/");
		 f = new facebookLogin();
		 sendkeys(f.getUserName(), user);
		 sendkeys(f.getPassword(), pass);
	}

	@Then("The user has to click  login button")
	public void the_user_has_to_click_login_button() {
	   click(f.getLogin());
	}

	@When("The user has to click create new account")
	public void the_user_has_to_click_create_new_account() {
		chromeLounch();
		implicitwait();
		urlLounch("https://www.facebook.com/");
	    cn=new FacebookRegister();
		click(cn.getCreateNewAccount());
	}

	@When("The user should be enter {string} and {string}")
	public void the_user_should_be_enter_and(String first, String last) {
	    sendkeys(cn.getFirstName(), first);
	    sendkeys(cn.getLastname(), last);
	}

	@Then("The user has to click sign up")
	public void the_user_has_to_click_sign_up() {

		click(cn.getSignup());
	}



}
