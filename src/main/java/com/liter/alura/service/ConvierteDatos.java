package com.liter.alura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos {

    private ObjectMapper mapper = new ObjectMapper();

    public <T> T convertir(String json, Class<T> clase) {
        try {
            return mapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error al convertir JSON: " + e.getMessage());
        }
    }
}
