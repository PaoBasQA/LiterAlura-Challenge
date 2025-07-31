package com.liter.alura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class ConsumoAPI {

    private HttpClient client = HttpClient.newHttpClient();

    public String obtenerDatos(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al consumir la API: " + e.getMessage());
        }
    }
}
