package br.com.izabelrodrigues.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe de configuração do SpringBoot
 * @author Izabel Rodrigues
 *
 */
@SpringBootApplication(scanBasePackages={Constants.BASE_PACKAGE})
public class Config {

	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
	}

}
