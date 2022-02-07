package com.example.demo.Municipio;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MunicipioController {

  private final MunicipioRepository repository;

  MunicipioController(MunicipioRepository repository) {
    this.repository = repository;
  }


  @GetMapping("/municipios")
  List<Municipio> all() {
    return repository.findAll();
  }
  
  @GetMapping("/provincias/{id}/municipios")
  Municipio one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new MunicipioNotFoundException(id));
  }
}
