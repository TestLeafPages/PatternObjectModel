package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		click(eleLogOut);
		return new LoginPage();
	}
	
	
	

}
