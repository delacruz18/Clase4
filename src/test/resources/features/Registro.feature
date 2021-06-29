#Proyecto de pruebas y cargado en Github
#27/01/2020

@log
Feature: login

Scenario Outline: envio de correo 
	Given abrir el navegador 
	And Diligenciar los campos Username  <UsernameP> y Password <PasswordP> 
	Then Se valida que los datos cumplen <UsernameP>
	
	
	
	Examples:
|Username |Password |
|delacruzdcp11@gmail.com |Delacruz2021* |


@Drop
Scenario: Dropdown
		Given abrir pagina Dropdown
		And Seleccionar de la lista
		
		

	
