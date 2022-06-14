package com.bte.app.bte_v1.repository;

import com.bte.app.bte_v1.entities.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITema extends JpaRepository<Tema, Integer> {
    @Query(value = "{ call SP_Tema_SE () }",nativeQuery = true)
    List<Tema> listaTema();

    @Query(value = "{ call SP_Tema_IN (:id_unidad,:id_padre,:nombre,:numTxt,:contenido) }",nativeQuery = true)
    Integer registrarTema(
            @Param("id_unidad")Integer id_unidad,
            @Param("id_padre")String id_padre,
            @Param("nombre")String nombre,
            @Param("numTxt")String numTxt,
            @Param("contenido")String contenido);

    @Query(value = "{ call SP_Tema_DE (:id) }",nativeQuery = true)
    List<Tema> eliminarTema(@Param("id")Integer id);
}
