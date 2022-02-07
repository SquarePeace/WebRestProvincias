package com.example.demo.Provincia;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.Municipio.Municipio;

@Entity
@Table(name = "Provincias")
public class Provincia {
  
  @OneToMany(mappedBy="Provincias")
  public Set<Municipio> municipios;
    
  @Id
  @Column(name = "provinciaID")
  public Long provinciaID;

  @Column(name = "Nombre")
  public String Nombre;

  public Provincia() {}

  public Provincia(Long provinciaID, String Nombre) {
    this.provinciaID = provinciaID;
    this.Nombre = Nombre;
  }
  
  public Long getProvinciaID() {
    return this.provinciaID;
  }

  public String getNombre() {
    return this.Nombre;
  }

  public void setProvinciaID(Long provinciaID) {
    this.provinciaID = provinciaID;
  }

  public void setNombre(String Nombre) {
    this.Nombre = Nombre;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Provincia))
      return false;
      Provincia provincia = (Provincia) o;
    return Objects.equals(this.provinciaID, provincia.provinciaID) && Objects.equals(this.Nombre, provincia.Nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.provinciaID, this.Nombre);
  }

  @Override
  public String toString() {
    return "Provincia{" + "id=" + this.provinciaID + ", name='" + this.Nombre +'}';
  }
}

