package com.bte.app.bte_v1.servicios;

import com.bte.app.bte_v1.dto.TemaDto;
import com.bte.app.bte_v1.entities.Tema;
import com.bte.app.bte_v1.repository.ITema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioTema {
    @Autowired
    private ITema db;

    public List<Tema> selectAll(){
        return db.listaTema();
    }

    public Integer registrarTema(TemaDto carrera){
        return this.db.registrarTema(
                carrera.getIdUnidad(),
                carrera.getIdPadre(),
                carrera.getNombre(),
                carrera.getNumTxt(),
                carrera.getContenido()
                );
    }
    public void eliminarUsuario(Integer id){

    }
}
