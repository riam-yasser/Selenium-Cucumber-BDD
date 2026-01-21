package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.FacebookPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSteps {

	FacebookPage facebookPage = new FacebookPage();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();

	@When("Je click sur le boutton Facebook")
	public void jeClickSurLeBouttonFacebook() {
	    actionsUtils.click(FacebookPage.getFacebookButton());
	    
	}
	
	@Then("Je me redirige vers La page Facebook de l'application")
	public void jeMeRedirigeVersLaPageFacebookDeLApplication() {
	 
	}



}
