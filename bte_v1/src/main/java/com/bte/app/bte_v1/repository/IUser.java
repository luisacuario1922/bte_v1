package com.bte.app.bte_v1.repository;

import com.bte.app.bte_v1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUser extends JpaRepository<User, Integer> {
    @Query(value = "{ call SP_Usuarios_SE () }",nativeQuery = true)
    List<User> listaUsuarios();

    @Query(value = "{ call SP_Usuarios_IN (:rol,:name,:ap,:email,:pass) }",nativeQuery = true)
    Integer registrarUsuario(
            @Param("rol") Integer rol,
            @Param("name")String nombre,
            @Param("ap")String apelliido,
            @Param("email")String email,
            @Param("pass")String password);

    @Query(value = "{ call SP_USUARIOS_DEL (:id) }",nativeQuery = true)
    String eliminarUsuarios(@Param("id")Integer id);
}