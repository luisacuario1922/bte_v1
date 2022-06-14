package com.bte.app.bte_v1.servicios;

import com.bte.app.bte_v1.dto.CarreraDto;
import com.bte.app.bte_v1.entities.Carrera;
import com.bte.app.bte_v1.repository.ICarrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioCarrera {
    @Autowired
    private ICarrera db;

    public List<Carrera> selectAll(){
        return db.listaCarrera();
    }
    
    public Integer registrarCarrera(CarreraDto carrera){
        return this.db.registrarCarrera(
                carrera.getNombre(),
                carrera.getClave(),
                carrera.getEspecialidad());
    }
    public Integer eliminarCarrera(Integer id){
        return db.eliminarCarrera(id);
    }
}
