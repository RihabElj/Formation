package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PageAcceuil {
	WebDriver driver;
//creation de conctructeur
	public PageAcceuil (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//identification des elements
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Signup/login']")
	public static WebElement bt_signup1;
	
	@FindBy(how=How.NAME,using="name")
	public static WebElement Name;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='signup-email']")
	public static WebElement Mail;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Signup']")
	public static WebElement bt_signup2;
	
	//creation des methodes
	
	public void saisieURL(String URL) {
		driver.get(URL);
		
	}
	
	
	public void cliqueBT_signup1() {
		bt_signup1.click();
	}
	public void creerName(String text) {
		ecrire(Name,text);
	}
	public void ecrire(WebElement element,String text) {
		element.sendKeys(text);
	}
   public void creermail(String text) {
	   Mail.sendKeys(text);
   }
	
	public void cliqueBT_signup2() {
		bt_signup2.click();
	}


	public void bt_signup2() {
		// TODO Auto-generated method stub
		
	}


	public void creermail() {
		// TODO Auto-generated method stub
		
	}


	


	
}


