package com.bte.app.bte_v1.repository;

import com.bte.app.bte_v1.entities.Materia;
import com.bte.app.bte_v1.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRol extends JpaRepository<Rol, Integer> {
    @Query(value = "{ call SP_Rol_SE () }",nativeQuery = true)
    List<Rol> listaRol();

    @Query(value = "{ call SP_Rol_IN (:name) }",nativeQuery = true)
    Integer registrarRol(
            @Param("name")String nombre);

    @Query(value = "{ call SP_Rol_DE (:id) }",nativeQuery = true)
    Integer eliminarRol(@Param("id")Integer id);
}
