package com.bte.app.bte_v1.servicios;

import com.bte.app.bte_v1.dto.MateriaDto;
import com.bte.app.bte_v1.entities.Materia;
import com.bte.app.bte_v1.repository.IMateria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioMateria {
    @Autowired
    private IMateria db;

    public List<Materia> selectAll(){
        return db.listaMateria();
    }

    public Integer registrarMateria(MateriaDto materia){
        return this.db.registrarMateria(
                materia.getIdCarrera(),
                materia.getIdSemestre(),
                materia.getNombre(),
                materia.getClave(),
                materia.getHT(),
                materia.getHP());
    }
    public void eliminarMateria(Integer id){

    }
}
