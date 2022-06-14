package com.bte.app.bte_v1.servicios;

import com.bte.app.bte_v1.dto.CarreraDto;
import com.bte.app.bte_v1.dto.SemestreDto;
import com.bte.app.bte_v1.entities.Carrera;
import com.bte.app.bte_v1.entities.Semestre;
import com.bte.app.bte_v1.repository.ICarrera;
import com.bte.app.bte_v1.repository.ISemestre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioSemestre {
    @Autowired
    private ISemestre db;

    public List<Semestre> selectAll(){
        return db.listaSemestre();
    }

    public Integer registrarSemestre(SemestreDto semestre){
        return this.db.registrarSemestre(
                semestre.getNombre());
    }
    public Integer eliminarSemestre(Integer id){
        return db.eliminarSemestre(id);
    }
}
