package com.bte.app.bte_v1.repository;

import com.bte.app.bte_v1.entities.Rol;
import com.bte.app.bte_v1.entities.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISemestre extends JpaRepository<Semestre, Integer> {
    @Query(value = "{ call SP_Semestre_SE () }",nativeQuery = true)
    List<Semestre> listaSemestre();

    @Query(value = "{ call SP_Semestre_IN (:name) }",nativeQuery = true)
    Integer registrarSemestre(
            @Param("name")String nombre);

    @Query(value = "{ call SP_Semestre_DE (:id) }",nativeQuery = true)
    List<Semestre> eliminarSemstre(@Param("id")Integer id);
}
