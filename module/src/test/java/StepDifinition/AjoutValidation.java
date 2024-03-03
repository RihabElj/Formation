package StepDifinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutValidation {
	 
	WebDriver driver=SetUp.driver;
	//initialisation des pages objects
	AjoutValidation achat=new AjoutValidation(driver);
	

@When("choisir un article")
public void choisir_un_article() {
	public void choisir_un_article() {
		achat.choisir_un_article();
		achat.ajout_article();
	}
    
}

@When("cliquer regarde panier")
public void cliquer_regarde_panier() {
	public void cliquer_regarder_panier() {
    achat.achat
}

@When("cliquer sur check")
public void cliquer_sur_check() {
   
}

@When("cliquer sur place order")
public void cliquer_sur_place_order() {
   
}

@When("remplir name of card")
public void remplir_name_of_card() {
    
}

@When("remplir Card Number")
public void remplir_card_number() {
  
}

@When("Remplir CVC {string} , Expiration {string} et Annee {string}")
public void remplir_cvc_expiration_et_annee(String string, String string2, String string3) {
    
}

@When("cliquer sur Payer")
public void cliquer_sur_payer() {
   
}

@Then("vérification que le paiment est fait {string}")
public void vérification_que_le_paiment_est_fait(String string) {
 
}



}
