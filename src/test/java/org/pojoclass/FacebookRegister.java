package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookRegister extends BaseClass {
	public FacebookRegister() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement createNewAccount;
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")
	private WebElement signup;

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public void setCreateNewAccount(WebElement createNewAccount) {
		this.createNewAccount = createNewAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getSignup() {
		return signup;
	}

	public void setSignup(WebElement signup) {
		this.signup = signup;
	}
	
	
	
	

}
