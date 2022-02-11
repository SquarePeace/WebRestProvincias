package com.example.demo.Municipio;

class MunicipioNotFoundException extends RuntimeException {

    MunicipioNotFoundException(Integer id) {
      super("No se encontro el Municipio " + id);
    }
  }
