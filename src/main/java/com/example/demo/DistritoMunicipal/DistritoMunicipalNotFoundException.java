package com.example.demo.DistritoMunicipal;

class DistritoMunicipalNotFoundException extends RuntimeException {

    DistritoMunicipalNotFoundException(Integer id) {
        super("No se encontro el Distrito municipal " + id);
    }
}