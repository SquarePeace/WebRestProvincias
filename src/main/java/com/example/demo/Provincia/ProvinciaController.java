package com.example.demo.Provincia;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ProvinciaController {

  @Autowired
  private final ProvinciaRepository repository;

  ProvinciaController(ProvinciaRepository repository) {
    this.repository = repository;
  }


  @GetMapping("/provincias")
  List<Provincia> all() {
    return repository.findAll();
  }

  @GetMapping("/provincia/{id}")
  Provincia one(@PathVariable Integer id) {
    return repository.findById(id)
      .orElseThrow(() -> new ProvinciaNotFoundException(id));
  }

  @GetMapping("/provincias/{id}/distritos_municipales")
  Provincia two(@PathVariable Integer id) {
    return repository.findDistritoByProvincia(id);
  }
}
