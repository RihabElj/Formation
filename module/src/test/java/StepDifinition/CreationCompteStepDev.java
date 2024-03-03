package StepDifinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageAcceuil;
import pageObject.PageFormulaire;

public class CreationCompteStepDev {
	
	WebDriver driver=SetUp.driver;
	
	//initialisation des pages objects
	PageAcceuil acceuil=new PageAcceuil(driver);
	PageFormulaire formule =new PageFormulaire(driver);

	private Object string;
	
	
	@Given("saisir URL de site:{string}")
	public void saisir_url_de_site(String string) {
		acceuil.saisieURL(string);
	}
	@When("click to Signup_login")
	public void click_to_signup_login() {
	    acceuil.cliqueBT_signup1();
	}

	@When("whrite Name {string}")
	public void whrite_name(String string) {
	    acceuil.creerName(string);
	}

	@When("whrite mail\"tesstin@gmail.com\"")
	public void whrite_mail_tesstin_gmail_com() {
	    acceuil.creermail();
	}

	@When("Click to the buton signup")
	public void click_to_the_buton_signup() {
		acceuil.bt_signup2();

	    	}

	@Then("Vérification information account")
	public void vérification_information_account() {
	    
	}

	@When("fill title")
	public void fill_title() {
		formule.cliquer_BT_title();  
	}

	@When("fillpassword\"cisco123\"")
	public void fill_password_rihab123() {
	    formule.saisir_Pass(string);
	}

	@When("fill date of birth {string} , {string} et {string}")
	public void fill_date_of_birth(String string1,String string2,String string3) {
	    formule.select_day(string1);
	    formule.select_Month(string2);
	    formule.select_Year(string3);
	}

	@When("Select checkbox Sing up newsletter")
	public void select_checkbox_sing_up_newsletter() {
	    
	}

	@When("Select checkbox Receive special offers partners")
	public void select_checkbox_receive_special_offers_partners() {
	    
	}

	@When("fill Firts name:{string},Last name:{string} ,Company:{string},Adresse:{string},Adresse2:{string}")
	public void fill_firts_name_last_name_company_adresse_adresse2(String string, String string2, String string3, String string4, String string5) {
	    formule.saisir_First_Name(string);
	    formule.saisir_Last_Name(string2);
	    formule.saisir_company(string3);
	    formule.saisir_Adress1(string4);
	    formule.saisir_Adress2(string5);
	}

	@When("fill again Country:{string},State:{string},City:{string},Zipcode:{string},Mobile Number:{string}")
	public void fill_again_country_state_city_zipcode_mobile_number(String string, String string2, String string3, String string4, String string5) {
	 formule.select_Country(string);
	 formule.saisir_State(string2);
	 formule.saisir_city(string3);
	 formule.saisir_Zipcode(string4);
	 formule.saisir_Mobile(string5);
	}

	@When("click Create Account button")
	public void click_create_account_button() {
		formule.clique_create_button();  
	}

	@Then("Verify that {string} is visible")
	public void verify_that_account_created_is_visible(String string) {
	    Assert.assertTrue(formule. resultat_obtenu().contains(string));
	}


}
