package Booking.Paginas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.gargoylesoftware.htmlunit.javascript.host.Element;

import Booking.Steps.BotonesPaginas;
import Booking.Steps.Questions;
import net.thucydides.core.annotations.Step;



public class EnviarCorreoPagina {
	
	private WebDriver driver;
	private BotonesPaginas botonesPaginas= new BotonesPaginas(driver);
	private Questions questions = new Questions (driver);
	
	@FindBy (how = How.XPATH, using="//input[@placeholder= 'Full Name']")
	private WebElement textoName;
	
	@FindBy (how = How.ID, using="userEmail")
	private WebElement textoCorreo;
	
	@FindBy (how = How.ID, using="currentAddress")
	private WebElement textocurrent;
	
	
	public EnviarCorreoPagina (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botonesPaginas =new BotonesPaginas(driver);
		this.questions = new Questions(driver);
	}
	
	
	
	@Step 
	public void registroCorreoM (String nombreP, String correoP, String currentP ) {
		
		textoName.sendKeys(nombreP);
		textoCorreo.sendKeys(correoP);
		textocurrent.sendKeys(currentP);	
		botonesPaginas.scrollBajarDos();
		botonesPaginas.btnEnviar();
		questions.assertDatos(nombreP);
		
		
	}
	
	@Step
	public void validacionCampos(String nombreP) {
		questions.assertDatos(nombreP);
	}
	
	}


