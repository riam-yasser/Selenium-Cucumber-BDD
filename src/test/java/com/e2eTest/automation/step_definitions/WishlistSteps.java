package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.WishlistPage;
import com.e2eTest.automation.utils.ActionsUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistSteps {

	WishlistPage wishlistPage = new WishlistPage();
	ActionsUtils actionsUtils = new ActionsUtils();
	
	@When("Je click sur le boutton wishlist")
	public void jeClickSurLeBouttonWishlist() {
		actionsUtils.click(WishlistPage.getWishListBarMenuButton());

	}

	@Then("Je vois la liste des produits qui sont dans la wishlist")
	public void jeVoisLaListeDesProduitsQuiSontDansLaWishlist() {
		WishlistPage.getWishListPage();
	}

}
