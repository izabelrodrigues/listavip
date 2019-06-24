# Projeto LISTAVIP

Projeto de estudos sobre conceitos básicos do SpringBoot realizado no Curso da Alura: 


SPRING BOOT: AGILIDADE NO DESENVOLVIMENTO JAVA COM SPRING

### Requisitos:

* Maven

* Banco de dados : POSTGRESQL10

* Java 8

* Projeto auxiliar de envio de e-mail:  https://github.com/izabelrodrigues/email

### Como executar o projeto:

 * Você pode executar ou pelo Eclipse ou pelo terminal.

	1 - Clone os dois projetos (listavip e o o projeto auxiliar de envio de email)
	
	https://github.com/izabelrodrigues/listavip.git   
	https://github.com/izabelrodrigues/email.git
	
	2 - Execute os scripts de criação do banco que estão em src/main/resources/scripts na ordem que se encontram. 
				
	3 - Pelo Eclipse:
	 Abra a classe Config , clique com o botão direito e execute Run As -> Java Applicatiton
	 
	4 - Pelo terminal:
		No diretório do projeto, execute mvn package;
		Acesse a pasta target (cd target) e execute java -jar listavip-0.0.1-SNAPSHOT.jar
		
O projeto é executado em http://localhost:9000