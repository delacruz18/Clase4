package Prueba.Paginas;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.gargoylesoftware.htmlunit.javascript.host.Element;
import Prueba.Steps.Botones;
import net.thucydides.core.annotations.Step;




public class Login {
	
	
	private WebDriver driver;
	
	
	private Botones botones = new Botones (driver);
	
	
	
	

	
	@FindBy(how = How.ID, using = "login_field")
	private WebElement User;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement password;
	
	@FindBy(how = How.NAME, using = "commit")
	private WebElement Enviar;
	
	
	

	public Login (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Botones(driver);
		
	}
				
		

		@Step 
		public void iniciarsesion (String UsernameP, String Password) {
			
			
			User.sendKeys("delacruzdcp11@gmail.com");
		
			password.sendKeys("Delacruz2021*");
			Enviar.click();
			
			
		}

}
