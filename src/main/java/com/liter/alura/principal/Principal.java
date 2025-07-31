package com.liter.alura.principal;

import com.liter.alura.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Principal implements CommandLineRunner {

    private final String URL = "https://gutendex.com/books/";
    private ConsumoAPI consumo = new ConsumoAPI();

    @Override
    public void run(String... args) {
        System.out.println("Conectando a la API Gutendex...");
        String respuesta = consumo.obtenerDatos(URL + "?search=tolstoy");
        System.out.println("Respuesta de la API:");
        System.out.println(respuesta.substring(0, 500) + "...");
    }
}
