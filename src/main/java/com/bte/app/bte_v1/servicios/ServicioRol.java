package com.bte.app.bte_v1.servicios;

import com.bte.app.bte_v1.dto.CarreraDto;
import com.bte.app.bte_v1.dto.RolDto;
import com.bte.app.bte_v1.entities.Rol;
import com.bte.app.bte_v1.repository.IRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioRol {
    @Autowired
    private IRol db;

    public List<Rol> selectAll(){
        return db.listaRol();
    }

    public Integer registrarRol(RolDto rol){
        return this.db.registrarRol(
                rol.getNombre());
    }
    public void eliminarRol(Integer id){

    }
}
