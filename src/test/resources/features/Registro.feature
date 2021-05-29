#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@curso
Feature: envio de correo Text box

Scenario Outline: envio de correo 
	Given abrir el navegador 
	And seleccionar el campo nombre <nombreP> y correo <correoP> y currentAddress <currentP>
	Then Se valida que los datos cumplen <nombreP>
	
	
	
	Examples:
|nombreP|correoP           |currentP|
|carlos |delacruz@gmail.com|cl 30 12 34|


@curso1
Scenario: carga
		Given abrir el navegador
		And llegar a cargar
		
		

	
