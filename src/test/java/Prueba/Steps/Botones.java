package Prueba.Steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.thucydides.core.annotations.Step;

public class Botones {
	private WebDriver driver;
	
	@FindBy(how = How.ID, using = "login_field")
	private WebElement User;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement password;
	
	@FindBy(how = How.NAME, using = "commit")
	private WebElement Enviar;
	
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
	
	@FindBy(how = How.NAME, using = "fromPort")
	private WebElement destino;
	
	
	
	
	
	public Botones(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		
	}
	
}
