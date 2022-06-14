package com.bte.app.bte_v1.repository;

import com.bte.app.bte_v1.entities.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarrera extends JpaRepository<Carrera, Integer> {
    @Query(value = "{ call SP_Carrera_SE () }",nativeQuery = true)
    List<Carrera> listaCarrera();

    @Query(value = "{ call SP_Carrera_IN (:name,:clave,:especialidad) }",nativeQuery = true)
    Integer registrarCarrera(
            @Param("name")String nombre,
            @Param("clave")String clave,
            @Param("especialidad")String especialidad);

    @Query(value = "{ call SP_Carrera_DE (:id) }",nativeQuery = true)
    Integer eliminarCarrera(@Param("id")Integer id);
}
