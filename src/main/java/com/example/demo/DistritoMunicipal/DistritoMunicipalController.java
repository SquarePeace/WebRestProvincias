package com.example.demo.DistritoMunicipal;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DistritoMunicipalController {

    private final DistritoMunicipalRepository repository;

    DistritoMunicipalController(DistritoMunicipalRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/distritos_municipales")
    List<DistritoMunicipal> all() {
        return repository.findAll();
    }

    @GetMapping("/municipios/{id}/distritos_municipales")
    DistritoMunicipal one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new DistritoMunicipalNotFoundException(id));
    }
}