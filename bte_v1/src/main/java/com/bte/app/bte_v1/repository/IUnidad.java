package com.bte.app.bte_v1.repository;

import com.bte.app.bte_v1.entities.Tema;
import com.bte.app.bte_v1.entities.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUnidad extends JpaRepository<Unidad, Integer> {
    @Query(value = "{ call SP_Unidad_SE () }",nativeQuery = true)
    List<Unidad> listaUnidad();

    @Query(value = "{ call SP_Unidad_IN (:id_materia,:nombre,:num) }",nativeQuery = true)
    Integer registrarUnidad(
            @Param("id_materia")Integer id_materia,
            @Param("nombre")String nombre,
            @Param("num")Integer num);

    @Query(value = "{ call SP_Unidad_DE (:id) }",nativeQuery = true)
    List<Unidad> eliminarUnidad(@Param("id")Integer id);
}
