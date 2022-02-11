package com.example.demo.Provincia;

class ProvinciaNotFoundException extends RuntimeException {

    ProvinciaNotFoundException(Integer id) {
      super("No se encontro la provincia " + id);
    }
  }
