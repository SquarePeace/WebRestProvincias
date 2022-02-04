package com.example.demo.Provincia;

class ProvinciaNotFoundException extends RuntimeException {

    ProvinciaNotFoundException(Long id) {
      super("No se encontro la provincia " + id);
    }
  }
