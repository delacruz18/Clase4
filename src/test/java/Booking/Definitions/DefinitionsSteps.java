package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.CargarArchivoPagina;
import Booking.Paginas.EnviarCorreoPagina;
import Booking.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion;
	private EnviarCorreoPagina enviarCorreoPagina;
	private CargarArchivoPagina cargarArchivoPagina;
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	
	@And("^seleccionar el campo nombre (.*) y correo (.*) y currentAddress (.*)$")
	public void diligenciarNombreM(String nombreP, String correoP, String currentP) 
	{
		this.enviarCorreoPagina = new EnviarCorreoPagina(driver);
		this.enviarCorreoPagina.registroCorreoM(nombreP, correoP, currentP);
	}
	
	@Then("Se valida que los datos cumplen (.*)")
	public void validacion(String nombreP) {
	//	this.enviarCorreoPagina = new EnviarCorreoPagina(driver);
		this.enviarCorreoPagina.validacionCampos(nombreP);
	}
	
	@And("^llegar a cargar$")
	public void llegar() {
		this.cargarArchivoPagina = new CargarArchivoPagina(driver);
		this.cargarArchivoPagina.llegarUpload();

	}

}