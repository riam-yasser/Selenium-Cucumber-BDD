package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.NewsLetterPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.WaitUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsLetterSteps {

	NewsLetterPage newsLetterPage = new NewsLetterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	Validations validations = new Validations();
	ActionsUtils actionsUtils = new ActionsUtils();

	@When("Je me redirige vers la rubrique newsletter")
	public void jeMeRedirigeVersLaRubriqueNewsletter() {
		NewsLetterPage.getNewsLetterBarMenu();
	}
	
	@When("Je saisis une adresse mail valide")
	public void jeSaisisUneAdresseMailValide() {
		NewsLetterPage.getEmailField().sendKeys(configFileReader.getProperty("home.email"));
	}
	
	@When("Je clique sur le bouton subscribe")
	public void jeCliqueSurLeBoutonSubscribe() {
		NewsLetterPage.getSubscribeButton().click();
	}
	
	@Then("Je vois un msg de confirmation {string}")
	public void jeVoisUnMsgDeConfirmation(String message) {
	      WaitUtils.waitForVisibility(NewsLetterPage.getConfirmationMessage(), 10 );
		  
		  validations.assertEquals(NewsLetterPage.getConfirmationMessage(), message);
		 
	}
}
