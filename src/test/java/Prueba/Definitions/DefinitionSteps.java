package Prueba.Definitions;

import org.openqa.selenium.WebDriver;

import Prueba.Paginas.Dropdown;
import Prueba.Paginas.Login;
import Prueba.Steps.Botones;
import Prueba.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DefinitionSteps {
	
	private WebDriver driver;
	private Conexion  conexion;
	private Login login;
	private Dropdown dropdown;
	
	
	@Given("^abrir el navegador$")
	public void abrir_navegador() {		
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	
	@And("^Diligenciar los campos Username (.*) y Password (.*)$")
	public void diligenciarCampos(String UsernameP, String PasswordP) 
	{
		
		
			this.login = new Login(driver);
			this.login.iniciarsesion(UsernameP, PasswordP);
		
	}
	
	
	@Given("^abrir pagina Dropdown$")
	public void abrir_navegador_Dropdown() {		
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegadorDropdown();

	}
	
	@And("^Seleccionar de la lista$")
	public void seleccionar_de_la_lista() throws InterruptedException  {
		
		this.dropdown = new Dropdown(driver);		
		this.dropdown.logM();

	   
	}
	
	
}



