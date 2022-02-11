package com.example.demo;

import com.example.demo.Municipio.Municipio;

import javax.persistence.*;

@Entity
@Table(name = "DistritosMunicipales")
public class DistritoMunicipal {
    @Id
    @Column(name = "DistritoID", nullable = false)
    private Integer id;

    @Column(name = "Nombre", length = 45)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MunicipioID")
    private Municipio municipios;

    public Municipio getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Municipio municipios) {
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