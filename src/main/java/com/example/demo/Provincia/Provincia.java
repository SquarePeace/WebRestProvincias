package com.example.demo.Provincia;

import com.example.demo.Municipio.Municipio;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Provincias")
public class Provincia {
    @Id
    @Column(name = "ProvinciaID", nullable = false)
    private Integer id;

    @Column(name = "Nombre", length = 45)
    private String nombre;

    @JsonManagedReference
    @OneToMany(mappedBy = "provinciaID")
    private Set<Municipio> municipios = new LinkedHashSet<>();

    public Set<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Set<Municipio> municipios) {
        this.municipios = municipios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}