package com.example.demo.Municipio;

class MunicipioNotFoundException extends RuntimeException {

    MunicipioNotFoundException(Long id) {
      super("No se encontro el Municipio " + id);
    }
  }
