package Tienda_Abigail.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // <--- CORREGIDO: Solo se usa la anotación base
@ComponentScan (basePackages = {"Tienda_Abigail", "com.tienda"}) // cambios
public class TiendaAbigailApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaAbigailApplication.class, args);
	}

}
