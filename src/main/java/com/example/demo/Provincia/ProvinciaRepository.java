package com.example.demo.Provincia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {

    @Query(value = "SELECT DistritoID as codigo, Nombre FROM dbo.DistritosMunicipales dm WHERE dm.MunicipioID IN (SELECT MunicipioID FROM dbo.Municipios m WHERE m.ProvinciaID = :id)", nativeQuery = true)
    Provincia findDistritoByProvincia(@Param("id") int id);
}
