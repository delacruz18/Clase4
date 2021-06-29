package Prueba.Paginas;

import Prueba.Steps.Botones;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import net.thucydides.core.annotations.Step;


public class Dropdown {
	
	private WebDriver driver;	
	private Botones botones = new Botones (driver);
	
	
	
	
		
	@FindBy(how = How.NAME, using = "userName")
	private WebElement Uname;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement UnPass1;
	
	
	@FindBy(how = How.NAME, using = "submit")
	private WebElement submit;
	
	@FindBy(how = How.LINK_TEXT, using = "Flights")
	private WebElement vuelos;
	
	@FindBy(how = How.NAME, using = "passCount")
	private WebElement pass;
	
	@FindBy(how = How.TAG_NAME, using = "4")
	private WebElement cantidad;
	
	@FindBy(how = How.NAME, using = "fromPort")
	private WebElement destino;
	
	
		public Dropdown (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Botones(driver);
	
											}
		

		@Step 
		public void logM () throws InterruptedException {
			
			Uname.sendKeys("qualityadmin");
			UnPass1.sendKeys("Pass1");
			submit.click();
			vuelos.click();
			pass.click();	
			Thread.sleep(3000);
			new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("4");
			destino.click();
			Thread.sleep(3000);
			new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Portland");
			destino.click();
		
									
		}

    	

		

}
