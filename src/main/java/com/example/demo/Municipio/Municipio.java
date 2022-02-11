package com.example.demo.Municipio;

import com.example.demo.Provincia.Provincia;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "Municipios")
public class Municipio {
    @Id
    @Column(name = "MunicipioID", nullable = false)
    private Integer id;

    @Column(name = "Nombre", length = 45)
    private String nombre;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProvinciaID")
    private Provincia provinciaID;

    public Provincia getProvinciaID() {
        return provinciaID;
    }

    public void setProvinciaID(Provincia provinciaID) {
        this.provinciaID = provinciaID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}