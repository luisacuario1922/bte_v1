package com.bte.app.bte_v1.servicios;

import com.bte.app.bte_v1.dto.UserDto;
import com.bte.app.bte_v1.entities.User;
import com.bte.app.bte_v1.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioUsuarios {
    @Autowired
    private IUser db;

    public List<User> selectAll(){
        return db.listaUsuarios();
    }

    public Integer registrarUsuario(UserDto user){
        return this.db.registrarUsuario(
                user.getIdRol(),
                user.getNombre(),
                user.getApellidos(),
                user.getEmail(),
                user.getPassword());
    }
    public String eliminarUsuario(Integer id){
        return db.eliminarUsuarios(id);
    }
}
