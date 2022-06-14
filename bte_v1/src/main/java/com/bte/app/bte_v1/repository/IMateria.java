package com.bte.app.bte_v1.repository;

import com.bte.app.bte_v1.entities.Carrera;
import com.bte.app.bte_v1.entities.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IMateria extends JpaRepository<Materia, Integer> {
    @Query(value = "{ call SP_Materia_SE () }",nativeQuery = true)
    List<Materia> listaMateria();

    @Query(value = "{ call SP_Materia_IN (:id_carrera,:id_semestre,:nombre,:clave,:ht,:hp) }",nativeQuery = true)
    Integer registrarMateria(
            @Param("id_carrera")Integer id_carrera,
            @Param("id_semestre")Integer id_semestre,
            @Param("nombre")String nombre,
            @Param("clave")String clave,
            @Param("ht")Integer ht,
            @Param("hp")Integer hp);

    @Query(value = "{ call SP_Materia_DE (:id) }",nativeQuery = true)
    Integer eliminarMateria(@Param("id")Integer id);
}
