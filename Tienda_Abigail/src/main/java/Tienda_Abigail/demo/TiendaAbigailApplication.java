package Tienda_Abigail.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // <--- CORREGIDO: Solo se usa la anotación base
public class TiendaAbigailApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaAbigailApplication.class, args);
	}

}