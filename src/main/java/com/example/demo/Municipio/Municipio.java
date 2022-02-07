package com.example.demo.Municipio;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="Municipios")
public class Municipio {
    
  @Id
  @Column(name="MunicipioID")
  public Long MunicipioID;

  @Column(name = "Nombre", columnDefinition = "VARCHAR(45)")
  public String Nombre;

    Municipio() {}
    
    Municipio(Long MunicipioID, String Nombre){
       this.MunicipioID = MunicipioID;
       this.Nombre = Nombre; 
    }
  
  public Long getMunicipioID() {
    return this.MunicipioID;
  }

  
  public String getNombre() {
    return this.Nombre;
  }

  public void setMunicipioID(Long MunicipioID) {
    this.MunicipioID = MunicipioID;
  }

  public void setNombre(String Nombre) {
    this.Nombre = Nombre;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Municipio))
      return false;
      Municipio municipio = (Municipio) o;
    return Objects.equals(this.MunicipioID, municipio.MunicipioID) && Objects.equals(this.Nombre, municipio.Nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.MunicipioID, this.Nombre);
  }

  @Override
  public String toString() {
    return "Municipio{" + "id=" + this.MunicipioID + ", name='" + this.Nombre +'}';
  }

}